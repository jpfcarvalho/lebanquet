package com.aep.LeBanquet.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurante implements BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String horaFuncionamento;
	private Boolean ativo;
	
	@NotNull
	@Size(min = 1)
	@OneToMany
	@JoinColumn(name = "id_restaurante")
	private List<Cardapio> cardapios = new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name = "id_restaurante")
	private List<Garcom> garsons = new ArrayList<>(); 
	
}
