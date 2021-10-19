package br.com.carlo.church.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("churchEmf");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void close(EntityManager em) {
		em.close();
	}

}
