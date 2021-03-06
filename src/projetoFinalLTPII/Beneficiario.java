package projetoFinalLTPII;

public class Beneficiario {
	
	public int qnteDep;
	public String[] nomeDep;
	int[] idadeDep;
	
	private static int i = 0;
	
	public Beneficiario(int qnteDep, int[] idadeDep) {
		nomeDep = new String[qnteDep];
		idadeDep = new int[qnteDep];
	}
	
	public Beneficiario(int qnteDep) {
		nomeDep = new String[qnteDep];
		idadeDep = new int[qnteDep];
		i = 0;
	}
	
	public void add(int idade, String nome) {
		this.qnteDep++;
		this.nomeDep[i] = nome;
		this.idadeDep[i] = idade;
		i++;
	}
	
	public static void main (String[] args) {
		
		
		Beneficiario vetBen[] = new Beneficiario[100];
		int i = 0;
		
		String p = "";
		while( !p.equals("XXX") || !p.equals("xxx") ) {
			
			// Leitura de dados
			Beneficiario obj = new Beneficiario(3);
			obj.escreve();
		}

		
	}	
	
	public void escreve() {
		
	}

}



