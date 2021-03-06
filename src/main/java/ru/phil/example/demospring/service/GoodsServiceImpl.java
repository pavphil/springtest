package ru.phil.example.demospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.phil.example.demospring.dao.GoodsDAO;
import ru.phil.example.demospring.model.GoodsEntity;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDAO goodsDAO;

    @Transactional
    @Override
    public List<GoodsEntity> listGoods() {
        return goodsDAO.getAllGoods();
    }

    @Override
    public List<GoodsEntity> listGoodsOrderByPartnumber(boolean isDesc) {
        return goodsDAO.getAllGoodsOrderByPrice(isDesc);
    }

    @Override
    public List<GoodsEntity> getAllNamesOfGoods() {
        return goodsDAO.getAllNamesOfGoods();
    }

    @Override
    public boolean save(GoodsEntity entity) {
        return goodsDAO.saveGood(entity);
    }
}
