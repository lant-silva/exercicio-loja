package model;

public class Cliente {
	public String nome;
	public int quantidadePecas;
	public float valorPecas;
	
	public Cliente(String nome, int quantidadePecas, float valorPecas) {
		this.nome = nome;
		this.quantidadePecas = quantidadePecas;
		this.valorPecas = valorPecas;
	}
}
