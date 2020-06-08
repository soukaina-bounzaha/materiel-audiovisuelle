package org.audio.materielAudiovisuelleBackend.dao;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dto.Evenement;


public interface IEvenementDAO {
	
	   Evenement get(int idEvenement);
	    List<Evenement> listEvenement();
		boolean add(Evenement evenement);
		boolean update(Evenement evenement);
		boolean delete(Evenement evenement);
	// Our Methods
		List<Evenement> listActiveEvenement();
		List<Evenement> listActiveEvenementByCategory(int categoryId);
		List<Evenement> getlatestActiveEvenement(int count);
}
