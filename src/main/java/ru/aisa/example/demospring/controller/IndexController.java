package ru.aisa.example.demospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.aisa.example.demospring.model.UsersEntity;
import ru.aisa.example.demospring.service.UserService;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam(value = "search", required = false) String q, Model model) {
        List<UsersEntity> users = null;
        String inputPrhase = "Hello world";
        try {
            users = userService.listUsers();
        } catch (Exception ex) {
            // here you should handle unexpected errors
            // ...
            // throw ex;
        }
        model.addAttribute("inputPhase", inputPrhase);
        return "index";
    }
}