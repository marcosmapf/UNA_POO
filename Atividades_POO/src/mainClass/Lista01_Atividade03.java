package mainClass;

import custom.Objects.Professor;
import custom.Objects.Secretaria;

public class Lista01_Atividade03 {

	public static void main(String[] args) {

		System.out.println("Informa��es sobre funcion�rios\n"
						 +"<----------------------------->");
		Professor prof = new Professor();
		prof.setCodigo(0);
		prof.setNome ("Mark");
		prof.setSobrenome("Allan Junho Song");
		prof.setTitulacao("Doutorado");		
		prof.imprimirDados();
		
		System.out.println();
		
		Secretaria sec = new Secretaria();
		sec.setCodigo(1);
		sec.setNome ("Daniela");
		sec.setSobrenome("Rocha Bicalho");
		sec.setEspecialidade("Novelo de l�");
		sec.imprimirDados();
		
		System.out.println("<----------------------------->");
	}
}