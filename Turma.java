import java.util.ArrayList;
public class Turma {
	
	private int ano;
	private int credito;
	private int cod;
	private String semestre;
	private String horario;
	
	Disciplina disc = new Disciplina();
	Curso curs1 = new Curso();
	ArrayList<Aluno> alun = new ArrayList<Aluno>();
	ArrayList<Avaliacao> avalia = new ArrayList<Avaliacao>();
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}