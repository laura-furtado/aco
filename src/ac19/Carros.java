package ac19;

public class Carros implements Carro{
	protected String descricao;
	protected int valorkm;
	protected double valorDiaria;
	

	public Carros(String descricao, int valorkm) {
		this.descricao = descricao;
		this.valorkm = valorkm;
	}
	
	public void relatorio() {
		System.out.println("Descrição: "+ descricao);
		System.out.println("valorkm: "+ valorkm);
	
	}

	@Override
	public double calcularDiaria(double valorCarro) {
		// TODO Auto-generated method stub
		return valorDiaria;
	}

	@Override
	public String verificarKm() {
		// TODO Auto-generated method stub
		return null;
	}
}
