package com.umg.edu.progra3_model.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private Service parentService;

    // Getters and Setters
}
