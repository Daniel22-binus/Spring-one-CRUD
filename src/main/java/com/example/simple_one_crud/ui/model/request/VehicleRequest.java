package com.example.simple_one_crud.ui.model.request;

import com.example.simple_one_crud.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleRequest {

    private String vehicleName;
    private VehicleType vehicleType;
    private String nopol;

}
