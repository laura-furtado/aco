package ac12;

import java.util.Scanner;

public class Ac12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int alunos, avaliacoes;
		double total, media;
		total = 0;
		
		System.out.println("Inserir total de alunos: ");
		alunos = teclado.nextInt();
		System.out.println("Inserir total de avaliações: ");
		avaliacoes = teclado.nextInt();
		

		double[][] matriz = new double[alunos][avaliacoes];
			for(int i =0; i<matriz.length; i++) {
				for(int j=0; j<matriz[0].length; j++) {
					System.out.println("Inserir valor da "+(j+1)+ "ª avaliação do aluno "+ (i+1));

					matriz[i][j]= teclado.nextDouble();
					total = total + matriz[i][j];}
				}
	
	media = total/(alunos*avaliacoes);
	System.out.println("A média dos alunos foi de " +media);
	}
}
