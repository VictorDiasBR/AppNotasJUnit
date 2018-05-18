package br.ucsal.testequalidade.bes20181.atividade1.tui;

import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class Atividade1Entry {

	public static void main(String[] args) {

		RegistroNotaTui registroNotaTui = new RegistroNotaTui();

		try {
			registroNotaTui.registrarPesos();
		} catch (PesoInvalidoException e) {

			System.out.println("Peso invalido!");
			e.printStackTrace();
		}

		try {
			registroNotaTui.registarNotas();
		} catch (NotaInvalidaException e) {
			System.out.println("Nota invalida!");
			e.printStackTrace();
		}

	}

}
