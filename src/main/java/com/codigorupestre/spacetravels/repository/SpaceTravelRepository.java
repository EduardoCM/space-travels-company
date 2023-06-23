package com.codigorupestre.spacetravels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigorupestre.spacetravels.entity.SpaceTravelEntity;

public interface SpaceTravelRepository extends JpaRepository<SpaceTravelEntity, Long> {

}
