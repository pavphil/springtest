package ru.phil.example.demospring.dao;

import ru.phil.example.demospring.model.UsersEntity;

import java.util.List;

public interface UserDAO {
    public void addUser(UsersEntity p);
    public void updateUser(UsersEntity p);
    public List<UsersEntity> listUsers();
    public UsersEntity getUserById(int id);
    public void removeUser(int id);
}
