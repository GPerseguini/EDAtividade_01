package exercicio3;

public class Lista {
	private Aluno inicio;
	Lista(){
		this.inicio = null;
	}
	
	public boolean isEmpty(){
		if (this.inicio == null){
			System.out.println("Não há alunos cadastrados na lista");
			return true;
		}else{
			return false;
		}
	}
	public void addInicio(String nome, int ra, String turma, String semestre){
		Aluno novoAluno = new Aluno();
		novoAluno.setNome(nome);
		novoAluno.setRA(ra);
		novoAluno.setTurma(turma);
		novoAluno.setSemestre(semestre);
		novoAluno.setProximo(inicio);
		inicio = novoAluno;
	}
	public void addFinal(String nome, int ra, String turma, String semestre){
		Aluno novoAluno = new Aluno();
		novoAluno.setNome(nome);
		novoAluno.setRA(ra);
		novoAluno.setTurma(turma);
		novoAluno.setSemestre(semestre);
		novoAluno.setProximo(null);
		if (inicio == null){
			inicio = novoAluno;	
		}else{
			Aluno aux = inicio;
			while (aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setProximo(novoAluno);
		}
	}

	public void addPosicao(String nome, int ra, String turma, String semestre, int pos){
		Aluno novoAluno = new Aluno();
		if (pos == 1){
			addInicio(nome,ra,turma,semestre);
		}else{
			Aluno aux = inicio;
			int contador=1;
				while (aux.getProximo() != null && contador < pos-1){
					aux = aux.getProximo();
					contador++;
				}
				if (contador == pos-1){
					novoAluno.setNome(nome);
					novoAluno.setRA(ra);
					novoAluno.setTurma(turma);
					novoAluno.setSemestre(semestre);
					novoAluno.setProximo(aux.getProximo());
					aux.setProximo(novoAluno);
				}else{
					System.out.println("Posição inexistente");
				}
		}
	}
	public String removeInicio(){
		String aluno=" ";
		if (this.inicio == null){
			System.out.println("A lista está vazia");
		}else{
			aluno = inicio.getNome();
			inicio= inicio.getProximo();
		}
		return aluno;
	}
	public String removeFinal(){
		String aluno=" ";
		if (inicio == null){
			System.out.println("A lista está vazia");
		}else{	
			if (inicio.getProximo() == null){
				aluno = inicio.getNome();
				inicio = null;
			}else{
				Aluno atual = inicio;
				Aluno anterior = inicio;
				
				while (atual.getProximo() != null){
					anterior = atual;
					atual = atual.getProximo();
				}
					aluno = atual.getNome();
					anterior.setProximo(null);
			}			
		}
		return aluno;
	}
	public String removePosicao(int pos){
		int cont=1;
		String aluno = "";
		Aluno atual = inicio;
		if (inicio == null){
			System.out.println("A lista está vazia");
		}else{
			if (pos == 1){
				aluno = removeInicio();
			}else{
				while (atual.getProximo() != null){
					atual = atual.getProximo();
					cont++;
				}
				if (pos == 0 || pos > cont){
					System.out.println("Posição inexistente");
				}else{
					if (pos == cont){
						aluno = removeFinal();
					}else{
						atual = inicio;
						Aluno anterior = atual; 
						while (pos > 1){
							anterior = atual;
							atual= (atual.getProximo());
							pos--;
						}
						aluno = atual.getNome();
						anterior.setProximo(atual.getProximo());
					}
				}
			}
		}
		return aluno;
	}
	public void visualiza(){
		if (isEmpty() == true){
		}else{
			Aluno aux = inicio;
			String lista = " ";
			String cont = "conteúdo:";
			while (aux != null){
				lista = lista + "\nAluno: " + aux.getNome()+" RA: "+aux.getRA()+" Turma: "+aux.getTurma()+" Semestre: "+aux.getSemestre();
				aux = aux.getProximo();
			}
			System.out.println(cont+lista);
		}
	}
}
