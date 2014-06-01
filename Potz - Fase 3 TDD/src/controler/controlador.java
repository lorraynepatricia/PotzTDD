package controler;
public class controlador {

	public static boolean validaCupom(String cupom)
	{
		boolean retorno = true;
		String numeros_validos 	= "0123456789";
		int aux 	   	= 0;
		String auxcupom = "";
		try {

			//Valida se tem Letras ou caracteres
			for (int i = 0; i < cupom.length(); i++) {
				aux = numeros_validos.indexOf(cupom.substring(i, i+1));
				if (aux>=0) {
					auxcupom += Integer.toString(aux);
				}
			}
			if (auxcupom.length()==10)
			{
				//guarda numa variavel os pontos do cupom
				int pontos_do_cupom	= Integer.parseInt(cupom.substring(0,3));

				//valida se o cupom tem 10 caracteres e se os pontos são maiores que 0
				if (cupom.length()!=10 && pontos_do_cupom==0)	{
					retorno = false;	
				}
			} else {
				retorno = false;
			}
		} catch (Exception e) {
			System.out.println("O cupom POTZ inserido é inválido!");
		}

		return retorno;
	}

	public static boolean valida_codigo_cupom(String cupom)
	{
		boolean retorno = false;
		//Pega as posições para realizar a verificação
		int valor1 = Integer.parseInt(cupom.substring(3,4));
        int valor2 = Integer.parseInt(cupom.substring(4,5));
        int valor3 = Integer.parseInt(cupom.substring(5,6));
        int valor4 = Integer.parseInt(cupom.substring(6,7));
        int valor5 = Integer.parseInt(cupom.substring(7,8));
        int valor6 = Integer.parseInt(cupom.substring(8,9));
        int digito_verificador = Integer.parseInt(cupom.substring(9,10));		

		//Calculo 11 com digito verificador
		int total = ((valor1*7)+(valor2*6)+(valor3*5)+(valor4*4)+(valor5*3)+(valor6*2));
		//Verifica resto da divisão
		total = total%11;
		total = 11-total;
		//verifica se o resto da divisão e igual ao digito verificador
		if (total == digito_verificador) {
			retorno = true;
		}
		else {
			retorno = false;
		}
		return retorno;
	}
}