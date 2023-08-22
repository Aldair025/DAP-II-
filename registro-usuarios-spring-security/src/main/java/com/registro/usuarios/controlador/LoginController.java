package com.registro.usuarios.controlador;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.modelo.user;


@Controller
public class LoginController {
		
	@GetMapping("/Login")
	public String index(Model model) {
		model.addAttribute("fechaActual", LocalDateTime.now());
		model.addAttribute("usuario",new user());
		return "Home/Login.html";
	}
	

}