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
}