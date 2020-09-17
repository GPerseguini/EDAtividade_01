package exercicio3;

public class Principal {
	public static void main (String[] args){
		String nome, turma, semestre;
		int ra;
		Lista lista = new Lista();
		
		lista.addFinal("Ramon",4,"Log","4 Semestre"); //Inserção Ramon, ra:4, curso:log, semestre : 4
		// lista contém Ramon
		lista.addInicio("Lucas",1,"ADS","1 Semestre");//Inserção Lucas, ra:1,curso: ADS, semestre: 1
		// lista contém Lucas, Ramon
	lista.addPosicao("Pedro",2,"Comex","2 Semestre",2);//Inserção Pedro, ra:2, curso: Comex, semestre: 2
		// lista contém Lucas, Pedro, Ramon
		lista.addPosicao("Maria",3,"Comex","3 Semestre",3);//Inserção Maria, ra:3, curso: Comex, semestre: 3
		//lista contém  Lucas, Pedro, Maria, Ramon
		lista.addFinal("Cisco",5,"Polimeros","5 Semestre");//Inserção Cisco, ra:3, curso: Polimeros, semestree: 5
		//lista contém Lucas, Pedro, Maria, Ramon, Cisco
		
		lista.removeInicio(); //primeiro elemento removido
		//lista contém: Pedro, Maria, Ramon, Cisco
		
		lista.removeFinal(); //último elemento removido
		//lista contém: Pedro, Maria, Ramon
		
		lista.removePosicao(2); //elemento na posição 2 removido
		//lista contém:Pedro, Ramon
		
		lista.visualiza();//mostra os elementos da lista
	}
}
