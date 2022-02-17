package com.sofka.crud.controller;


import com.sofka.crud.models.UsuarioModel;
import com.sofka.crud.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.bytebuddy.asm.Advice.Local;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(Local locale,Model modelo){
        String ver="ESTO PARA MOSTRAR";
        modelo.addAttribute("ver", ver);
        return "test";
    }
}
