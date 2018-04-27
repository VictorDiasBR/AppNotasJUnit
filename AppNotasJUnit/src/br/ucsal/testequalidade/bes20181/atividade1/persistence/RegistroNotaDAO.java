package br.ucsal.testequalidade.bes20181.atividade1.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class RegistroNotaDAO {

	private ArrayList<Integer> notas = new ArrayList<>();
	private Map<Integer, Integer> pesos = new HashMap<Integer, Integer>();

	public void inserirPeso(Integer codigoPeso, Integer peso) throws PesoInvalidoException {

		pesos.put(codigoPeso, peso);

	}

	public Integer recuperarPeso(Integer codigoPeso) {

		pesos.containsKey(codigoPeso);
		return pesos.get(codigoPeso);

	}

	public void inserirNota(Integer codigoNota, Integer nota) throws NotaInvalidaException {
		notas.add(nota);

	}

}
