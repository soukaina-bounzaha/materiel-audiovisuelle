package org.audio.materielAudiovisuelleBackend.daoImpl;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dao.ICategoryDAO;
import org.audio.materielAudiovisuelleBackend.dto.Category;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;//make sure this is the rite import

@Repository("categoryDAO") // le meme nom dans autowired dans pageController
@Transactional
public class CategoryDAOImpl implements ICategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> listCategorys() {
		
		String SelectActiveCategory = "FROM Category WHERE active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(SelectActiveCategory);
		query.setParameter("active",true);

		return query.getResultList();
	}
	/*
	 * getting single category based on idCategorie
	 */

	@Override
	public Category get(int idCategorie) {

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(idCategorie));
	}

	@Override
	public boolean add(Category category) {

		try {

			// add the category to the database
			sessionFactory.getCurrentSession().persist(category);

			return true;
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}
	/*
	 * updating a single category 
	 */

	@Override
	public boolean update(Category category) {
		try {

			// add the category to the database
			sessionFactory.getCurrentSession().update(category);

			return true;
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {

			// call the method update
			sessionFactory.getCurrentSession().update(category);

			return true;
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

}
