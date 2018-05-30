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
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname, Model model) {
        List<UsersEntity> users = null;
        try {
            UsersEntity entity = new UsersEntity();
            if (name != null)
                entity.setName(name);
            if (surname != null)
                entity.setSurname(surname);
            //userService.addUser(entity);
            users = userService.listUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        model.addAttribute("users", users);
        return "users";
    }
}
