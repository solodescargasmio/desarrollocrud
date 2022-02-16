package com.sofka.crud.services;

import com.sofka.crud.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

import com.sofka.crud.models.UsuarioModel;
import org.springframework.stereotype.Service;

@Service //Convierte a clase de tipo servicio
public class UsuarioService {
    @Autowired //permite que no tenga que instanciarse
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
 public Optional<UsuarioModel> obtenerPorId(Long id){
     return usuarioRepository.findById(id);
 }
 
 public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
     return usuarioRepository.findByPrioridad(prioridad);
 }

 public boolean eliminarUsuario(Long id){
     try {
         usuarioRepository.deleteById(id);
         return true;
     } catch (Exception e) {
         return false;
     }
 }

 
}
