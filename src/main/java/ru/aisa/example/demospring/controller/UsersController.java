package ru.aisa.example.demospring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.aisa.example.demospring.model.GoodsEntity;
import ru.aisa.example.demospring.model.UsersEntity;
import ru.aisa.example.demospring.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/users")
@Controller
public class UsersController {
    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UsersController.class);

    @RequestMapping(value = "/listusers", method = RequestMethod.GET)
    public String listUsers(Model model) {
        List<UsersEntity> users = null;
        try {
            users = userService.listUsers();
            logger.error("LOGGER TEST");
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

    @RequestMapping(value = "/userswithcomment", method = RequestMethod.POST)
    public ResponseEntity <Map<String, Object>> getDescription(@RequestBody UsersEntity stats){
        Map<String, Object> message = new HashMap<>();
        List <UsersEntity> listUsers = userService.listUsers();

        message.put("severity", "info");
        message.put("location", "/");
        message.put("summary", "Authenticated successfully.");
        message.put("code", 200);

        Map<String, Object> json = new HashMap<>();
        json.put("success", true);
        json.put("message", message);
        json.put("users", listUsers);
        json.put("inputUser", stats);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("X-Fsl-Location", "/");
        headers.add("X-Fsl-Response-Code", "302");

        return (new ResponseEntity<>(json, headers, HttpStatus.OK));
    }


}
