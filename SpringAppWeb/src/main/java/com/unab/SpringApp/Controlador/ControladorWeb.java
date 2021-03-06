package com.unab.SpringApp.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.SpringApp.DAO.BebidaDAO;
import com.unab.SpringApp.DAO.CategoriaDAO;
import com.unab.SpringApp.DAO.ComidaDAO;
import com.unab.SpringApp.Entidades.Bebida;
import com.unab.SpringApp.Entidades.Categoria;
import com.unab.SpringApp.Entidades.Comida;

@Controller
public class ControladorWeb {

	@Autowired
	private CategoriaDAO seDAO;

	
	@GetMapping("/")
	public String Inicio(Model m) {
		
		var Mcategoria = seDAO.findAll();
		
		m.addAttribute("categoria",Mcategoria);
		
		return"index";
		
	}


	 
	
}
