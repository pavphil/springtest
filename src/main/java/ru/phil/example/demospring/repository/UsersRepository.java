package ru.phil.example.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.phil.example.demospring.model.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
}
