package ac11;

import java.util.Locale;
import java.util.Scanner;

public class Ac11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total;
		double soma = 0;
		double media;
		
		System.out.println("Inserir total de avaliações: ");
		total = teclado.nextInt();
		
		double[] notas = new double[total];
		
		for(int i=0; i< notas.length; i++) {
			System.out.println("Inserir nota "+ (i+1)+ ": ");
			notas[i] = teclado.nextDouble();
			soma = soma + notas[i];
			}
		media = soma/notas.length;
		for(int i=0; i< notas.length; i++) {
			System.out.println("Nota "+ (i+1)+ ": "+ notas[i]);
		}
		System.out.printf("Média final: %.2f",media);
	}

}
