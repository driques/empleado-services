package com.mingeso.empleadoservice.service;

import com.mingeso.empleadoservice.entities.EmpleadoEntity;
import com.mingeso.empleadoservice.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<EmpleadoEntity> obtenerEmpleados(){
        return (List<EmpleadoEntity>) empleadoRepository.findAll();
    }

    public EmpleadoEntity guardarEmpleado(EmpleadoEntity empleado){
        return empleadoRepository.save(empleado);
    }

    public EmpleadoEntity obtenerPorRut(int rut){
        return empleadoRepository.findByRut(rut);
    }

//    public int getSueldos(int rut){
//        return empleadoRepository.getSueldoByRut(rut);
//    }

    public LocalDate getAnioIngreso(int rut){
        return empleadoRepository.getAnioIngreso(rut);
    }

    public boolean eliminarEmpleado(Integer rut) {
        try{
            empleadoRepository.deleteById(rut);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
