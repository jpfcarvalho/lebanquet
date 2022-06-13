package com.aep.LeBanquet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientePedidoRestaurante implements BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String avaliacao;
	private String obsAvaliacao;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_restaurante", insertable = false)
	private Restaurante restaurante;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_pagamento", insertable = false)
	private Pagamento pagamento;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_cliente", insertable = false)
	private Cliente cliente;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_endereco", insertable = false)
	private Endereco endereco;
	
}
