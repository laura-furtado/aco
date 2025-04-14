package ac18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 System.out.println("Qual o nome do aluno: ");
		 String nomeAluno = teclado.nextLine();
		 System.out.println("Qual o número de registro do aluno: ");
		 String registroAluno = teclado.nextLine();
		 System.out.println("De qual curso o aluno participa: ");
		 String nomeDoCurso = teclado.nextLine();
		 if (nomeDoCurso.equals("Curso Padrão")){
			 System.out.println("Digite a nota da 1° avaliação: ");
			 double avaliacao1P = teclado.nextDouble(); 
			 System.out.println("Digite a nota da 2° avaliação: ");
			 double avaliacao2P = teclado.nextDouble(); 
			 System.out.println("Digite a nota da 3° avaliação: ");
			 double avaliacao3P = teclado.nextDouble(); 
			 System.out.println("Digite o número de faltas");
			 int faltasP = teclado.nextInt();
			 CursoPadrao cp1 = new CursoPadrao(nomeDoCurso, 40, avaliacao1P, avaliacao2P, avaliacao3P, faltasP);
			 String faltasPF= cp1.faltasP(faltasP);
			 double mediaPF = cp1.mediaP(avaliacao1P, avaliacao2P, avaliacao3P);
			Aluno a1 = new Aluno (nomeAluno, registroAluno,cp1);
			 if(mediaPF>= 7 && faltasPF.equals("faltas permitidas")) {
				 System.out.println(nomeAluno +" aprovado com "+ mediaPF + " e "+ faltasPF+ "faltas!");
			 }
			 else {
				 System.out.println(nomeAluno +" reprovado com "+ mediaPF + " e "+ faltasPF+ "faltas!");
			 }
		 }
		 else {
			 System.out.println("Digite a nota da 1° avaliação: ");
			 double avaliacao1A = teclado.nextDouble(); 
			 System.out.println("Digite a nota da 2° avaliação: ");
			 double avaliacao2A = teclado.nextDouble(); 
			 System.out.println("Digite a nota da 3° avaliação: ");
			 double avaliacao3A = teclado.nextDouble();
			 System.out.println("Digite o número de faltas");
			 int faltasA = teclado.nextInt();
			 CursoAvancado ca1 = new CursoAvancado(nomeDoCurso, 40, avaliacao1A, avaliacao2A, avaliacao3A, faltasA);
			 String faltasAF = ca1.faltasA(faltasA);
			 double mediaAF =ca1.mediaA(avaliacao1A, avaliacao2A, avaliacao3A);
			 Aluno a1 = new Aluno (nomeAluno, registroAluno,ca1);
			 if(mediaAF>= 7 && faltasAF.equals("faltas permitidas")) {
				 System.out.println(nomeAluno +" aprovado com "+ mediaAF + " e "+ faltasAF+ "faltas!");
			 }
			 else {
				 System.out.println(nomeAluno +" reprovado com "+ mediaAF + " e "+ faltasAF+ "faltas!");
			 }
		 }
	
		 

	}

}
