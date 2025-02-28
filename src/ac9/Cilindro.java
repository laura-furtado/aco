package ac9;

public class Cilindro {

	public double raio;
	public double altura;
	public double area;
	public double volume;
	
	public void calcularArea(double raio, double altura) {
		area = raio*raio*Math.PI + altura*(2*Math.PI*raio);
	}
	//acesso tipo de retorno nome (parâmetro 1, parâmentro 2)
	public void calcularVolume(double raio, double altura) {
		volume = Math.PI*raio*raio*altura;
	}
	
	public void exibirDados() {
		System.out.println("O raio do cilindro é "+ raio);
		System.out.println("A altura do cilindro é "+ altura);
		System.out.printf("A área do cilindro é %.2f\n", area);
		System.out.printf("O volume do cilindro é %.2f", volume);
	}
	}
