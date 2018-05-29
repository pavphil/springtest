package ru.aisa.example.demospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aisa.example.demospring.dao.UserDAO;
import ru.aisa.example.demospring.model.UsersEntity;
import ru.aisa.example.demospring.repository.UsersRepository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UsersRepository usersRepository;

    //private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("customerManager");
    //private EntityManager entityManager = emf.createEntityManager();

    @Override
    public void addUser(UsersEntity u) {
        usersRepository.save(u);
    }

    @Override
    public void updateUser(UsersEntity p) {

    }

    @Override
    public List<UsersEntity> listUsers() {
        return usersRepository.findAll();
    }

    @Override
    public UsersEntity getUserById(int id) {
        return new UsersEntity();
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public List<UsersEntity> findAllSortedDesc() {
        return usersRepository.findAll(new Sort((Sort.Direction.DESC), "id"));

    }
}
