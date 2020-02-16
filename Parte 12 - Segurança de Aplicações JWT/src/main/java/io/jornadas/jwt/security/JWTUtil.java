package io.jornadas.jwt.security;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

import io.jornadas.jwt.model.Usuario;

public class JWTUtil {

	/**
	 * Método para gerar o token
	 * 
	 * @param usuario com dados do usuário
	 * @return Retorna string com o token
	 */
	public static String gerarToken(Usuario usuario) {
		try {
			// Chave secreta
			final Algorithm algorithm = Algorithm.HMAC256("secret");
			final Builder builder = JWT.create();

			// Tempo de vida: data atual + 30min
			final Date tempo = new Date(System.currentTimeMillis() + 1800000);
			builder.withExpiresAt(tempo);

			// Payload
			builder.withSubject(usuario.getId().toString());
			builder.withIssuer("https://www.jornadas.io");
			builder.withClaim("name", usuario.getNome());
			builder.withClaim("login", usuario.getLogin());
			builder.withClaim("admin", true);
			return builder.sign(algorithm);
		} catch (JWTCreationException exception) {
			return "Erro ao gerar o token";
		}
	}

	/**
	 * Método para validar o token
	 * 
	 * @param token a ser validado
	 * @return Retorna true se o token foi valido e false se var invalido
	 */
	public static boolean verificaToken(String token) {
		try {
			if (token == null)
				throw new JWTVerificationException("Token inválido.");
			final Algorithm algorithm = Algorithm.HMAC256("secret");
			final JWTVerifier verifier = JWT.require(algorithm).build();
			verifier.verify(token);
			return true;
		} catch (TokenExpiredException exception) {
			throw new TokenExpiredException("Token expirado.");
		} catch (JWTVerificationException exception) {
			throw new JWTVerificationException("Token inválido.");
		}
	}

	/**
	 * Recupera o ID do usuario logado
	 * 
	 * @param token String do token
	 * @return Retorna o ID do usuario logado
	 */
	public static Long recuperaIdUsuario(String token) {
		DecodedJWT decode = JWT.decode(token);
		return Long.parseLong(decode.getSubject());
	}
}
