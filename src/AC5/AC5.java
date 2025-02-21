package AC5;

import java.util.Scanner;

public class AC5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b;
		char operacao;
		System.out.println("Insira um valor ");
		a = teclado.nextDouble();
		System.out.println("Insira um valor ");
		teclado.nextLine();
		b = teclado.nextDouble();
		System.out.println("Insira a operação desejada (+, -, /, *) ");
		teclado.nextLine();
		operacao = teclado.nextLine().charAt(0);
		
		//impressão
		if (operacao == '+') {
			System.out.println("A soma de "+ a+ "+ "+b+ " = "+ (a+b));
			}
		else if (operacao == '-') {
			System.out.println("A subtração de " + a+"-"+ b + " = "+ (a-b));
		}
		else if (operacao == '/') {
			if (b == 0) {
				System.out.println("Erro");
			}
			else {
				System.out.println("A divisão de "+ a+ "/"+ b+ " = "+ (a/b));
			}
		}
		else if (operacao == '*') {
			System.out.println("A multiplicação de "+ a+ "*"+ b+ " = "+(a*b));
		}
	}
};

