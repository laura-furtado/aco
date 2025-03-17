package ac14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ac14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;
		double preco, soma;
		soma =0;
		int numeroParcelas;
		double valorTotal =0;
		double valorParcela;
		int parc, resp =0;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

		do{
			System.out.println("Nome produto: ");
			nome = teclado.nextLine();
			System.out.println("Valor: R$ ");
			preco = teclado.nextDouble();
			
			
			Produto produto = new Produto(nome, preco);
			listaProdutos.add(produto);
			System.out.println("Deseja continuar? 0-sim/ 1-não");
			resp = teclado.nextInt();
			teclado.nextLine();
		}while(resp==0);
		System.out.print("Qual o numero de parcelas: ");
		parc = teclado.nextInt();
		for(Produto p : listaProdutos) {
		soma += p.getPreco();

	}

	System.out.printf("O valor final da compra foi de R$%.2f\n",soma);
	System.out.printf("Cada uma das %d parcelas custa R$%.2f",parc,(soma/parc));

	
			
	}

}
