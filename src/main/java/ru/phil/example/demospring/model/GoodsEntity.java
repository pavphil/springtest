package ru.phil.example.demospring.model;

import javax.persistence.*;
import java.util.Objects;

@NamedQueries(
        @NamedQuery(name = "getAllGoodsNames", query = "SELECT G.name FROM GoodsEntity G")
)

@Entity
@Table(name = "goods", schema = "public", catalog = "testdb")
public class GoodsEntity {
    private int id;
    private int partNumber;
    private String name;
    private int amount;

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
    @Column(name = "partnumber")
    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partnumber) {
        this.partNumber = partnumber;
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
                partNumber == that.partNumber &&
                Objects.equals(name, that.name) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, partNumber, name, amount);
    }
}
