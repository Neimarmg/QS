package C;
import App.Forms.Print;

public class Conversor {	
	
	/*M�todo de conver��o de valores*/
	private static String converteLibra(String valor){
		
		return valor;
	}
	
	
	/*M�todo de conver��o de valores*/
	private static String converteEuro(String valor){
		
		return valor;
	}
	
	
	/*M�todo de conver��o de valores*/
	private  static String converteDolar(String valor){
		
		return valor;
	}
	
	
	/*M�doto de processamento e sele��o da unidade e sele��o de conversor*/
	private static void executaComando(String valor, String unidadeMonetaria){
		switch (unidadeMonetaria) {
		
		case "Dolar":
			Print.msg(converteDolar(valor));
			break;
			
		case "Euro":
			Print.msg(converteEuro(valor));
			break;

		case "Libra":
			Print.msg(converteLibra(valor));
			break;
			
		default:
			Print.msg("Unidade inexistente!");
			break;
		}
	}
	
	
	/*M�todo de carregamento de valores e valida��o dos dados*/
	public static void caregaValores(String valor, String unidadeMonetaria){
		validador.validaDado(valor, unidadeMonetaria);
		if (validador.getContador() == 2){
			executaComando(valor, unidadeMonetaria);
		}
	}
}
