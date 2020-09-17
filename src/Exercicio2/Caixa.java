package Exercicio2;

public class Caixa {
	private int temperatura;
	private Caixa proximo;
	
	public void setTemperatura(int temperatura){
		this.temperatura = temperatura;
	}
	public void setProximo (Caixa proximo){
		this.proximo = proximo;
	}
	public int getTemperatura () {
		return this.temperatura;
	}
	public Caixa getProximo (){
		return this.proximo;
	}
	
}
