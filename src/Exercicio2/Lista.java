package Exercicio2;

public class Lista {
	private Caixa inicio;
	Lista(){
		this.inicio = null;
	}
	public boolean isEmpty(){
		if (this.inicio == null){
			System.out.println("A lista está vazia");
			return true;
		}else{
			System.out.println("Existem temperaturas na lista");
			return false;
		}
	}
	public void addInicio(int temperatura){
		Caixa novaTemp = new Caixa();
		novaTemp.setTemperatura(temperatura);
		novaTemp.setProximo(inicio);
		inicio = novaTemp;
	}
	public void addFinal(int temperatura){
		Caixa novaTemp = new Caixa();
		novaTemp.setTemperatura(temperatura);
		novaTemp.setProximo(null);
		if (inicio == null){
			inicio = novaTemp;	
		}else{
			Caixa aux = inicio;
			while (aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setProximo(novaTemp);
		}
	}
	public void addPosicao(int temperatura, int pos){
		Caixa novaTemp = new Caixa();
		if (pos == 1){
			addInicio(temperatura);
		}else{
			Caixa aux = inicio;
			int contador=1;
				while (aux.getProximo() != null && contador < pos-1){
					aux = aux.getProximo();
					contador++;
				}
				if (contador == pos-1){
					novaTemp.setTemperatura(temperatura);
					novaTemp.setProximo(aux.getProximo());
					aux.setProximo(novaTemp);
				}else{
					System.out.println("Posição inexistente");
				}
		}
	}
	public int removeInicio(){
		int temp=0;
		if (this.inicio == null){
			System.out.println("A lista está vazia");
		}else{
			temp = inicio.getTemperatura();
			inicio= inicio.getProximo();
		}
		return temp;
	}
	public int removeFinal(){
		int temp=0;
		if (inicio == null){
			System.out.println("A lista está vazia");
		}else{	
			if (inicio.getProximo() == null){
				temp = inicio.getTemperatura();
				inicio = null;
			}else{
				Caixa atual = inicio;
				Caixa anterior = inicio;
				
				while (atual.getProximo() != null){
					anterior = atual;
					atual = atual.getProximo();
				}
					temp = atual.getTemperatura();
					anterior.setProximo(null);
			}			
		}
		return temp;
	}
	public int removePosicao(int pos){
		int temp=0, cont=1;
		Caixa atual = inicio;
		if (inicio == null){
			System.out.println("A lista está vazia");
		}else{
			if (pos == 1){
				temp = removeInicio();
			}else{
				while (atual.getProximo() != null){
					atual = atual.getProximo();
					cont++;
				}
				if (pos == 0 || pos > cont){
					System.out.println("Posição inexistente");
				}else{
					if (pos == cont){
						temp = removeFinal();
					}else{
						atual = inicio;
						Caixa anterior = atual; 
						while (pos > 1){
							anterior = atual;
							atual= (atual.getProximo());
							pos--;
						}
						temp = atual.getTemperatura();
						anterior.setProximo(atual.getProximo());
					}
				}
			}
		}
		return temp;
	}
	public void visualiza(){
		if (isEmpty() == true){
		}else{
			Caixa aux = inicio;
			String lista = " ";
			String cont = "conteúdo:";
			while (aux != null){
				lista = lista + "\n" + aux.getTemperatura()+ "˚C ";
				aux = aux.getProximo();
			}
			System.out.println(cont+lista);
		}
	}
}
