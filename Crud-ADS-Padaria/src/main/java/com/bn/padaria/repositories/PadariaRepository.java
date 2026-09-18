package com.bn.padaria.repositories;


import com.bn.padaria.models.PadariaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PadariaRepository extends  JpaRepository<PadariaModel, Long> {
}