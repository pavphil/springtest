package ru.phil.example.demospring.service;

import ru.phil.example.demospring.model.GoodsEntity;

import java.util.List;

public interface GoodsService {
    List<GoodsEntity> listGoods();
    List<GoodsEntity> listGoodsOrderByPartnumber(boolean isDesc);
    List<GoodsEntity> getAllNamesOfGoods();
    boolean save(GoodsEntity entity);
}
