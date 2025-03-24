package ac17;

import java.util.ArrayList;

public class Equipe {
	private String nome;
	private String cor;
	private ArrayList<Jogador> jogadores;
	
	public Equipe(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.jogadores = new ArrayList<Jogador>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	
	}

	
	
	
}
