package ru.aisa.example.demospring.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "public", catalog = "testdb")
public class UsersEntity {
    private int id;
    private String name;
    private String surname;
    private Integer age;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity entity = (UsersEntity) o;
        return id == entity.id &&
                Objects.equals(name, entity.name) &&
                Objects.equals(surname, entity.surname) &&
                Objects.equals(age, entity.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, age);
    }
}
