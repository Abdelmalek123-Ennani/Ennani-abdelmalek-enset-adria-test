package com.example.walletservice.repository;

import com.example.walletservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRespository extends JpaRepository<Client, Long> {
}
