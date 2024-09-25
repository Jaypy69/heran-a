package Herança;

public class Moto {
	private int cilindrada;
	
	public Moto (int ano, int cilindrada, String marca, String modelo, String cor){
		super(ano, marca, modelo, cor);
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public  void setCilindrada (int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
    
