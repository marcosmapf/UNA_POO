package mainClass;

import java.sql.Date;

import custom.Objects.Cliente;
import custom.Objects.Conta;
import custom.Objects.ContaCorrente;
import custom.Objects.ContaPoupanca;

public class Lista02_Atividade03 {

	public static void main(String[] args) {
		
		//Adicionando Clientes 
		
		Cliente cli1 = new Cliente(1, "Marcos", "de Andrade", 23);
		Cliente cli2 = new Cliente(2, "Marina", "Emelly", 24);
		Cliente cli3 = new Cliente(3, "Felippe","Weber", 22);
		Cliente cli4 = new Cliente(4, "Messias", "Martins", 24);
		Cliente cli5 = new Cliente(5, "Valdirene", "Aparecida", 22);
		
		//Adicionando Contas
		
		ContaCorrente conta1 = new ContaCorrente(1, 10, cli1, 'B', 300, 1000);
		ContaCorrente conta2 = new ContaCorrente(2, 15, cli2, 'A', 450, 1000);
		ContaCorrente conta3 = new ContaCorrente(3, 21, cli3, 'C', 280, 1000);
		
		ContaPoupanca conta4 = new ContaPoupanca(4, 10, cli4, 'A', 0.015, new Date(System.currentTimeMillis()));
		ContaPoupanca conta5 = new ContaPoupanca(5, 10, cli5, 'D', 0.015, new Date(System.currentTimeMillis() - 1232794121));
		
		//Realizando opera��es aleat�rias
		
		conta1.depositar(200);
		conta2.depositar(500);
		conta3.depositar(10000);
		conta4.depositar(1300);
		conta5.depositar(2800);
		
		conta3.sacar(4000);
		conta5.sacar(200);		
		
		//Imprimindo dados das contas
		imprimirDados(conta1);
		imprimirDados(conta2);
		imprimirDados(conta3);
		imprimirDados(conta4);
		imprimirDados(conta5);
	}
	
	public static void imprimirDados(Conta conta){
		
		if (conta instanceof ContaCorrente){
			ContaCorrente contaC = (ContaCorrente) conta;
			System.out.println(
					"Conta: " + contaC.getIdConta() +
					"\nAg�ncia: " + contaC.getIdAgencia() +
					"\n<------------------------>" + 
					"\nNome: " + contaC.getNomeFromCliente() + " " + contaC.getSobrenomeFromCliente() +
					"\nIdade: " + contaC.getIdadeFromCliente() + " anos" +
					"\nStatus: " + contaC.getStatus() +
					"\nSaldo: " + contaC.getSaldo() +
					"\nLimite do Cheque Especial: " + contaC.getChequeEspecial() +
					"\nLimite de Saque: " + contaC.getLimiteSaque() +
					"\n<------------------------>\n"
					);
		}
		else if (conta instanceof ContaPoupanca){
			ContaPoupanca contaP = (ContaPoupanca) conta;
			System.out.println(
					"Conta: " + contaP.getIdConta() +
					"\nAg�ncia: " + contaP.getIdAgencia() +
					"\n<------------------------>" + 
					"\nNome: " + contaP.getNomeFromCliente() + " " + conta.getSobrenomeFromCliente() +
					"\nIdade: " + contaP.getIdadeFromCliente() + " anos" +
					"\nStatus: " + contaP.getStatus() +
					"\nSaldo: " + contaP.getSaldo() +
					"\nRendimento: " + contaP.getRendimento() +
					"\nAnivers�rio: " + contaP.getAniversario() +
					"\n<------------------------>\n"
			);
		}
	}
}