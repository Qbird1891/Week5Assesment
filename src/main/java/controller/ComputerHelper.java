package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Computers;


/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Sep 25, 2023
 */
public class ComputerHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ComputersWeek5");
	
	public void persist(Computers model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Computers model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Computers.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	public List<Computers> showAllComputers() {
		EntityManager manager = factory.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Computers> allItems = manager.createQuery("SELECT i FROM computers i").getResultList();
		manager.close();
		return allItems;
	}
	
	public void update(Computers model) {
		EntityManager manager = factory.createEntityManager();
		Computers dbEntity = manager.find(Computers.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setMake(model.getMake());
		dbEntity.setModel(model.getModel());
		dbEntity.setSize(model.getSize());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Computers searchByComputerName(String oldMake) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Computers> query = manager.createQuery("SELECT i FROM computers AS i WHERE i.make = :make", Computers.class);
		query.setParameter("make", oldMake);
		Computers dbEntity = query.getSingleResult();
		return dbEntity;
	}
	
	

}
