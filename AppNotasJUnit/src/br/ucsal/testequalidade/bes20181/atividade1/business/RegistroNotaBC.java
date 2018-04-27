package br.ucsal.testequalidade.bes20181.atividade1.business;

import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;
import br.ucsal.testequalidade.bes20181.atividade1.persistence.RegistroNotaDAO;

public class RegistroNotaBC {

	public RegistroNotaDAO registroNotaDAO = new RegistroNotaDAO();
	private Integer media;
	public String vpcount = "Passou";
	public String vncount = "Passou";

	public void registarPesos(Integer codigoPeso, Integer valorPeso) throws PesoInvalidoException {
		validarPeso(valorPeso);
		registroNotaDAO.inserirPeso(codigoPeso, valorPeso);

	}

	public String registrarNotas(Integer nota1, Integer nota2) throws NotaInvalidaException {
		registroNotaDAO.inserirNota(1, nota1);
		registroNotaDAO.inserirNota(2, nota2);
		Integer peso1 = registroNotaDAO.recuperarPeso(1);
		Integer peso2 = registroNotaDAO.recuperarPeso(2);

		validarNota(nota1);
		validarNota(nota2);

		calcularMedia(nota1, nota2, peso1, peso2);

		String conceito = calcularConceito(media);

		return conceito;

	}

	public void validarPeso(Integer peso) throws PesoInvalidoException {

		if (peso < 1 || peso > 10) {
			this.vpcount = "Não Passou";
			throw new PesoInvalidoException();
		}

	}

	public void validarNota(Integer nota) throws NotaInvalidaException {

		if (nota == null || nota > 100 || nota < 0) {
			this.vncount = "Não Passou";
			throw new NotaInvalidaException();
		}

	}

	public Integer calcularMedia(Integer nota1, Integer nota2, Integer peso1, Integer peso2) {
		return media = (((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2));

	}

	public String calcularConceito(Integer media) {
		String conceito = "";
		if (media <= 24) {
			conceito = ("Insuficiente");
		} else if (media <= 49) {
			conceito = ("Regular");
		} else if (media <= 74) {
			conceito = ("Bom");
		} else {
			conceito = ("Ótimo");
		}
		return conceito;
	}

}
