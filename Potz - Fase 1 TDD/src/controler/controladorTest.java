package controler;

import junit.framework.TestCase;

public class controladorTest extends TestCase {
	public void testeExecutaCalculo()
	{
		String cupompotz = "5000365327";
		boolean retorno    = controlador.validaCupom(cupompotz); 
		assertEquals(true, retorno);
	}
}