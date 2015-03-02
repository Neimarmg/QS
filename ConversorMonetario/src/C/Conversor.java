package C;

import M.Dados;
import V.Print;

public class Conversor {	
	
	//====================================<< Conversores de valores monetarios>>===========================================
	
	/**
	 * Método de converção de valores
	 */
	private static float converteLibra(float valor, float cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		
		return valor*15;
	}
	
	
	/**
	 * Método de converção de valores
	 */
	private static float converteEuro(float valor, float cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		return valor*10;
	}
	
	
	/**
	 * Método de converção de valores
	 */
	private  static float converteDolar(float valor, float cotacao){
		
		//Desenvolver o miolo do método para calcular a cotação e retorna um valor int
		
		return valor*5;
	}
	
	
	/*====================================<< Método de execução >>===========================================*/
	
	/**	
	 * Metétodo de impressão dos velores convertidos
	 */
	private static void Imprime(String unidadeMonetaria, String cifra, float valor){
		Print.msg("Valor e reais: R$ "+Dados.getValor() +"\n\n"+			
				"Valor total em "+unidadeMonetaria + ": "+cifra+" "+ valor);
	}
	
		
	/**
	 * Médoto de processamento e seleção da unidade e seleção de conversor
	 */
	private static void executaComando(String unidadeMonetaria){
		switch (unidadeMonetaria) {
		
		case "Dolar":			
			Imprime(unidadeMonetaria , "$", converteDolar( Dados.getValor(), Dados.getCotacao()));
			break;
			
		case "Euro":
			Imprime(unidadeMonetaria, "€", converteEuro( Dados.getValor(), Dados.getCotacao()));
			break;

		case "Libra":
			Imprime(unidadeMonetaria, "£", converteLibra( Dados.getValor(), Dados.getCotacao()));
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
