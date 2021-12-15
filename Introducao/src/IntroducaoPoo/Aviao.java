package IntroducaoPoo;

public class Aviao {
	
	private String cor, modelo, companhia;
	private boolean ligado, embarque;
	
	public Aviao() {
		
		this.ligado=false;
		this.embarque=false;
	}
	
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	 
	public void liga() {
		this.ligado=true;
	}
	
	public void passageirosAbordo() {
		this.embarque=true;
	}

	public void decolar() {
		if(ligado&&embarque)
		{
			System.out.println("O avi�o esta decolando!");
		}
		else
		{
			System.out.println("ERRO: O avi�o n�o pode decolar");
		}
	}
	
	public void status() {
		System.out.println("O avi�o � da cor: "+this.cor);
		System.out.println("O vo� ser� "+this.modelo);
		System.out.println("A companhia escolhida � "+this.companhia);
	}
}
