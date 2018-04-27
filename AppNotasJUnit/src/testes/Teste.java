package testes;

import org.junit.Assert;
import org.junit.Test;

import br.ucsal.testequalidade.bes20181.atividade1.business.RegistroNotaBC;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.NotaInvalidaException;
import br.ucsal.testequalidade.bes20181.atividade1.exceptions.PesoInvalidoException;

public class Teste {

	@Test
	public void testeValidarPeso() {

		RegistroNotaBC bc = new RegistroNotaBC();
		Integer peso = 10;

		try {
			bc.validarPeso(peso);
		} catch (PesoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals("Passou", bc.vpcount);

	}

	@Test
	public void testePesoForaDaFaixa() {

		RegistroNotaBC bc = new RegistroNotaBC();
		Integer peso = 0;

		try {
			bc.validarPeso(peso);
		} catch (PesoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals("Não Passou", bc.vpcount);

	}

	@Test
	public void testeValidarNota() {

		RegistroNotaBC bc = new RegistroNotaBC();
		Integer nota = 100;

		try {
			bc.validarNota(nota);
		} catch (NotaInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals("Passou", bc.vncount);

	}

	@Test
	public void testeNotaForaDaFaixa() {

		RegistroNotaBC bc = new RegistroNotaBC();
		Integer nota = 200;

		try {
			bc.validarNota(nota);
		} catch (NotaInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals("Não Passou", bc.vncount);

	}

	@Test
	public void testeCalcularMedia() {
		RegistroNotaBC bc = new RegistroNotaBC();

		Integer actual = bc.calcularMedia(100, 100, 5, 5);
		Integer expected = 100;
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testeCalcularConceitoOtimo() {
		RegistroNotaBC bc = new RegistroNotaBC();
		Integer media = 100;
		String actual = bc.calcularConceito(media);
		String expected = "Ótimo";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testeCalcularConceitoBom() {
		RegistroNotaBC bc = new RegistroNotaBC();
		Integer media = 50;
		String actual = bc.calcularConceito(media);
		String expected = "Bom";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testeCalcularConceitoRegular() {
		RegistroNotaBC bc = new RegistroNotaBC();
		Integer media = 30;
		String actual = bc.calcularConceito(media);
		String expected = "Regular";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testeCalcularConceitoInsuficiente() {
		RegistroNotaBC bc = new RegistroNotaBC();
		Integer media = 0;
		String actual = bc.calcularConceito(media);
		String expected = "Insuficiente";
		Assert.assertEquals(expected, actual);

	}

}
