package AC3;

import java.util.Scanner;

public class AC3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, volume, h;
		int raio;
		System.out.println("Digite o raio do cilindro: ");
		raio = teclado.nextInt();
		System.out.println("Insira a altura do cilindro: ");
		teclado.nextLine();
		h = teclado.nextDouble();
		area = 2*Math.PI*raio*(raio+h);
		volume = Math.PI*raio*raio*h;
		//Impressão
		System.out.println("-------------------------------------------");
		System.out.println("A altura do cilindro é "+ h);
		System.out.println("O raio do cilindro é: "+ raio);
		System.out.println("A área do cilindro é: "+ area);
		System.out.println("O volume do cilindro é: "+ volume);
		

	}

}
