package net.natura.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.natura.model.Formulario;
import net.natura.model.Pedido;
import net.natura.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository repositorio;

	@GetMapping("/buscar")
	public String greetingForm(Model model) {
		model.addAttribute("formulario", new Formulario());
		model.addAttribute("lista", new ArrayList<Pedido>());
		return "index";
	}

	@PostMapping("/buscar")
	public String submeter(@ModelAttribute Formulario formulario, Model model) {
		System.out.println(formulario.getNmPedido());
		ArrayList<Pedido> lista = (ArrayList<Pedido>) repositorio.findPedido(formulario.getNmPedido());
		model.addAttribute("lista", lista);
		
		return "index";
	}

}
