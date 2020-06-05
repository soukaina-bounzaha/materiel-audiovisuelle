package org.audio.materielaudiovisuelle.controller;

import org.audio.materielAudiovisuelleBackend.dao.ICategoryDAO;
import org.audio.materielAudiovisuelleBackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Autowired
	private ICategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", " Home");

		// on passe la liste des categories
		mv.addObject("categories", categoryDAO.listCategorys());

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	// methodes pour charger la list des evenements et la poser dans category

	@RequestMapping(value = { "/show/List/Evenement" })
	public ModelAndView showAllEvenements() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "List Evenement ");

		mv.addObject("categories", categoryDAO.listCategorys());

		mv.addObject("userClickAllEvenement", true);
		return mv;
	}

	@RequestMapping(value = { "/show/category/{idCategorie}/Evenement" })
	public ModelAndView showCategoryEvenement(@PathVariable("idCategorie") int idCategorie) {
		ModelAndView mv = new ModelAndView("page");

		// ICategoryDAO pour chercher une seule category

		Category category = null;
		category = categoryDAO.get(idCategorie);

		mv.addObject("title", category.getNomCategorie());

		// passer la liste des caterories
		mv.addObject("categories", categoryDAO.listCategorys());
		
		// passer une seule categorie
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryEvenement", true);
		return mv;
	}

}
