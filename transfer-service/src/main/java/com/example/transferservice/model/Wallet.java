package com.example.transferservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class Wallet {
    private Long id;
    private double solde;
    private Date dateCreation;
    private double device;
    private Client client;
}
