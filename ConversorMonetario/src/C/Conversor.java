package C;
import M.Dados;
import V.Print;

public class Conversor {	
	
	/**
	 * Método de converção de valores
	 */
	private static int converteLibra(int valor, int cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		
		return valor;
	}
	
	
	/**
	 * Método de converção de valores
	 */
	private static int converteEuro(int valor, int cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		return valor;
	}
	
	
	/**
	 * Método de converção de valores
	 */
	private  static int converteDolar(int valor, int cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		return valor;
	}
	
	
	/**
	 * Médoto de processamento e seleção da unidade e seleção de conversor
	 */
	private static void executaComando(String unidadeMonetaria){
		switch (unidadeMonetaria) {
		
		case "Dolar":
			Print.msg(converteDolar(Dados.getValor(), Dados.getCotacao()));
			break;
			
		case "Euro":
			Print.msg(converteEuro(Dados.getValor(), Dados.getCotacao()));
			break;

		case "Libra":
			Print.msg(converteLibra(Dados.getValor(), Dados.getCotacao()));
			break;
			
		default:
			Print.msg("Unidade inexistente!");
			break;
		}
	}
	
	
	/**
	 * Método de carregamento de valores e validação dos dados
	 */
	public static void caregaValores(String valor, String cotacao , String unidadeMonetaria){
		validador.validaDado(valor,cotacao, unidadeMonetaria);
		if (validador.getContador() == 3){
			executaComando(unidadeMonetaria);
		}
	}
}
