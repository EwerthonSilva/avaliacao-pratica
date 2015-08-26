package br.com.s2it.incubadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.s2it.incubadora.model.Dependentes;
import br.com.s2it.incubadora.service.DependentesService;

@Controller
@RequestMapping("/dependentes")
public class DependentesController {

	public static final String VIEW = "cadDependentes";
	
	@Autowired
	private DependentesService service;
	
	public ModelAndView save(Dependentes dependentes){
		service.save(dependentes);
		return listAll();
	}
	
	public ModelAndView listAll(){
		ModelAndView mdv = new ModelAndView(VIEW);
		mdv.addObject("dependentes", service.listAll());
		return mdv;
	}
}
