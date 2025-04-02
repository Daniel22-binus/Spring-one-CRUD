package com.example.simple_one_crud.ui.controller;

import com.example.simple_one_crud.io.entity.VehicleEntity;
import com.example.simple_one_crud.shared.service.vehicle.VehicleService;
import com.example.simple_one_crud.ui.model.request.VehicleRequest;
import com.example.simple_one_crud.ui.model.response.VehicleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle")
@RequiredArgsConstructor
public class vehicleController {

    private final VehicleService vehicleService;

    @PostMapping
    ResponseEntity<VehicleResponse> createVehicle(@RequestBody VehicleRequest request) {
        VehicleEntity entity = vehicleService.createEntity(request);
        VehicleResponse response = vehicleService.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @GetMapping()
    ResponseEntity<List<VehicleResponse>> getAllVehicle() {
        return ResponseEntity.ok(vehicleService.getAllVehicleResponse());
    }

}
