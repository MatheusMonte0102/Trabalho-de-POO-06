import java.util.ArrayList;
public class Aluno extends Pessoa{
	private int matricula;
	private String status;
    
    ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	Curso curso = new Curso();
    
	public void emitirhistorico() {
		for(Avaliacao x : avaliacoes) {
			System.out.println(x);
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Curso infoCurso(){ //Retorna as informações do curso do aluno
        return curso;
    }
}