package ac13;

import java.util.Scanner;

public class Ac13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aluno, avaliacoes;
		double nota, media, percentual, soma, aprovados;
		System.out.println("Digite o número de alunos da turma: ");
		aluno = teclado.nextInt();
		
		System.out.println("Digite a quantidade de avaliações por aluno: ");
		avaliacoes = teclado.nextInt();
		
		aprovados = 0;
		nota =0;
		percentual =0;
		
		
		double[][] matriz = new double[aluno][avaliacoes];
		for(int x=0; x<aluno; x++) {
			media =0;
			soma =0;
			for(int y=0; y<avaliacoes; y++) {
				System.out.println("Digite o valor da "+ (y+1) +"ª avaliacão do aluno: ");
				nota = teclado.nextDouble();
				matriz[x][y] = nota;
				soma = soma +nota;
				}
			media = soma/avaliacoes;
			System.out.println("A média desse aluno é: "+ media);
			if(media>=7) {
				System.out.println("Aluno aprovado!");
				aprovados = aprovados+1;
			}
			else {
				System.out.println("Aluno reprovado!");
			}
		}

		percentual = aprovados/aluno*100;
		System.out.println("A quantidade de alunos aprovados é: " + percentual);
	}

}
