package custom.Objects;

public abstract class Funcionario {

	protected int codigo;
	protected String nome;
	protected String sobrenome;
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
}
