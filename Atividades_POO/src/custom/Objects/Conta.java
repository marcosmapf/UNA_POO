package custom.Objects;

public abstract class Conta {

	protected int idConta;
	protected int idAgencia;
	protected Cliente cliente;
	protected double saldo;
	protected char status;
	
	//Fazer classe Cliente ao inv�s de ID cliente
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public void depositar(int valor){
		
		this.saldo += valor;
	}
	
	public void sacar(int valor){

		if (valor < saldo){
			saldo -= valor;
		}
		else System.out.println("Saldo insuficiente para realizar a opera��o");		
	}
	
	public String checarSaldo(){
		return "R$: " + this.saldo;
	}
	
	public void transferencia(int idDestino, double valor){
		if (valor < saldo){
		//Conex�o com banco de dados "Where idConta = idDestino" e aumento do saldo do destinatario;
		saldo -= valor;
		}		
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public String getNomeFromCliente() {
		return cliente.getNome();
	}

	public void setNomeFromCliente(String nome) {
		this.cliente.setNome(nome);
	}
	
	public String getSobrenomeFromCliente() {
		return cliente.getSobrenome();
	}

	public void setSobrenomeFromCliente(String sobrenome) {
		this.cliente.setSobrenome(sobrenome);
	}
	
	public int getIdadeFromCliente() {
		return cliente.getIdade();
	}

	public void setIdadeFromCliente(int idade) {
		this.cliente.setIdade(idade);
	}	
}