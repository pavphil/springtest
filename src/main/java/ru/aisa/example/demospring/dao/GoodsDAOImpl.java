package ru.aisa.example.demospring.dao;

import org.springframework.stereotype.Repository;
import ru.aisa.example.demospring.model.GoodsEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class GoodsDAOImpl implements GoodsDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<GoodsEntity> getAllGoods() {
        CriteriaQuery<GoodsEntity> criteriaQuery = em.getCriteriaBuilder().createQuery(GoodsEntity.class);
        @SuppressWarnings("unused")
        Root<GoodsEntity> root = criteriaQuery.from(GoodsEntity.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<GoodsEntity> getAllGoodsOrderByPrice(boolean isDesc) {
        String SQL = "SELECT C FROM GoodsEntity C";
        if (isDesc)
            SQL += " ORDER BY C.partnumber DESC";
        return em.createQuery(SQL).getResultList();
    }

    @Override
    public List getAllNamesOfGoods() {
        return em.createNamedQuery("getAllGoodsNames").getResultList();
    }

}
