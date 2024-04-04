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
@Table(name="countries")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Country_ID")
    private Long id;

    @Column(name="country")
    private String country_name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "country")
    private Set<Division> divisions;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;


}