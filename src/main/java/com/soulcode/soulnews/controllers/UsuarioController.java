package com.soulcode.soulnews.controllers;
// get - post - redirect

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soulcode.soulnews.repositories.UsuarioRepository;


@Controller
public class UsuarioController {   
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/login")
    public String paginaUsuario(){
        return "login";
    }
}    