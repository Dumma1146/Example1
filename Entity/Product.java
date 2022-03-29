package com.example1_practice.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "p_id", nullable = false)
    private Long pId;

    @Column(name = "p_name", nullable = false)
    private String pName;

    @Column(name = "p_quantity", nullable = false)
    private Integer pQuantity;

    @Column(name = "price", nullable = false)
    private Long price;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}