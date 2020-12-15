package com.unab.SpringApp.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.SpringApp.DAO.ComidaDAO;

@Controller

public class ControladorComida {
	
	@Autowired
	private ComidaDAO coDao;
	
	@GetMapping("/comida")
	public String comida(Model comidat) {
		
		var Mcomida = coDao.findAll();
		
		comidat.addAttribute("comida", Mcomida);

		
		return"comidasl";
	}
	

}
