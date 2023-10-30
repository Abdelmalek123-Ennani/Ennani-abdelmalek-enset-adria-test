package com.example.walletservice.repository;


import com.example.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface walletRepository extends JpaRepository<Wallet, Long> {
}
