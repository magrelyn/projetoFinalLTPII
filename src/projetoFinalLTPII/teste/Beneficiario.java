package projetoFinalLTPII.teste;

public class Beneficiario {

	public String nomeBenefi;
	public int idadeBenefi;
	public int quantDepend;
	public String[] nomeDepend;
	public int[] idadeDepend;
	public double valorPlan;
	
	public Beneficiario() {
		
	}

	public Beneficiario(String nomeBenefi, int idadeBenefi, int quantDepend, String[] nomeDepend, int[] idadeDepend,
			double valorPlan) {

		this.nomeBenefi = nomeBenefi;
		this.idadeBenefi = idadeBenefi;
		this.quantDepend = quantDepend;

		this.nomeDepend = new String[quantDepend];
		this.idadeDepend = new int[quantDepend];

		this.valorPlan = valorPlan;
	}

	public String getNomeBenefi() {
		return nomeBenefi;
	}

	public void setNomeBenefi(String nomeBenefi) {
		this.nomeBenefi = nomeBenefi;
	}

	public int getIdadeBenefi() {
		return idadeBenefi;
	}

	public void setIdadeBenefi(int idadeBenefi) {
		this.idadeBenefi = idadeBenefi;
	}

	public int getQuantDepend() {
		return quantDepend;
	}

	public void setQuantDepend(int quantDepend) {
		this.quantDepend = quantDepend;
	}

	public String[] getNomeDepend() {
		return nomeDepend;
	}

	public void setNomeDepend(String[] nomeDepend) {
		this.nomeDepend = nomeDepend;
	}

	public int[] getIdadeDepend() {
		return idadeDepend;
	}

	public void setIdadeDepend(int[] idadeDepend) {
		this.idadeDepend = idadeDepend;
	}

	public double getValorPlan() {
		return valorPlan;
	}

	public void setValorPlan(double valorPlan) {
		this.valorPlan = valorPlan;
	}

}
