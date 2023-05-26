package com.yoversj.apivehiculos.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoversj.apivehiculos.models.VehiculoModel;
import com.yoversj.apivehiculos.repositories.VehiculoRepository;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public ArrayList<VehiculoModel> obtenerVehiculos() {
        return (ArrayList<VehiculoModel>)vehiculoRepository.findAll();
    }

    public VehiculoModel guardarVehiculo(VehiculoModel vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public Optional<VehiculoModel> obtenerVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    public VehiculoModel editarVehiculo(VehiculoModel vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }
    
}
