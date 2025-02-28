package ac9;

import java.util.Scanner;

public class Ac9_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cilindro c1 = new Cilindro();
		System.out.println("Digite a altura: ");
		c1.altura = teclado.nextDouble();
		System.out.println("Digite o raio: ");
		c1.raio = teclado.nextDouble();
		
		c1.calcularArea(c1.raio, c1.altura);
		c1.calcularVolume(c1.raio, c1.altura);
		c1.exibirDados();
	}
}

		
		

