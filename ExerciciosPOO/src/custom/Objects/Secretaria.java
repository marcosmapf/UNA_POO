package custom.Objects;

public class Secretaria extends Funcionario {

	private String especialidade;
	
	public Secretaria(){
		this.codigo = -1;
		this.nome = "";
		this.especialidade = "";
	}
	
	public Secretaria(int codigo, String nome, String especialidade){
		this.codigo = codigo;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public void imprimirDados(){
		System.out.println(
				"Código: " + this.codigo +
				"\nNome: " + this.nome +
				"\nSobrenome: " + this.sobrenome +
				"\nEspecialidade: " + this.especialidade
				);
	}
	
	public String getEspecialidade(){
		return this.especialidade;
	}
	
	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}
}
