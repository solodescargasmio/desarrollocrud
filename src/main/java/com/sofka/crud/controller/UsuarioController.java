package com.sofka.crud.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.sofka.crud.models.UsuarioModel;
import com.sofka.crud.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins ="http://localhost:8080")
@RestController
@RequestMapping("/usuario")//Cuando coloque esta url me muestra los usuario
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;


    @GetMapping()//Cuando llegue peticion get ejecuta la operacion
    public ArrayList<UsuarioModel> obtenerUsuario(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/id/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/prioridad/{pri}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@PathVariable Integer pri){
        return usuarioService.obtenerPorPrioridad(pri);
    }


    @GetMapping("/email/{name}")
    public ArrayList<UsuarioModel> traerUsuarioEmail(@PathVariable String name){
        return usuarioService.obtenerUsuarioPorMail(name);
    }
    

    @GetMapping("/borrar/{id}")
    public String eliminarPorId(@PathVariable Long id){
        boolean ok= this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se elimino usuario con id "+ id;
        }else{
            return "No se pudo eliminar usuario con id "+ id;    
        } 
    }

   

}
