package ru.phil.example.demospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.phil.example.demospring.model.GoodsEntity;
import ru.phil.example.demospring.service.GoodsService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping (value = "/goods")
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
            ex.printStackTrace();
        }
        model.addAttribute("goods", goods);
        return "goods";
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addGoodPage(Model model){
        return "addgood";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> addGoodToDb(Model model, @ModelAttribute GoodsEntity entity){

        Map<String, Object> message = new HashMap<>();
        boolean res = goodsService.save(entity);
        if (res){
            message.put("success", true);
            message.put("text", "Товар успешно сохранен");
        } else {
            message.put("success", false);
            message.put("text", "При сохранении произошла ошибка");
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("X-Fsl-Location", "/");
        headers.add("X-Fsl-Response-Code", "302");

        List<GoodsEntity> allGoods = goodsService.listGoods();
        model.addAttribute("goods", allGoods);
        return new ResponseEntity<>(message, headers, HttpStatus.OK);
        //return "resultgoodswin";
    }
}
