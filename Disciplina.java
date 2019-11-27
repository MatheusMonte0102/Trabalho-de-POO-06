import java.util.ArrayList;

public class Disciplina{
    private String nome;

    ArrayList<Disciplina> requisitos_dis = new ArrayList<Disciplina>();

    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){
        this.nome = _nome;
    }
    public void addDisciplina(Disciplina adDis){
        requisitos_dis.add(adDis);
    }
    public Disciplina getRequisitos(){
        return requisitos_dis;
    }

}