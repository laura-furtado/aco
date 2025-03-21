package ac15;

import java.util.Scanner;

public class sistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		String nome, cpf;
		
		Ingresso i1 =new Ingresso("120", "Show Blitz");
		
		Comprador c1 = new Comprador();
		
		
		System.out.println("Digite 1 se deseja comprar um ingresso ou 2 se não: ");
		numero = teclado.nextInt();
		//teclado.nextInt();
		if (numero==1) {
			System.out.println("Digite seu nome: ");
			nome = teclado.nextLine();
			teclado.nextLine();
			System.out.println("Digite seu cpf: ");
			cpf = teclado.nextLine();
			c1.setNome(nome);
			c1.setCpf(cpf);
			
			
					c1.setIngresso(i1);
			System.out.println(c1.getNome());
			System.out.println(c1.getCpf());
			System.out.println(c1.getIngresso().getDescricao());

		}
		

		
	}

}
