package Heranca;

public class Preguica extends Animal {

	private boolean subir;

	public boolean getSubir() {
		return subir;
	}
	
	public void subir() {
		subir=true;
	}
	
	public void naoSubir() {
		subir=false;
	}
	
}
