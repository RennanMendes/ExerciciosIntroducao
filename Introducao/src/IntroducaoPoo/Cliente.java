package IntroducaoPoo;

public class Cliente {
	
	//ATRIBUTOS
	
	private String genero, interesse;
	private int idade;
	private double saldo;
	
	public Cliente() {
		this.genero="N/D";
		this.idade=0;
		this.interesse="N/D";
		this.saldo=0;	
	}
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void status() {
	
		System.out.println("\nO cliente � do g�nero " + this.genero);
		System.out.println("Tem " + this.idade+" anos");
		System.out.println("Deseja comprar um(a) " + this.interesse );
		System.out.println("E possui uma verba de "+this.saldo);
	}

}