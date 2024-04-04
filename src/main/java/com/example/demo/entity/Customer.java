package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Customer_ID")
    private Long id;

    @Column(name="Customer_First_Name", nullable = false)
    private String firstName;

    @Column(name="Customer_Last_Name", nullable = false)
    private String lastName;

    @Column(name="Address", nullable = false)
    private String address;

    @Column(name="Postal_Code")
    private String postal_code;

    @Column(name="Phone", nullable = false)
    private String phone;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name="Division_ID")
    private Division division;

    @OneToMany(mappedBy = "customer")
    private Set<Cart> carts= new HashSet<>();

    public void add(Cart cart) {
        if(cart != null){
            if(carts == null){
                carts= new HashSet<>();
            }
            carts.add(cart);
            cart.setCustomer(this);
        }
    }

    public Customer(String firstName, String lastName, String address, String postal_code, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postal_code = postal_code;
        this.phone = phone;

    }

    public Customer() {

    }

}