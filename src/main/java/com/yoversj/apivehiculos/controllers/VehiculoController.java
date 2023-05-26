package com.yoversj.apivehiculos.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoversj.apivehiculos.models.VehiculoModel;
import com.yoversj.apivehiculos.services.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public ArrayList<VehiculoModel> obtenerVehiculos() {
        return vehiculoService.obtenerVehiculos();
    }
    
    @PostMapping
    public VehiculoModel guardarVehiculo(@RequestBody VehiculoModel vehiculo){
        return vehiculoService.guardarVehiculo(vehiculo);
    }

}
