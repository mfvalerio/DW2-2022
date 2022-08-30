package br.edu.ifsp.arq.dw2s6.exercicios.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String email;
	
	private String cellphone;


}
