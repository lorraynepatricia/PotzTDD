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
		System.out.println("Informe o número do cupom POTZ:");
		Cupom = leitura.next();
		controlador Control = new controlador();
		//Chama método validacupom e passa o cupom fornecido pelo usuário para validar se o cupom está correto
		if (Control.validaCupom(Cupom)){
			
			if (Control.valida_codigo_cupom(Cupom)){
				int pontos	= Integer.parseInt(Cupom.substring(0,3));
				System.out.println(informacao = "O cupom POTZ inserido é valido. O total de pontos adquiridos é: "+ Integer.toString(pontos));	
			} else {
				System.out.println(informacao = "O cupom POTZ inserido é inválido!");	
			}
		}
		
		else{
			System.out.println(informacao = "O cupom POTZ inserido é inválido!");	
		}

	}
}