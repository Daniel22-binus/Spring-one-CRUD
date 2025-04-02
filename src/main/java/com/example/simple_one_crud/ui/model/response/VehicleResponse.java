package com.example.simple_one_crud.ui.model.response;

import com.example.simple_one_crud.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehicleResponse {

    private Integer id;
    private String vehicleName;
    private VehicleType vehicleType;
    private String nopol;
}
