package ru.aisa.example.demospring.dao;

import ru.aisa.example.demospring.model.GoodsEntity;

import java.util.List;

public interface GoodsDAO {
    List<GoodsEntity> getAllGoods();
    List<GoodsEntity> getAllGoodsOrderByPrice(boolean isDesc);
    List getAllNamesOfGoods();
}
