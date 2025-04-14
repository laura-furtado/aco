package ac18;

public class CursoPadrao extends Cursos {
	double avaliacao1;
	double avaliacao2;
	double avaliacao3;
	int faltas;
	
	public CursoPadrao(String nome, int cargaHoraria, double avaliacao1, double avaliacao2, double avaliacao3, int faltas) {
		super(nome, cargaHoraria);
		this.avaliacao1 = avaliacao1;
		this.avaliacao2 = avaliacao2;
		this.avaliacao3 = avaliacao3;
		this.faltas = faltas;
		
	}

	public double mediaP(double avaliacao1,double avaliacao2, double avaliacao3) {
		return (avaliacao1+avaliacao2+avaliacao3)/3;
	}
	
	public String faltasP(int faltas) {
		if (faltas<=0.10*40) {
			return "faltas permitidas";
		}
		else {
			return "número de faltas excede o permitido";
		}
	}
}
