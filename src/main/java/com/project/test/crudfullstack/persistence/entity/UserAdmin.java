package com.project.test.crudfullstack.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class UserAdmin {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private Integer document;
    private String name;
    private String LastName;
    private LocalDateTime date;
}
