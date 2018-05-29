package ru.aisa.example.demospring.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.aisa.example.demospring.model.UsersEntity;
import ru.aisa.example.demospring.repository.UsersRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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
        usersRepository.save(p);
    }

    @Override
    public List<UsersEntity> listUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<UsersEntity> getUserById(int id) {
        return usersRepository.findById(id);
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public List<UsersEntity> findAllSortedDesc() {
        return usersRepository.findAll(new Sort((Sort.Direction.DESC), "id"));

    }
}
