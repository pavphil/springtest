package ru.aisa.example.demospring.dao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aisa.example.demospring.model.UsersEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(UsersEntity p) {

    }

    @Override
    public void updateUser(UsersEntity p) {

    }

    @Override
    public List<UsersEntity> listUsers() {
        return new ArrayList<>();
    }

    @Override
    public UsersEntity getUserById(int id) {
        return null;
    }

    @Override
    public void removeUser(int id) {

    }
}
