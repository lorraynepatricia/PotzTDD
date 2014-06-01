package principal;
import java.util.Scanner;

import controler.controlador;

public class principal {

	private static Scanner ler;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		//Varivel que recebe o cupom
		String Cupom = "";
		String Msg   = "";
		ler = new Scanner(System.in);
		System.out.println("Informe o número do cupom POTZ:");
		Cupom = ler.next();

		controlador Control = new controlador();

		if (Control.validaCupom(Cupom)){
			if (Control.valida_codigo_cupom(Cupom)){
				int pontos	= Integer.parseInt(Cupom.substring(0,3));
				Msg = "O cupom POTZ inserido é valido. O total de pontos adquiridos é: "+Integer.toString(pontos);	
			} else {
				Msg = "O cupom POTZ inserido é inválido!";	
			}
		}else{
			Msg = "O cupom POTZ inserido é inválido!";	
		}

		System.out.println(Msg);
	}
}