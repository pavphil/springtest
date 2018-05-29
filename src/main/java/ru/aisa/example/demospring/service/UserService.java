package ru.aisa.example.demospring.service;

import org.springframework.stereotype.Service;
import ru.aisa.example.demospring.model.UsersEntity;

import java.util.List;

public interface UserService {
    void addUser(UsersEntity u);
    void updateUser(UsersEntity p);
    List<UsersEntity> listUsers();
    UsersEntity getUserById(int id);
    void removeUser(int id);
    List <UsersEntity> findAllSortedDesc();

}
