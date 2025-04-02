package com.example.simple_one_crud.io.entity;

import com.example.simple_one_crud.enums.VehicleType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "vehicle")
@Setter
@Getter
public class VehicleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name_vehicle")
    private String vehicleName;

    @Column(name = "vehicle_type")
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    @Column(name = "nopol")
    private String nopol;
}
