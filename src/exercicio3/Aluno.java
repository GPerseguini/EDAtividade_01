package exercicio3;

public class Aluno {
	private String nome;
	private int ra;
	private String turma;
	private String semestre;
	private Aluno proximo;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRA(int ra){
		this.ra = ra;
	}
	public void setTurma(String turma){
		this.turma = turma;
	}
	public void setSemestre(String semestre){
		this.semestre = semestre;
	}
	public void setProximo(Aluno proximo){
		this.proximo = proximo;
	}
	public String getNome(){
		return this.nome;
	}
	public int getRA (){
		return this.ra;
	}
	public String getTurma (){
		return this.turma;
	}
	public String getSemestre (){
		return this.semestre;
	}
	public Aluno getProximo(){
		return this.proximo;
	}
}
