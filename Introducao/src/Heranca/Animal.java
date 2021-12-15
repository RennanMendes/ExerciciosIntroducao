package Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	private boolean som;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean getSom() {
		return som;
	}
	
	public void emitirSom () {
		this.som = true;
	}
	
	public void naoPerturbe () {
		this.som = false;
	}
	

}