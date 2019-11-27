import java.util.Vector;
import java.util.ArrayList;

public class Instituicao {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	Secretaria secr = new Secretaria();
	Vector historico = new Vector();
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	Diretor d1 = new Diretor();
	Coordenador cod1 = new Coordenador();
	Professor p1 = new Professor();
	
	public boolean incluFuncionarios() {
		
		p1.setNome("mathias");
		p1.setLogin("dssdsd");
		p1.setSenha(322200);
		p1.setData_nasc("12/12/2122");
		professores.add(p1);
		
		p1.setNome("pedro");
		p1.setLogin("dsadsd");
		p1.setSenha(322200);
		p1.setData_nasc("31/01/1999");
		professores.add(p1);
		
		p1.setNome("mathias");
		p1.setLogin("dssdsd");
		p1.setSenha(11111);
		p1.setData_nasc("12/12/2122");
		professores.add(p1);
		
		p1.setNome("gggf");
		p1.setLogin("3232");
		p1.setSenha(12111);
		p1.setData_nasc("s323232");
		professores.add(p1);
		
		return true;
	}
	public ArrayList<Curso> getCursos(){
		return cursos;
	}
}