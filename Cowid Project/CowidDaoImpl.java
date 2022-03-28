package com.cowid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cowid.entity.Cowid;

@Repository

public class CowidDaoImpl implements CowidDao {

	@PersistenceContext  
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Cowid getCowidById(int cid) {
		Cowid cow = entityManager.find(Cowid.class, cid);
		return cow;
	}
	@Override

	public Cowid addCowid(Cowid cow) {
		entityManager.persist(cow);
         return entityManager.find(Cowid.class, cow.getCid());
	}

	@Override
	public String removeCowid(int cid) {
        Cowid emp = entityManager.find(Cowid.class, cid);

		if (emp != null) {
			entityManager.remove(emp);
			return " deleted";
		} else {
			return "not found";
		}
    }

	@Override

	public Cowid updateCowid(Cowid cow) {
		return entityManager.merge(cow);
	}


	@Override
	public List<Cowid> listCowid() {
		

		TypedQuery<Cowid> q2 = entityManager.createQuery("select c from Cowid c", Cowid.class);
		List<Cowid> l1 = q2.getResultList();
		return l1;
	}
	@Override
	public List<Cowid> queryCowid() {
		

		TypedQuery<Cowid> q3 = entityManager.createQuery("SELECT clocation, Count(ccases ) FROM Cowid WHERE cnewcases> 1000 GROUP BY clocation ORDER BY cnewcases; ", Cowid.class);
		List<Cowid> l2 = q3.getResultList(); 
		return l2;
	}
	

}


