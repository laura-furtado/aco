package teste;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Servico> servicos;
	
	
	public Cliente(){
		this.servicos= new ArrayList<Servico>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public ArrayList<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

	public void AdicionarServico(Servico servico) {
		servicos.add(servico);
	}
	

}
