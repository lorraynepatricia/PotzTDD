package principal;
import java.util.Scanner;

import controler.controlador;
public class principal {

	private static Scanner leitura;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//Varivel que recebe o cupom
		String Cupom = "";
		String informacao;
		leitura = new Scanner(System.in);
		System.out.println("Informe o n�mero do cupom POTZ:");
		Cupom = leitura.next();
		controlador Control = new controlador();
		//Chama m�todo validacupom e passa o cupom fornecido pelo usu�rio para validar se o cupom est� correto
		if (Control.validaCupom(Cupom)){
			
			if (Control.valida_codigo_cupom(Cupom)){
				int pontos	= Integer.parseInt(Cupom.substring(0,3));
				System.out.println(informacao = "O cupom POTZ inserido � valido. O total de pontos adquiridos �: "+ Integer.toString(pontos));	
			} else {
				System.out.println(informacao = "O cupom POTZ inserido � inv�lido!");	
			}
		}
		
		else{
			System.out.println(informacao = "O cupom POTZ inserido � inv�lido!");	
		}

	}
}