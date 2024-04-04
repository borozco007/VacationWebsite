package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="divisions")
@Getter
@Setter
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Division_ID")
    private Long id;

    @Column(name="Division")
    private String division_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Country_ID")
    private Country country;


    @OneToMany(cascade=CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customers;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;


}
