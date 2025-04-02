package com.example.simple_one_crud.shared.service.vehicle;

import com.example.simple_one_crud.io.entity.VehicleEntity;
import com.example.simple_one_crud.io.repository.VehicleRepository;
import com.example.simple_one_crud.ui.model.request.VehicleRequest;
import com.example.simple_one_crud.ui.model.response.VehicleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VehicleServiceImpl implements VehicleService{

    private final VehicleRepository vehicleRepository;

    @Override
    public VehicleEntity createEntity(VehicleRequest request) {

        VehicleEntity entity = new VehicleEntity();
        BeanUtils.copyProperties(request, entity);
        VehicleEntity saved = vehicleRepository.save(entity);
        log.info("createEntity activate");
        return saved;
    }

    @Override
    public List<VehicleResponse> getAllVehicleResponse() {

        List<VehicleEntity> entityList = vehicleRepository.findAll();
        List<VehicleResponse> responseList = new ArrayList<>();
        for (int i = entityList.size() - 1; i >= 0; i--) {
            VehicleResponse response = toResponse(entityList.get(i));
            responseList.add(response);
        }

        log.info("getAllVehicleResponse activate");
        return responseList;
    }

    @Override
    public VehicleResponse toResponse(VehicleEntity entity) {

        VehicleResponse response = new VehicleResponse();
        BeanUtils.copyProperties(entity, response);
        log.info("toResponse activate");
        return response;
    }
}
