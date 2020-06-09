package io.jornadas.jwt.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jornadas.jwt.exception.ErroResponse;

@Component
public class JWTFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException, TokenExpiredException {
		try {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			String URI = httpRequest.getRequestURI();
			if (!URI.equals("/api/v1/login")) {
				JWTUtil.verificaToken(recuperaToken(httpRequest));
			}
			filter.doFilter(request, response);
		} catch (Exception ex) {
			((HttpServletResponse) response).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			((HttpServletResponse) response).getWriter().write(
					new ObjectMapper().writeValueAsString(new ErroResponse(HttpStatus.UNAUTHORIZED, ex.getMessage())));
		}
	}

	public static String recuperaToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (StringUtils.hasText(token) && token.startsWith("Bearer ")) {
			return token.substring(7, token.length());
		}
		return null;
	}
}
