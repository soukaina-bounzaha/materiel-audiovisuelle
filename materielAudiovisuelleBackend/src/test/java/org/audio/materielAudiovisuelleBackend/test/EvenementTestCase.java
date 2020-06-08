package org.audio.materielAudiovisuelleBackend.test;

import static org.junit.Assert.assertEquals;

import org.audio.materielAudiovisuelleBackend.dao.IEvenementDAO;
import org.audio.materielAudiovisuelleBackend.dto.Evenement;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EvenementTestCase {
	
     private static IEvenementDAO evenementDAO;
     private Evenement evenement;
     private static AnnotationConfigApplicationContext context;
	
     @BeforeClass
 	public static void init() {

 		context = new AnnotationConfigApplicationContext();
 		context.scan("org.audio.materielAudiovisuelleBackend.daoImpl");
 		context.scan("org.audio.materielAudiovisuelleBackend.config");
 		context.refresh();
 		evenementDAO = (IEvenementDAO) context.getBean("evenementDAO");
 	}
     
    /* @Test
 	
 	public void testCRUDEvenement() {
 	    // add operation 
     
    	 evenement = new Evenement();
    	 evenement.setDesigEven("air show for airplains");
    	 evenement.setRefeEven("g5552");
    	 evenement.setActive(true);
    	 evenement.setCategoryId(1);
		 assertEquals("something went wrong zhile inserting a new event",true,evenementDAO.add(evenement));
		// reading and updating the category 
		  evenement = evenementDAO.get(8);
		  evenement.setDesigEven("earth show for souka");
		  assertEquals("something went wrong while updating the exesting event",
				  true,evenementDAO.update(evenement));
		  
		  assertEquals("something went wrong while updating the exesting event",
				  true,evenementDAO.delete(evenement));
		  
    	 //List
		  
		  assertEquals("something went wrong while fetching the list of events",
				 6,evenementDAO.listEvenement().size());
		  
    	 
     }*/
     
     
     
     
     
     
     
     
}
