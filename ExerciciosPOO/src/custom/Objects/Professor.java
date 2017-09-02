package custom.Objects;

public class Professor extends Funcionario {

	private String titulacao;
	
	public Professor(){
		this.codigo = -1;
		this.nome = "";
		this.titulacao = "";
	}
	
	public Professor(int codigo, String nome, String titulacao){
		this.codigo = codigo;
		this.nome = nome;
		this.titulacao = titulacao;
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public void imprimirDados(){
		System.out.println(
				"Código: " + this.codigo +
				"\nNome: " + this.nome +
				"\nSobrenome: " + this.sobrenome +
				"\nTitulação: " + this.titulacao
				);
	}
	
	public String getTitulacao(){
		return this.titulacao;
	}
	
	public void setTitulacao(String titulacao){
		this.titulacao = titulacao;
	}
}
