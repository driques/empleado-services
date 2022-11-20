package com.mingeso.empleadoservice.controllers;

import com.mingeso.empleadoservice.entities.EmpleadoEntity;
import com.mingeso.empleadoservice.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/listar")
    public ResponseEntity<List<EmpleadoEntity>> listarEmpleados(){
        List<EmpleadoEntity> empleados = empleadoService.obtenerEmpleados();
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoEntity> obtenerEmpleado(@PathVariable Integer id){
        EmpleadoEntity empleado = empleadoService.obtenerPorRut(id);
        return ResponseEntity.ok(empleado);
    }


    @GetMapping("/anio-ingreso/{id}")
    public ResponseEntity<LocalDate> obtenerAnioIngreso(@PathVariable Integer id){
        LocalDate anioIngreso = empleadoService.getAnioIngreso(id);
        return ResponseEntity.ok(anioIngreso);
    }

}
