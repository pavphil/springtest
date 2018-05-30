package ru.aisa.example.demospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.aisa.example.demospring.model.GoodsEntity;
import ru.aisa.example.demospring.service.GoodsService;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getallgoods", method = RequestMethod.GET)
    public String index(@RequestParam(value = "search", required = false) String q, Model model) {
        List<GoodsEntity> goods = null;
        try {
            goods = goodsService.listGoods();
        } catch (Exception ex) {
        }
        model.addAttribute("users", goods);
        return "index";
    }

    @RequestMapping(value = "/getallgoodsordered", method = RequestMethod.GET)
    public String getAllGoodsOrdered(@RequestParam(value = "order", defaultValue = "true", required = false) Boolean isDesc, Model model) {
        List<GoodsEntity> goods = null;
        try {
            goods = goodsService.listGoodsOrderByPartnumber(isDesc);
        } catch (Exception ex) {
        }
        model.addAttribute("users", goods);
        return "index";
    }

    @RequestMapping(value = "/getallnames", method = RequestMethod.GET)
    public String getAllGoodsOrdered(Model model) {
        List goods = null;
        try {
            goods = goodsService.getAllNamesOfGoods();
            for (Object obj : goods){
                System.out.println(obj.toString());
            }
        } catch (Exception ex) {
        }
        model.addAttribute("users", goods);
        return "index";
    }
}
