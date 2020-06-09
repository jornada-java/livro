package io.jornadas.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jornadas.jwt.dto.LoginDTO;
import io.jornadas.jwt.exception.NotFoundException;
import io.jornadas.jwt.security.JWTToken;
import io.jornadas.jwt.service.ILoginService;

@RestController
@RequestMapping(path = "/api/v1/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@ResponseBody
	@PostMapping(path = "", produces = "application/json")
	public JWTToken login(@RequestBody LoginDTO dto) throws NotFoundException {
		return this.loginService.login(dto);
	}
}
