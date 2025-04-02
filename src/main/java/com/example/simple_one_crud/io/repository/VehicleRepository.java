package com.example.simple_one_crud.io.repository;

import com.example.simple_one_crud.io.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
}
