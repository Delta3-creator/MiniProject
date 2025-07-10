package com.example.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students") // Optional - customizes the table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Makes this column non-null in DB
    private String name;

    @Column(unique = true) // Ensures email uniqueness
    private String email;

    // Constructors
    public Student() {
        // Default constructor required by JPA
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method (optional but useful for debugging)
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}