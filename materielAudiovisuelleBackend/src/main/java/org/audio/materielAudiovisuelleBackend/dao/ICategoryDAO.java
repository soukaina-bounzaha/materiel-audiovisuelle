package org.audio.materielAudiovisuelleBackend.dao;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dto.Category;

public interface ICategoryDAO {

    Category get(int idCategorie);
    List<Category> listCategorys();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
	
	
}
