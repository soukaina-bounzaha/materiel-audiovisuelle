package org.audio.materielAudiovisuelleBackend.test;

import static org.junit.Assert.assertEquals; // the right import

import org.audio.materielAudiovisuelleBackend.dao.ICategoryDAO;
import org.audio.materielAudiovisuelleBackend.dto.Category;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static ICategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("org.audio.materielAudiovisuelleBackend.daoImpl");
		context.scan("org.audio.materielAudiovisuelleBackend.config");
		context.refresh();
		categoryDAO = (ICategoryDAO) context.getBean("categoryDAO");
	}

	// @Test
	// public void testAddCategory() {

	// category = new Category();
	// category.setNomCategorie("TIRS");
	// category.setImageUrl("cat-1.png");
	// category.setDesigCat("categorie de tirs ");
	// assertEquals("Successfully added a category inside the table",
	// true,categoryDAO.add(category));

	// }

	// @Test
	// public void testGetCategory() {

	// category = categoryDAO.get(2);
	// assertEquals("Successfully fetched a single category from the
	// table","TIRS",category.getNomCategorie());

	// }

	// @Test
	// public void testGetCategory() {

	// category = categoryDAO.get(2);
	// assertEquals("Successfully fetched a single category from the
	// table","TIRS",category.getNomCategorie());

	// }

	/*
	 * @Test public void testUpdateCategory() {
	 *
	 * category = categoryDAO.get(2); 
	 * category.setNomCategorie("FORMATIONS");
	 * assertEquals("Successfully update a single category in the table",true,categoryDAO.update(category));
	 * }
	 */

	/*@Test
	  *public void testDeleteCategory() {

		*category = categoryDAO.get(2);
		*assertEquals("Successfully deleted a single category in the table", true, categoryDAO.delete(category));

	} */

	
	/*@Test
	  public void testListCategory() {

		assertEquals("Successfully fetched the list of  categories from the table",2, categoryDAO.listCategorys().size());

	} */
	
	@Test
	
	public void testCRUDCategory() {
	    // add operation 
		category = new Category();
		 category.setNomCategorie("AIR SHOW");
		 category.setImageUrl("cat-8.png");
		 category.setDesigCat("categorie air show ");
		 assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
		
		 category = new Category();
		 category.setNomCategorie("SPORTS");
		 category.setImageUrl("cat-9.png");
		 category.setDesigCat("categorie sport ");
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
	
	   // fetching and updating the category 
	
		category = categoryDAO.get(1); 
		category.setNomCategorie("OBSEQUES");
	    assertEquals("Successfully update a single category in the table",true,categoryDAO.update(category));
	
	    // deleting that category it means disactivate the category 
	    
		assertEquals("Successfully deleted a single category in the table", true, categoryDAO.delete(category));

	 //fetching the list 
		assertEquals("Successfully fetched the list of  categories from the table",1, categoryDAO.listCategorys().size());

	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
}
