package org.audio.materielAudiovisuelleBackend.dao;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dto.Category;

public interface ICategoryDAO {
	
	List<Category> listCategorys();
    Category get(int idCategorie);
	
}
