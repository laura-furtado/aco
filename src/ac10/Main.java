package ac10;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int x;
		x=1;
		while (x>=1) {
			
			
			Scanner digito = new Scanner(System.in);
			String nome, matricula;
			double ap1, ap2, ac, as, media;
			
			System.out.println("digite o nome: ");
			nome = digito.nextLine();
			
			System.out.println("digite a matricula: ");
			matricula = digito.nextLine();
			
			System.out.println("digite a nota ap1: ");
			ap1 = digito.nextDouble();
			
			System.out.println("digite a nota ap2: ");
			ap2 = digito.nextDouble();
			
			System.out.println("digite a nota ac: ");
			ac = digito.nextDouble();
			
			Aluno al = new Aluno();
			al.setNome(nome);
			al.setMatricula(matricula);
			al.setApUm(ap1);
			al.setApDois(ap2);
			al.setAc(ac);
			
			media=ap1*0.4+ap2*0.4+ac*0.2;
			al.calcularMedia(ap1,ap2,ac);
			
			if (media<7) {
				System.out.println("aluno abaixo da media, qual nota da as? ");
				as = digito.nextDouble();
				al.setAs(as);
                al.aplicarRecuperacao();
					
			}
			al.getStatus();
			
			System.out.println(al.toString());
			System.out.println("gostaria de continaur digite 1, caso não 0");
			x = digito.nextInt();
			digito.nextLine();
				
		}
		
	}
}