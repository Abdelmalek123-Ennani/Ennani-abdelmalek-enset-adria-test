package com.example.transferservice.entities;

import com.example.transferservice.enums.TransferEtat;
import com.example.transferservice.model.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Transfer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestination;

    private double montant;

    private TransferEtat etat;

}
