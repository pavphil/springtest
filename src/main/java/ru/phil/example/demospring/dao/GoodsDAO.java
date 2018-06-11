package ru.phil.example.demospring.dao;

import ru.phil.example.demospring.model.GoodsEntity;

import java.util.List;

public interface GoodsDAO {
    List<GoodsEntity> getAllGoods();
    List<GoodsEntity> getAllGoodsOrderByPrice(boolean isDesc);
    List getAllNamesOfGoods();
    boolean saveGood(GoodsEntity entity);
}
