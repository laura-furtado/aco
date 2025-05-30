package ac19;

public class CarroLuxo extends Carros implements Carro{

	public CarroLuxo(String descricao, int valorkm) {
		super(descricao, valorkm);
	}

	@Override
	public double calcularDiaria(double valorCarro) {
		double valorDiaria = valorCarro/1000;
		if (valorDiaria>190) {
			return 0;
		}
		return valorDiaria;
	}

	@Override
	public String verificarKm() {
		if(valorkm>limite_km) {
			return "Enviar carro para concessionária";
		}else {
			return "Carro dentro dos padrões";
		}
	}
	

}