package ru.aisa.example.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aisa.example.demospring.model.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
}
