package custom.Objects;
import custom.Objects.Cidade;

public class Habitante {
	
	private int id;
	private String nome;
	private Cidade cidade;
	private double salario;
	private int idade;

	public Habitante (int id, String nome, int idade, Cidade cidade, double salario) {
		setId(id);
		setNome(nome);
		setIdade(idade);
		setCidade(cidade);
		setSalario(salario);
		incrementarCidadao(salario);
		atualizarMaiorSalario(salario);
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	
	private void atualizarMaiorSalario(double salario) {
		if (salario > cidade.getMaiorSalario())
			cidade.setMaiorSalario(salario);
	}

	private void incrementarCidadao(double salario) {
		cidade.incrementHabitantes();
		cidade.incrementSomaSalario(salario);
	}

	public static void imprimirMediaSalario(Cidade cidade) {
		try {
			System.out.println("A média salarial da cidade " + cidade.getNome() + " é: " + (cidade.getSomaSalario() / cidade.getHabitantes()));
		}
		catch (Exception e) {
			System.out.println("Não existem habitantes cadastrados");
		}
	}

	public static void informarMaiorSalario(Cidade cidade) {
		try {
			System.out.println("O maior salario de " + cidade.getNome() + " é: " + cidade.getMaiorSalario());
		}
		catch (Exception e) {
			System.out.println("Não existem habitantes cadastrados na cidade");
		}
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade.getNome();
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstadoFromCidade(){
		return this.cidade.getEstado();
	}
}