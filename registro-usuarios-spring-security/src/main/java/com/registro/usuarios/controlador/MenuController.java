package com.registro.usuarios.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registro.usuarios.modelo.user;


@Controller


public class MenuController {
	@GetMapping("/Menu")
    
	   
	public String Menu(@ModelAttribute("usuario") user usuario) {
	        
		      
	return "Home/Menu.html";
	    }
	

    @GetMapping("/cursos")
    public String cursos() {
       
        return "Home/cursos.html"; 
    }

    @GetMapping("/notas")
    public String notas() {
        // 
        return "Home/notas.html"; 
    }

    @GetMapping("/horario")
    public String horario() {
       
        return "Home/horario.html"; 
    }
    @GetMapping("/Miperfil")
    public String Miperfil() {
       
        return "Home/Miperfil.html"; 
    }
    

}

	


