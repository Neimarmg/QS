package C;
import V.Print;

public class Conversor {	
	
	/*Método de converção de valores*/
	private static String converteLibra(String valor){
		
		return valor;
	}
	
	
	/*Método de converção de valores*/
	private static String converteEuro(String valor){
		
		return valor;
	}
	
	
	/*Método de converção de valores*/
	private  static String converteDolar(String valor){
		
		return valor;
	}
	
	
	/*Médoto de processamento e seleção da unidade e seleção de conversor*/
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
	
	
	/*Método de carregamento de valores e validação dos dados*/
	public static void caregaValores(String valor, String unidadeMonetaria){
		validador.validaDado(valor, unidadeMonetaria);
		if (validador.getContador() == 2){
			executaComando(valor, unidadeMonetaria);
		}
	}
}
