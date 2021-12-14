package IntroducaoPoo;

public class Eletronico {
	
	private String tipo, nome, sistema, processador;
	private int memoriaRam, ssd, hd, placaVideo;
	private boolean comprar;
	
	public Eletronico() {
		
		this.sistema="Windows";
		this.processador="Intel core i7";
		this.memoriaRam=4;
		this.ssd=512;
		this.hd=2;
		this.placaVideo=4;
		this.comprar=false;
		
		
	}
	
	public String getSistema() {
		return sistema;
	}
	public String getProcessador() {
		return processador;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public int getSsd() {
		return ssd;
	}
	public int getHd() {
		return hd;
	}
	public int getPlacaVideo() {
		return placaVideo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setComprar(boolean comprar) {
		this.comprar = comprar;
	}

	public void status() {
		
		if(comprar)
		{
			System.out.println("O "+this.tipo+" foi comprado!");
		}
		else
		{
			System.out.println("O produto foi n�o comprado!");
		}
		
	}
	
	
	
	
	

}