package Jokenpo;

public class Jogador {
	//atributos
	private String nome;
	private int pontos;
	
	//construtor

	public Jogador(String nome, int pontos) {
		this.nome = nome;
		this.pontos = 0;
	}

	//get e sets
	//getnome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//getpontos
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	

}
