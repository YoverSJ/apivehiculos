package com.yoversj.apivehiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yoversj.apivehiculos.models.VehiculoModel;

public interface VehiculoRepository extends JpaRepository<VehiculoModel, Long>{
    
}
