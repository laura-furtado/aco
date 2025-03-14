package ac10;


public class Aluno {
	private String Nome;
	private String matricula;
	private Double apUm, apDois, ac, as;
	private double media;
	private Boolean status;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public Double getApUm() {
		return apUm;
	}
	public void setApUm(Double apUm) {
		this.apUm = apUm;
	}
	
	
	public Double getApDois() {
		return apDois;
	}
	public void setApDois(Double apDois) {
		this.apDois = apDois;
	}
	
	
	public Double getAc() {
		return ac;
	}
	public void setAc(Double ac) {
		this.ac = ac;
	}
	
	
	public Double getAs() {
		return as;
	}
	public void setAs(Double as) {
		this.as = as;
	}
	
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	public Boolean getStatus() {
		return media >= 7.0;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	public void calcularMedia ( Double apUm, Double apDois,Double ac) {
		media = (apUm*0.4) + (apDois*0.4) + (ac*0.2);
	}
	
	public void aplicarRecuperacao() {
        if (media < 7.0 && as != null) {
            if (apUm < apDois) {
                apUm = as;
            } else {
                apDois = as;
            }
            calcularMedia(apUm,apDois,ac);
        }
	}
	public String toString() {
		return "Aluno[nome="+ Nome + ",matricula=" + matricula + ", ap1=" + apUm + ", ap2=" + apDois +
				", ac=" + ac + ", as=" + as + ", media=" + media + ", status=" + status +"]";
	}
	
	
}