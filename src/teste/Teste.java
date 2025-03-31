package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Servico> servicos = new ArrayList();
		Servico s1 = new Servico(1, "Corte ", 50.00);
		Servico s2 = new Servico(2, "Barba ", 50.00);
		servicos.add(s1);
		servicos.add(s2);
		String nomecliente;
		int qtdSer, escolha, qtdservicos;
		double soma=0, total;
		
		Cliente c1 = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		nomecliente = teclado.nextLine();
		c1.setNome(nomecliente);
		System.out.println("Quantos serviços o cliente deseja? ");
		qtdSer = teclado.nextInt();
		for(int i=0; i<qtdSer; i++) {
			System.out.println("Digite qual serviço deseja: ");
			System.out.println("1 "+s1.getNomeServico() + " valor: "+ s1.getValor());
			System.out.println("2 " +s2.getNomeServico() + " valor: "+ s2.getValor());
			//System.out.println("3 "+ s3.getNomeServico() + " valor: "+ s3.getValor());
			//System.out.println("4 "+s4.getNomeServico() + " valor: "+ s4.getValor());
			//System.out.println("5 "+s5.getNomeServico() + " valor: "+ s5.getValor());
			//System.out.println("6 "+s6.getNomeServico() + " valor: "+ s6.getValor());
			escolha = teclado.nextInt();
			for(Servico s: servicos) {
				if(escolha==(s.getId())) {
					soma += +s.getValor();
					c1.AdicionarServico(s);
				}
			}
			
		}
	System.out.println("O total do cliente "+ c1.getNome()+ " é de "+ soma);
		//printar os servicos de cada cliente
	qtdservicos = c1.getServicos().size();
	for(Servico s: c1.getServicos()) {
		System.out.println(s.getNomeServico());
	}
	
		
	}

}
