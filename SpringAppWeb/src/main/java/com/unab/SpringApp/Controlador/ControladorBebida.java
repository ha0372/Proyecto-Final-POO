package com.unab.SpringApp.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.SpringApp.DAO.BebidaDAO;
import com.unab.SpringApp.DAO.ComidaDAO;

@Controller
public class ControladorBebida {
	@Autowired
	private BebidaDAO deDao;
	
	@GetMapping("/bebida")
	public String Bebida(Model bebidat) {
		
		var Mbebida = deDao.findAll();
		
		bebidat.addAttribute("bebida", Mbebida);

		
		return"bebidah";
	}
}
