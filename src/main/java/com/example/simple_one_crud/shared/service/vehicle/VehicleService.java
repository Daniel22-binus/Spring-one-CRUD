package com.example.simple_one_crud.shared.service.vehicle;

import com.example.simple_one_crud.io.entity.VehicleEntity;
import com.example.simple_one_crud.ui.model.request.VehicleRequest;
import com.example.simple_one_crud.ui.model.response.VehicleResponse;

import java.util.List;

public interface VehicleService {

    VehicleEntity createEntity(VehicleRequest request);

    List<VehicleResponse> getAllVehicleResponse();

    VehicleResponse toResponse (VehicleEntity entity);
}
