public class Pessoa {
	private String nome;
	private String data_nasc;
	private int senha;
    private String login;
    Endereco endereco = new Endereco();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String i) {
		this.data_nasc = i;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
    }	
    public void setEndereco(String rua, String bairro, int numero){
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setNumero(numero);
    }
    public Endereco getEndereco(){
        return endereco;
    }
}