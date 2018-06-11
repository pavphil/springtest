package ru.phil.example.demospring.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.phil.example.demospring.model.GoodsEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class GoodsDAOImpl implements GoodsDAO {
    Logger logger = Logger.getLogger(GoodsDAOImpl.class);
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

    @Transactional
    @Override
    public boolean saveGood(GoodsEntity entity) {
        try {
            em.persist(entity);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Произошла ошибка сохранения объекта в бд");
            return false;
        }
        return true;
    }

}
