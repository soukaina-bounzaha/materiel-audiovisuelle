package org.audio.materielaudiovisuelle.controller;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dao.IEvenementDAO;
import org.audio.materielAudiovisuelleBackend.dto.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json/data")

public class JsonDataController {
	
	@Autowired
	private IEvenementDAO evenementDAO;

	@RequestMapping("/List/Evenement")
	@ResponseBody
	public List<Evenement> getAllEvenement(){
		
	return evenementDAO.listActiveEvenement();
		
	}
	
	@RequestMapping("/category/{idCategorie}/Evenement")
	@ResponseBody
	public List<Evenement> getEvenementByCategory(@PathVariable int idCategorie){
		
	return evenementDAO.listActiveEvenementByCategory(idCategorie);
		
	}
	
	
	
	
	
	
	
}
