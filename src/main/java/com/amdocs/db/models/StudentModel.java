package com.amdocs.db.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
public class StudentModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Getter
    @Setter
    long id;

    @Getter
    @Setter
    String nombre;
}
