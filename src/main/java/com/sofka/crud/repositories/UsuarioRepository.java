package com.sofka.crud.repositories;

import com.sofka.crud.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import com.sofka.crud.models.UsuarioModel;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
