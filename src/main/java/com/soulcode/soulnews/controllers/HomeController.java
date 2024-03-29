package com.soulcode.soulnews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soulcode.soulnews.models.Noticia;
import com.soulcode.soulnews.repositories.NoticiaRepository;


@Controller
public class HomeController {
	@Autowired
	private NoticiaRepository noticiaRepository;

	@GetMapping("/")
	public ModelAndView paginaHome(Noticia noticia) {
		List<Noticia> noticias = noticiaRepository.findAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listaNoticias", noticias);
		return mv;
	}

	@GetMapping("/criar-noticia")
    public String paginaCriarNoticia() {
        return "criar-noticia";
    }

	@GetMapping("/enviar-mensagem")
    public String paginaEnviarMensagem() {
        return "enviar-mensagem";
    }

	@GetMapping("/perguntas-frequentes")
    public String paginaPerguntasFrequentes() {
        return "perguntas-frequentes";
    }

	@GetMapping("/erro")
    public String paginaDeErro() {
        
		return "erro";
    }

	@GetMapping("/noticia-pesquisa")
    public String paginaNoticiaPesquisa() {
        return "noticia-pesquisa"; 
    }

	@GetMapping("/pesquisa-avancada")
    public String paginaPesquisaAvancada() {
        return "pesquisa-avancada"; 
    }

    @GetMapping("/grcmt")
    public ModelAndView paginaGrcmt() {
        ModelAndView mv = new ModelAndView("grcmt");
        return mv;
    }
    
}