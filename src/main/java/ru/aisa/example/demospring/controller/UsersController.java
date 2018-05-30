package ru.aisa.example.demospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.aisa.example.demospring.model.GoodsEntity;
import ru.aisa.example.demospring.model.UsersEntity;
import ru.aisa.example.demospring.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/users")
@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listusers", method = RequestMethod.GET)
    public String listUsers(Model model) {
        List<UsersEntity> users = null;
        try {
            users = userService.listUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String addUser(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "surname", required = true) String surname, Model model) {
        UsersEntity entity = new UsersEntity();
        try {
            if (name != null)
                entity.setName(name);
            if (surname != null)
                entity.setSurname(surname);
            userService.addUser(entity);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        List <UsersEntity> users = userService.listUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<UsersEntity> listAllUsersJSON() {
        return userService.listUsers();
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity <GoodsEntity> getDescription(@RequestBody UsersEntity stats){
        ResponseEntity <GoodsEntity> entityResponseEntity = null;
        return null;
    }


}
