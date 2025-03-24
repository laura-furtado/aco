package ac17;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private int idade;
	private ArrayList<Equipe> equipes;
	
	
	public Jogador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.equipes = new ArrayList<Equipe>();
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}


	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	public void addEquipe(Equipe equipe) {
		this.equipes.add(equipe);
	}
	

}
