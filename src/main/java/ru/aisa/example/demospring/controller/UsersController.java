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
import java.util.Optional;

@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(@RequestParam(value = "search", required = false) String q, Model model) {
        List<UsersEntity> users = null;
        try {
            users = userService.findAllSortedDesc();
            Optional<UsersEntity> ur = userService.getUserById(2);
            ur.get();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        model.addAttribute("users", users);
        return "users";
    }
}
