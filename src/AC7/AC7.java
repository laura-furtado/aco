package AC7;

import java.util.Scanner;

public class AC7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String produto, x;
		double precoO, desconto, precoF;
		x = "sim";
		do {
		System.out.println("Digite o nome do produto: ");
		produto = teclado.nextLine();
		System.out.println("Digite o preço original do produto: ");
		precoO = teclado.nextDouble();
		System.out.println("Digite o valor do desconto (%): ");
		desconto = teclado.nextDouble();
		precoF = ((100-desconto)/100)*precoO;
		
		System.out.println("----------------------");
		//System.out.println("O produto "+ produto+ " custa originalmente R$"+precoO+" e com desconto passa a custar R$"+precoF);
		System.out.printf("O produto %s custa originalmente R$%.2f e com desconto passa a custar R$%.2f\n", produto, precoO, precoF);
		System.out.println("Deseja calcular outro produto? ");
		teclado.nextLine();
		x = teclado.nextLine();
		x.toLowerCase();
		} 
		while(x.equals("sim"));
	}
	}
	

