package com.pos.persistence;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.pos.common.model.OrderMain;


public class OrderMainDao {

	@Inject
	private EntityManager entityManager;

	public List<OrderMain> findAll() {

		return entityManager.createQuery("SELECT o FROM OrderMain o", OrderMain.class).getResultList();
	}

	public OrderMain findOne(Long orderMainId) {

		return entityManager.find(OrderMain.class, orderMainId);
	}

	public void save(OrderMain orderMain) {
		entityManager.persist(orderMain);
	}

	public void update(OrderMain orderMain) {
		entityManager.merge(orderMain);
	}

}
