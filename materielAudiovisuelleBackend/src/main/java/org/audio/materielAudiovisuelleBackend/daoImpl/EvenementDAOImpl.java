package org.audio.materielAudiovisuelleBackend.daoImpl;

import java.util.List;

import org.audio.materielAudiovisuelleBackend.dao.IEvenementDAO;
import org.audio.materielAudiovisuelleBackend.dto.Evenement;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("evenementDAO") // le meme nom dans autowired dans pageController
@Transactional
public class EvenementDAOImpl implements IEvenementDAO {
	@Autowired
	private SessionFactory sessionFactory;

	// get a single Evenement
	@Override
	public Evenement get(int idEvenement) {
		try {
			return sessionFactory.getCurrentSession().get(Evenement.class, Integer.valueOf(idEvenement));
		}

		catch (Exception ex) {

			ex.printStackTrace();

		}
		return null;
	}

	// list of evenement
	@Override
	public List<Evenement> listEvenement() {
		return sessionFactory.getCurrentSession().createQuery("FROM Evenement", Evenement.class).getResultList();
	}

	// add an event
	@Override
	public boolean add(Evenement evenement) {
		try {

			// add the category to the database
			sessionFactory.getCurrentSession().persist(evenement);

			return true;
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}

	}

	// update
	@Override
	public boolean update(Evenement evenement) {

		try {

			// add the category to the database
			sessionFactory.getCurrentSession().update(evenement);

			return true;
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Evenement evenement) {

		try {
			evenement.setActive(false);
			// call the update method
			return this.update(evenement);
		}

		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Evenement> listActiveEvenement() {

		String SelectActiveEvenement = "FROM Evenement WHERE active = :active";
		return sessionFactory.getCurrentSession().createQuery(SelectActiveEvenement, Evenement.class)
				.setParameter("active", true).getResultList();
	}

	@Override
	public List<Evenement> listActiveEvenementByCategory(int categoryId) {

		String SelectActiveEvenementByCategory = "FROM Evenement WHERE active = :active AND categoryId = :categoryId";
		return sessionFactory.getCurrentSession()
				.createQuery(SelectActiveEvenementByCategory, Evenement.class)
				.setParameter("active", true)
				.setParameter("categoryId", categoryId)
				.getResultList();
	}

	@Override
	public List<Evenement> getlatestActiveEvenement(int count) {

		return sessionFactory.getCurrentSession()
				.createQuery("FROM Evenement WHERE active = :active ORDER BY idEvenement", Evenement.class)
				.setParameter("active", true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

}
