package ac19;

public class Main {

	public static void main(String[] args) {
		Carros c1 = new CarroBasico("Fiat 147", 45000);
		Carros c2 = new CarroLuxo("Aero Willys", 16000);
		c1.relatorio();
		System.out.println("Valor diária: "+ c1.calcularDiaria(2457593.20));
		
		System.out.println("-----------------------");
		c2.relatorio();
		System.out.println("Valor diária: "+ c1.calcularDiaria(83463476.89));
		       
		    }
	

}
