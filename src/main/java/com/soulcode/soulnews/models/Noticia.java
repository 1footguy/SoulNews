package com.soulcode.soulnews.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "noticias")
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNoticia;

	@Column(nullable = false, length = 255, unique = true)
	private String titulo;

	@Column(length = 4000)
	private String conteudo;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private LocalDate dataPublicacao;

}
