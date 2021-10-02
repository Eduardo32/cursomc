package com.pauloeduardocosta.cursomc.domain.enums;

public enum tipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private tipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static tipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(tipoCliente tipo: tipoCliente.values()) {
			if(cod.equals(tipo.getCod())) {
				return tipo;
			}
		}
		
		throw new IllegalArgumentException("Id invalido: " + cod);
		
	}

}
