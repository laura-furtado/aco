package ac21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		String opcao;
		double resp;
		
		try {
			System.out.println("Digite o primeiro número: ");
			numero1 = teclado.nextInt();
			System.out.println("Digite o segundo número: ");
			numero2 = teclado.nextInt();
			System.out.println("Digite a operação que deseja (soma, subtração, multiplicação ou divisão: ");
			opcao = teclado.next().toLowerCase();
			if(opcao.equals("soma")) {
				resp = numero1+ numero2;
				System.out.println("O valor da operação "+ opcao+" é "+ resp);
			}
			else if(opcao.equals("subtração")) {
				resp = numero1-numero2;
				System.out.println("O valor da operação "+ opcao+" é "+ resp);
			}
			else if(opcao.equals("multiplicação")) {
				resp = numero1*numero2;
				System.out.println("O valor da operação "+ opcao+" é "+ resp);
			}
			else {
				resp = numero1/numero2;
				System.out.println("O valor da operação "+ opcao+" é "+ resp);
			}
			
					
				}catch(ArithmeticException e) {
					System.out.println("Erro: Divisão por zero");
				}catch(InputMismatchException e) {
					System.out.println("Erro: Numero invalido");
				}finally {
					teclado.close();
				}
			}
	

	}

