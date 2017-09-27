package custom.Objects;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	private int limiteSaque;
	private static double juros = 0.04;

	public ContaCorrente(int idConta, int idAgencia, Cliente Cliente, char status, double chequeEspecial, int limiteSaque){
		setIdConta(idConta);
		setIdAgencia(idAgencia);
		setCliente(Cliente);
		setStatus(status);
		setSaldo(0);
		setChequeEspecial(chequeEspecial);
		setLimiteSaque(limiteSaque);
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	@Override
	public void sacar(int valor){
		
		if (valor < saldo){
			saldo -= valor;
		}
		else if (valor < saldo + chequeEspecial){
			chequeEspecial -= valor - saldo;
			setSaldo(0);
		}
		else System.out.println("Saldo insuficiente para realizar a opera��o");
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	public static double getJuros() {
		return juros;
	}

	public static void setJuros(double valor) {
		juros = valor;
	}

	public int getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(int limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}