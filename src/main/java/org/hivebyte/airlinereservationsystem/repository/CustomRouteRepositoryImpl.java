package org.hivebyte.airlinereservationsystem.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
public class CustomRouteRepositoryImpl implements CustomRouteRepository {
	
	@PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long generateRouteId() {
        Query query = entityManager.createQuery("SELECT COALESCE(MAX(r.routeId), 0) + 1 FROM Route r");
        return (Long) query.getSingleResult();
    }

}
