package br.com.s2it.incubadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.s2it.incubadora.model.Contribuinte;
import br.com.s2it.incubadora.service.ContribuinteService;

@Controller
@RequestMapping("/contribuinte") 
public class ContribuinteController {

	public static final String VIEW = "cadContribuinte";

	@Autowired
	private ContribuinteService service;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView save(Contribuinte contribuinte) {
		service.save(contribuinte);
		return listAll();
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView listAll() {

		ModelAndView mdv = new ModelAndView(VIEW);
		mdv.addObject("contribuintes", service.listAll());
		return mdv;
	}

}
