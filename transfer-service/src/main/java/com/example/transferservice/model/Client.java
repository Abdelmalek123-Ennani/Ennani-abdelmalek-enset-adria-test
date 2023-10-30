package com.example.transferservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class Client {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
