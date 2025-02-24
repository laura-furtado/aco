package ac9;

public class Cilindro {

	public double raio;
	public double altura;
	public double area;
	public double volume;
	
	public void calcularArea(double raio, double altura) {
		area = raio*raio*Math.PI + altura*(2*Math.PI*raio);
	}
	public void calcularVolume(double raio, double altura) {
		volume = Math.PI*raio*raio*altura;
	}
	
	}