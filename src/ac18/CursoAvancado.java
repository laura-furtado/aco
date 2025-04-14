package ac18;

public class CursoAvancado extends Cursos{
	double avaliacao1;
	double avaliacao2;
	double avaliacao3;
	int faltas;
	
	public CursoAvancado(String nome, int cargaHoraria, double avaliacao1, double avaliacao2, double avaliacao3, int faltas) {
		super(nome, cargaHoraria);
		this.avaliacao1 = avaliacao1;
		this.avaliacao2 = avaliacao2;
		this.avaliacao3 = avaliacao3;
		this.faltas = faltas;
	}

	public double mediaA(double avaliacao1,double avaliacao2, double avaliacao3) {
		return (avaliacao1+avaliacao2+avaliacao3)/(3+5+2);
	}
	
	public String faltasA(int faltas) {
		if (faltas<=0.10*40) {
			return "faltas permitidas";
		}
		else {
			return "número de faltas excede o permitido";
		}
	}
}
