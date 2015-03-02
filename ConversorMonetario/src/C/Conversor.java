package C;

import M.Dados;
import V.Print;

public class Conversor {	
	
	//====================================<< Conversores de valores monetarios>>===========================================
	
	/**
	 * M�todo de conver��o de valores
	 */
	private static float converteLibra(float valor, float cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		
		return valor*15;
	}
	
	
	/**
	 * M�todo de conver��o de valores
	 */
	private static float converteEuro(float valor, float cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		return valor*10;
	}
	
	
	/**
	 * M�todo de conver��o de valores
	 */
	private  static float converteDolar(float valor, float cotacao){
		
		//Desenvolver o miolo do m�todo para calcular a cota��o e retorna um valor int
		
		return valor*5;
	}
	
	
	/*====================================<< M�todo de execu��o >>===========================================*/
	
	/**	
	 * Met�todo de impress�o dos velores convertidos
	 */
	private static void Imprime(String unidadeMonetaria, String cifra, float valor){
		Print.msg("Valor e reais: R$ "+Dados.getValor() +"\n\n"+			
				"Valor total em "+unidadeMonetaria + ": "+cifra+" "+ valor);
	}
	
		
	/**
	 * M�doto de processamento e sele��o da unidade e sele��o de conversor
	 */
	private static void executaComando(String unidadeMonetaria){
		switch (unidadeMonetaria) {
		
		case "Dolar":			
			Imprime(unidadeMonetaria , "$", converteDolar( Dados.getValor(), Dados.getCotacao()));
			break;
			
		case "Euro":
			Imprime(unidadeMonetaria, "�", converteEuro( Dados.getValor(), Dados.getCotacao()));
			break;

		case "Libra":
			Imprime(unidadeMonetaria, "�", converteLibra( Dados.getValor(), Dados.getCotacao()));
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
