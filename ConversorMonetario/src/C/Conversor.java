package C;
import M.Dados;
import V.Print;

public class Conversor {	
	
	/**
	 * M�todo de conver��o de valores
	 */
	private static int converteLibra(int valor, int cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		
		return valor;
	}
	
	
	/**
	 * M�todo de conver��o de valores
	 */
	private static int converteEuro(int valor, int cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		return valor;
	}
	
	
	/**
	 * M�todo de conver��o de valores
	 */
	private  static int converteDolar(int valor, int cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		return valor;
	}
	
	
	/**
	 * M�doto de processamento e sele��o da unidade e sele��o de conversor
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
	 * M�todo de carregamento de valores e valida��o dos dados
	 */
	public static void caregaValores(String valor, String cotacao , String unidadeMonetaria){
		validador.validaDado(valor,cotacao, unidadeMonetaria);
		if (validador.getContador() == 3){
			executaComando(unidadeMonetaria);
		}
	}
}
