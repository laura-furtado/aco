package AC6;

import java.util.Scanner;

public class AC6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String senha, tentativa;
		senha = "J@vaPOO";
		
		for(int x =0; x<3; x++) {
			System.out.println("Digite a senha: ");
			tentativa = teclado.nextLine();
			if (tentativa.equals(senha)) {
				System.out.println("Senha correta!");
				x=4;
			}
			else {
				System.out.println("Tentativa "+(x+1)+" incorreta, tente novamente");
			}
			if (x==2) {
				System.out.println("Você excedeu o número máximo de tentativas!");
			}
		};
		
	};

}
