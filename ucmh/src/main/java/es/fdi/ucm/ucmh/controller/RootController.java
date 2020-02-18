package es.fdi.ucm.ucmh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
	
	@GetMapping("/")
	public String hola() {
		return "hola";
	}

}
