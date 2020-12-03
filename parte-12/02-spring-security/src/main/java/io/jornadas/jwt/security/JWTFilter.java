package io.jornadas.jwt.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.service.IUsuarioService;

public class JWTFilter extends OncePerRequestFilter {

    private IUsuarioService usuarioService;
    private UserDetailsService userDetailsService;

    public JWTFilter(IUsuarioService usuarioService, UserDetailsService userDetailsService) {
        this.usuarioService = usuarioService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
            FilterChain filterChain) throws ServletException, IOException {
        String token = recuperaToken(httpServletRequest);
        boolean ehValido = JWTUtil.verificaToken(token);
        if (ehValido) {
            autentica(token);
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

    private void autentica(String token) {
        Usuario usuario = usuarioService.buscarPorToken(token);
        UserDetails userDetails = userDetailsService.loadUserByUsername(usuario.getLogin());
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }

    public static String recuperaToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (StringUtils.hasText(token) && token.startsWith("Bearer ")) {
            return token.substring(7, token.length());
        }
        return null;
    }

}
