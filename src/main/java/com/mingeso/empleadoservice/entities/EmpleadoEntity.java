package com.mingeso.empleadoservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer rut;
    public String apellidos;
    public String nombres;
    public LocalDate fecha_nacimiento;
    public String id_categoria;
    public LocalDate ingreso_empresa;
    public String getCategoria(){
        return this.id_categoria;
    }



}
