package controler;

import junit.framework.TestCase;


public class controladorTest extends TestCase {
	
	public void testeExecutaCalculo()
	{
		boolean retorno; 
		assertEquals(true, retorno    = controlador.validaCupom("5000365327"));
	}
}