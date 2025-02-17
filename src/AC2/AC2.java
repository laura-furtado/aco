package AC2;

import java.util.Scanner;

public class AC2 {

	public static void main(String[]arg) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		int x;
		System.out.println("Insira um valor para a: ");
		a = teclado.nextInt();
		System.out.println("Insira um valor para b: ");
		teclado.nextLine();
		b = teclado.nextInt();
		System.out.println("Insira um valor para c: ");
		teclado.nextLine();
		c = teclado.nextInt();
		
		//Impressão
		System.out.println("A equação é " +a+"x^2" + b+"x"+ c);
		d = (b*b) - (4*a*c);
		System.out.println("O valor de delta é "+ d);
		System.out.println("X1 é igual a "+ ((-b)+java.lang.Math.sqrt(d))/2*a);
		System.out.println("X2 é igual a "+ ((-b)-java.lang.Math.sqrt(d))/2*a);
	}}
//ax^2+bx+c