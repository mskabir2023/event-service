package com.example.day4springbootpersistence.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


//@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
}

