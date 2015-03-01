package C;

import App.Forms.PrintResultado;

public class Conversor {
	
	
	/**/
	private static String converteLibra(String valor){
		
		return valor;
	}
	
	
	/**/
	private static String converteEuro(String valor){
		
		return valor;
	}
	
	
	/**/
	private  static String converteDolar(String valor){
		
		return valor;
	}
	
	/**/
	public static void executaComando(String valor, String unidadeMonetaria){
		
		switch (unidadeMonetaria) {
		
		case "Dolar":
			PrintResultado.msg(converteDolar(valor));
			break;
			
		case "Euro":
			PrintResultado.msg(converteEuro(valor));
			break;

		case "Libra":
			PrintResultado.msg(converteLibra(valor));
			break;
			
		default:
			PrintResultado.msg("Unidade inexistente!");
			break;
		}
	}

}
