package org.audio.materielAudiovisuelleBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.audio.materielAudiovisuelleBackend.dao.ICategoryDAO;
import org.audio.materielAudiovisuelleBackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")  //le meme nom dans autowired dans pageController
public class CategoryDAOImpl implements ICategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		 Category category = new Category();
		 
		 //ajouter la 1 category
		 
		category.setIdCategorie(1); 
		category.setNomCategorie("TIRS");
		category.setImageUrl("cat-1.png");
		category.setDesigCat("gategorie de tirs ");
		categories.add(category);
		
		category = new Category();
		 
		 //ajouter la 2 category
		 
		category.setIdCategorie(2); 
		category.setNomCategorie("VISITES");
		category.setImageUrl("cat-2.png");
		category.setDesigCat("gategorie des visites ");
		categories.add(category);
		
		category = new Category();
		 
		 //ajouter la 3 category
		 
		category.setIdCategorie(3); 
		category.setNomCategorie("BORJS");
		category.setImageUrl("cat-3.png");
		category.setDesigCat("gategorie des borjs ");
		categories.add(category);
	
	}

	@Override
	public List<Category> listCategorys() {
		
		return categories;
	}

	@Override
	public Category get(int idCategorie) {
		 /* pour chaque category de la lise
		  *  categories if id de cette category == id quon a passer on parametre 
		  *  return la category sinon return null
		  */
		for(Category category : categories) {
			
			if(category.getIdCategorie() == idCategorie) return category ;
		}
		return null;
	}
	
	

}
