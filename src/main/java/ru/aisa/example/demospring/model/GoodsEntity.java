package ru.aisa.example.demospring.model;

import javax.persistence.*;
import java.util.Objects;

@NamedQueries(
        @NamedQuery(name = "getAllGoodsNames", query = "SELECT G.name FROM GoodsEntity G")
)

@Entity
@Table(name = "goods", schema = "public", catalog = "testdb")
public class GoodsEntity {
    private int id;
    private int partnumber;
    private String name;
    private Integer amount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "partnumber")
    public int getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(int partnumber) {
        this.partnumber = partnumber;
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
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEntity that = (GoodsEntity) o;
        return id == that.id &&
                partnumber == that.partnumber &&
                Objects.equals(name, that.name) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, partnumber, name, amount);
    }
}
