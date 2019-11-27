import java.util.ArrayList;

public class Curso {
	private int codigo;
	private String nome;
	private String ementa;
	private String bibliografia;
	
	ArrayList<Disciplina> discip = new ArrayList<Disciplina>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getBibliografia() {
		return bibliografia;
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
}