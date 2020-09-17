package Exercicio2;
import javax.swing.JOptionPane;

public class ListaTemperatura {
	public static void main (String[] args){
		int temperatura,opc=0,pos;
		Lista lista = new Lista();
		
		while (opc != 9){
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada:\n 1 - Verificar se a lista está vazia\n 2 - Adicionar um temperatura no início\n 3 - Adicionar uma temperatura no final\n 4 - Adicionar uma temperatura em posição específica\n 5 - Remover a temperatura no início\n 6 - Remover a temperatura no final\n 7 - Remover a temperatura em uma posição específica\n 8 - Visualizar lista\n 9 - Sair "));
			switch(opc){
			case 1:
				lista.isEmpty();
				break;
			case 2:
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite uma temperatura para adicionar no início")); //inserção número 1 --- Saída: a temperatura foi inserida no começo da lista
				lista.addInicio(temperatura);
				System.out.println("Temperatura adicionada ao início da lista");
				break;
			case 3:
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite uma temperatura para adicionar no final")); //inserção número 2 --- Saída: a temperatura foi adicionada ao final da lista
				lista.addFinal(temperatura);																				   //inserção número 4 --- Saída: a temperatura foi adicionada ao final da lista
 				System.out.println("Temperatura adicionada ao final da lista");												   //inserção número 5 --- Saída: a temperatura foi adicionada ao final da lista
				break;
			case 4:
				temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite uma temperatura")); //inserção número 3 --- 
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que deseja adicionar"));//posição 3 --- saída: A temperatura foi adicionada na posição 3 da lista
				lista.addPosicao(temperatura, pos);
				System.out.println("Temperatura adicionada a posição "+pos+" da lista");
				break;
			case 5:
				System.out.println("O elemento removido foi: " + lista.removeInicio()); //o elemento removido foi: 1.
				break;
			case 6:
				System.out.println("O elemento removido foi: " + lista.removeFinal()); // o elemento removido foi 5
				break;
			case 7:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que deseja remover")); //posição 2 --- saída: a temperatura 3 foi removida da lista.
				System.out.println("O elemento removido foi: " + lista.removePosicao(pos));
				break;
			case 8:
				lista.visualiza(); // saída: conteúdo: 2, 4.
				break;
			case 9:
				System.out.println("Obrigado por utilizar");
			default:
				System.out.println("Opção inválida, selecione novamente"); //inserção número 10 ---Saída: Opção inválida, selecione novamente
			}
		}
		

	}
	
}
