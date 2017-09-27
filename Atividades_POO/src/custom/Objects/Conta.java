package custom.Objects;

public abstract class Conta {

	protected int idConta;
	protected int idAgencia;
	protected int idCliente;
	protected double saldo;
	protected char status;
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public void depositar(int valor){
		
		this.saldo += valor;
	}
	
	public void sacar(int valor){

		if (valor < saldo){
			saldo -= valor;
			System.out.println("Imagine que est� saindo da m�quina " + valor + " reais :D");
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

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
}
