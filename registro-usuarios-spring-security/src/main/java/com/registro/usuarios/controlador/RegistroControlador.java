package com.registro.usuarios.controlador;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.modelo.user;
import com.registro.usuarios.servicio.UsuarioServicio;



@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion(Model model) {
		model.addAttribute("fechaActual", LocalDateTime.now());
		model.addAttribute("usuario",new user());
		return "login.html";
	}
	
	@GetMapping("/index")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index.html";
	}
	@GetMapping("/loginAdmin")
	public String loginAdmin(Model modelo) {
	
		return "loginAdmin.html";
	}
	@GetMapping("/admin")
	public String admin(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "admin.html";
	}
	

}