package com.example.transferservice.repositories;

import com.example.transferservice.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransferRepsitory extends JpaRepository<Transfer, Long> {
}
