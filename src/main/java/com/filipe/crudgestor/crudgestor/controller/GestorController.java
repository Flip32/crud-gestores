package com.filipe.crudgestor.crudgestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.filipe.crudgestor.crudgestor.model.Gestor;
import com.filipe.crudgestor.crudgestor.service.GestorService;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class GestorController {
	
	@Autowired
	private GestorService gestorService;

	/*@GetMapping("/gestor")
	public List<Gestor> get() {
		return gestorService.get();
	}*/


//	GET
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("gestorList");
		mav.addObject("list", gestorService.get());
		return mav;
	}

//	ADD Form
	@RequestMapping("/mostraGestorFormulario")
	public ModelAndView mostraGestorFormulario() {
		ModelAndView mav = new ModelAndView("gestorAdd");
		mav.addObject("gestor", new Gestor());
		return mav;
	}

//	Save
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("gestor")@Valid Gestor gestorObj, BindingResult result) {
		String erroForm = "Preencha corretamente o formulario";
		if(result.hasErrors()) {
			if(gestorObj.getId() == null){
				System.out.println("algo deu errado sem id");
				return mostraGestorFormulario();
			}
			else {
				System.out.println("algo deu errado com id");
				return get(gestorObj.getId());
			}

		}
		//System.out.println("Deu tudo certo");
		ModelAndView mav = new ModelAndView("gestorList");
		gestorService.save(gestorObj);
		mav.addObject("list", gestorService.get());
		return mav;
	}

// Edit
	@RequestMapping("/gestor/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("gestorAdd");
		Gestor gestorObj = gestorService.get(id);
		if(gestorObj == null) {
			throw new RuntimeException("Gestor com id " +id+" não foi encontrado!");
		}
		mav.addObject("gestor", gestorObj);
		return mav;
	}

// Delete
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id){
		ModelAndView mav = new ModelAndView("gestorList");
		gestorService.delete(id);
		mav.addObject("list", gestorService.get());
		return mav;
	}

	/*@PutMapping("/gestor")
	public Gestor update(@RequestBody Gestor gestorObj) {
		gestorService.save(gestorObj);
		return gestorObj;
	}*/

}



