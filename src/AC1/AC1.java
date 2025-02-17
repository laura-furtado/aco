package AC1;

import java.util.Scanner;
public class AC1 {

	public static void main(String[]arg) {
		Scanner teclado = new Scanner(System.in);
		String fun1;
		String fun2;
		String fun3;
		double salario1;
		double salario2;
		double salario3;
		

		System.out.println("Insira o nome do funcionário 1: ");
		fun1 = teclado.nextLine();
		System.out.println("Insira o salário do funcionário 1: ");
		salario1 = teclado.nextDouble();
		System.out.println("Insira o nome do funcionário 2: ");
		teclado.nextLine();
		fun2 = teclado.nextLine();
		System.out.println("Insira o salário do funcionário 2: ");
		salario2 = teclado.nextDouble();
		System.out.println("Insira o nome do funcionário 3: ");
		teclado.nextLine();
		fun3 = teclado.nextLine();
		System.out.println("Insira o salário do funcionário 3: ");
		salario3 = teclado.nextDouble();
		
		//Impressão
		System.out.println("---------------------------------------------------------");
		System.out.println(fun1 + "-> salário: R$"+ salario1);
		System.out.println(fun2 + "-> salário: R$" + salario2);
		System.out.println(fun3 + "-> salário: R$" + salario3);
		System.out.print("A média salarial é de R$:");
		System.out.print((salario1+salario2+salario3)/3);

	}
}