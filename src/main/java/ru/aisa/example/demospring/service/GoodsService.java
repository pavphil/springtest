package ru.aisa.example.demospring.service;

import ru.aisa.example.demospring.model.GoodsEntity;

import java.util.List;

public interface GoodsService {
    List<GoodsEntity> listGoods();
    List<GoodsEntity> listGoodsOrderByPartnumber(boolean isDesc);
    List<GoodsEntity> getAllNamesOfGoods();
}
