package ru.phil.example.demospring.service;

import org.springframework.stereotype.Service;
import ru.phil.example.demospring.model.UsersEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    void addUser(UsersEntity u);
    void updateUser(UsersEntity p);
    List<UsersEntity> listUsers();
    Optional<UsersEntity> getUserById(int id);
    void removeUser(int id);
    List <UsersEntity> findAllSortedDesc();

}
