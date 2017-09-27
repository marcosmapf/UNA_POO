package custom.Objects;

public class Cidade {
	
	private long id;
	private String nome;
	private String estado;
	private int habitantes;
	private double somaSalario;
	private double maiorSalario;
	
	public Cidade(long id, String nome, String estado){
		setId(id);
		setNome(nome);
		setEstado(estado);
		setHabitantes(0);
		setMaiorSalario(0);
	}

	/*<--------------------------------------------------------------------------------------->*/

	public void incrementHabitantes() {
		habitantes++;
	}
	
	public void decrementHabitantes(){
		habitantes--;
	}
	
	public void incrementSomaSalario(double salario) {
		somaSalario += salario;
	}
	
	public void decrementSomaSalario(double salario){
		somaSalario -= salario;
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getHabitantes() {
		return habitantes;
	}
	
	public void setHabitantes(int habitantes){
		this.habitantes = habitantes;
	}

	public double getMaiorSalario() {
		return maiorSalario;
	}

	public void setMaiorSalario(double maiorSalario) {
		this.maiorSalario = maiorSalario;
	}

	public double getSomaSalario() {
		return somaSalario;
	}

	public void setSomaSalario(double somaSalario) {
		this.somaSalario = somaSalario;
	}	
}
