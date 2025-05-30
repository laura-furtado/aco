package ac19;

	public class CarroBasico extends Carros implements Carro{	
		
		public CarroBasico(String descricao, int valorkm) {
			super(descricao, valorkm);
		}
		public double calcularDiaria(double valorCarro) {
			valorDiaria = valorCarro/2000;
			return valorDiaria;
		}
		public String verificarKm() {
			if(valorkm>limite_km) {
				return "Enviar carro para revisão";
			}else {
				return "Carro dentro dos padrões";
			}
		}


	}
