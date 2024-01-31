package com.soulcode.soulnews.controllers;
// get - post - redirect

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soulcode.soulnews.models.Usuario;
import com.soulcode.soulnews.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UsuarioController {   
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public ModelAndView paginaUsuario(){
        ModelAndView mv = new ModelAndView("registro");
        return mv;
    }

    @PostMapping("/usuario/create")
    public ModelAndView cadastrarUsuario(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
            ModelAndView mv = new ModelAndView("redirect:/usuario");
            return mv;
        } catch (Exception e) {
            ModelAndView mvError = new ModelAndView();
            mvError.addObject("msg", "Usuário já cadastrado em nosso banco de dados.");
            return mvError;
        }
    }
    
}    