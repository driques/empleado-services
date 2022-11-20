package com.mingeso.empleadoservice.repositories;

import com.mingeso.empleadoservice.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, Integer> {
    @Query("select e from EmpleadoEntity e where e.rut = :rut")
    EmpleadoEntity findByRut(@Param("rut") int rut);

    @Query(value = "select ingreso_empresa from employee where employee.rut = :rut", nativeQuery = true)
    LocalDate getAnioIngreso(@Param("rut") int rut);



}
