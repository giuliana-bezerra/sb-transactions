package com.example.transactionsmultiplesdbs;

import org.apache.logging.log4j.util.Strings;

public class Pessoa {
	private int id;
	private String nome;
	private String email;
	private String dataNascimento;
	private int idade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isValida() {
		return !Strings.isBlank(nome) && !Strings.isBlank(email) && dataNascimento != null;
	}

}
