package io.jornadas.jwt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jornadas.jwt.model.Usuario;
import io.jornadas.jwt.security.JWTFilter;
import io.jornadas.jwt.service.IUsuarioService;

@RestController
@RequestMapping(path = "/api/v1/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@ResponseBody
	@GetMapping(path = "", produces = "application/json")
	public Usuario buscarPorId(HttpServletRequest request) {
		return this.usuarioService.buscarPorToken(JWTFilter.recuperaToken(request));
	}
}
