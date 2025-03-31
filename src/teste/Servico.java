package teste;

public class Servico {
	private String nomeServico;
	private double valor;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servico(int id, String nomeServico, double valor) {
		this.nomeServico = nomeServico;
		this.valor = valor;
		this.id = id;
		
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
