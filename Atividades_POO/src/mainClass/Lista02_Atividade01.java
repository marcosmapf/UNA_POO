package mainClass;

import custom.Objects.Cidade;
import custom.Objects.Habitante;

public class Lista02_Atividade01 {

	public static void main(String[] args) {

		Cidade cid1 = new Cidade(1, "Belo Horizonte", "Minas Gerais");
		Cidade cid2 = new Cidade(2, "Brasilia", "Distrito Federal");
		Cidade cid3 = new Cidade(3, "S�o Paulo", "S�o Paulo");
		Habitante hab1 = new Habitante(1, "Marcos Andrade", 23, cid1, 30000);
		Habitante hab2 = new Habitante(2, "Rafaela Moraes", 28, cid2, 20000);
		Habitante hab3 = new Habitante(3, "Yuri Italo", 25, cid1, 15000);
		Habitante hab4 = new Habitante(4, "Eduardo Gon�alves", 32, cid2, 40000);
		imprimirInformacoesHab(hab1);
		imprimirInformacoesHab(hab2);
		imprimirInformacoesHab(hab3);
		imprimirInformacoesHab(hab4);
		Habitante.informarMaiorSalario(cid1);
		Habitante.informarMaiorSalario(cid2);
		Habitante.imprimirMediaSalario(cid1);
		Habitante.imprimirMediaSalario(cid2);
		Habitante.imprimirMediaSalario(cid3);		
	}
	
	public static void imprimirInformacoesHab(Habitante habitante){
		
		System.out.println(
				"ID: " + habitante.getId() +
				"\n<------------------------>" + 
				"\nNome: " + habitante.getNome() +
				"\nIdade: " + habitante.getIdade() + " anos" +
				"\nCidade: " + habitante.getCidade() +
				"\nEstado: " + habitante.getEstadoFromCidade() +
				"\nSalario: " + habitante.getSalario() + 
				"\n<------------------------>\n"
		);
	}
}