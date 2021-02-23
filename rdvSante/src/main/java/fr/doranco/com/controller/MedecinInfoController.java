package fr.doranco.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedecinInfoController {
	
	@GetMapping(value="/acceuil")
	public String acceuil(Model m) {
		
		return "acceuil.jsp";
		
	}

}
