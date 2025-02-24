package AC8;

import java.util.Scanner;

public class AC8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String produto;
		String deseja;
		int quantidade, resp;
		do {
		System.out.println("Digite o nome do produto que deseja adicionar ao estoque: ");
		produto = teclado.nextLine();
		System.out.println("Digite a quantidade: ");
		quantidade = teclado.nextInt();
		System.out.println("Digite 1 para adicionar um item ao estoque, 2 para remover um item do estoque ou 3 para exibir o estoque atual ");
		resp = teclado.nextInt();
		if (resp == 1) {
			quantidade= quantidade+1;
			System.out.println("Possuímos "+ quantidade + " quantidades de "+ produto);
		}
		else if (resp == 2) {
			quantidade= quantidade-1;
			System.out.println("Possuímos "+ quantidade + " quantidades de "+ produto);
		}
		else if (resp==3) {
			System.out.println("Possuímos "+ quantidade + " quantidades de "+ produto);
		}
		System.out.println("Digite sim caso queira continuar ");
		teclado.nextLine();
		deseja = teclado.nextLine();
		}while(deseja.equals("sim"));

	}

}
