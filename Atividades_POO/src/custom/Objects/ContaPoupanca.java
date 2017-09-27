package custom.Objects;

import java.util.Date;

public class ContaPoupanca extends Conta {

	private double rendimento;
	private Date aniversario;
	
	public ContaPoupanca(int idConta, int idAgencia, int idCliente, double saldo, char status, double rendimento, Date aniversario){
		setIdConta(idConta);
		setIdAgencia(idAgencia);
		setIdCliente(idCliente);
		setSaldo(saldo);
		setStatus(status);
		setRendimento(rendimento);
		setAniversario(aniversario);
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
}
