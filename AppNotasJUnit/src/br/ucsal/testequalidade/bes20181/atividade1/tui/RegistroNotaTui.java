package br.ucsal.testequalidade.bes20181.atividade1.tui;

import java.util.Scanner;
import br.ucsal.testequalidade.bes20181.atividade1.business.RegistroNotaBC;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class RegistroNotaTui {

	RegistroNotaBC registroNotaBC = new RegistroNotaBC();
	Scanner sc = new Scanner(System.in);

	private Integer peso1;
	private Integer peso2;
	private Integer nota1;
	private Integer nota2;

	public void registrarPesos() throws PesoInvalidoException {
		System.out.println("Digite o peso 1");
		peso1 = sc.nextInt();
		System.out.println("Digite o peso 2");
		peso2 = sc.nextInt();

		registroNotaBC.registarPesos(1, peso1);
		registroNotaBC.registarPesos(2, peso2);

	}

	public void registarNotas() throws NotaInvalidaException {
		System.out.println("Digite a nota 1");
		nota1 = sc.nextInt();
		System.out.println("Digite a nota 2");
		nota2 = sc.nextInt();

		System.out.println("\n" + registroNotaBC.registrarNotas(nota1, nota2));

	}

}
