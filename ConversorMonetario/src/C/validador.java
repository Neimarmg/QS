package C;

import M.Dados;
import V.Print;

public class validador {
	
	static int contador = 0;

	
	/**
	 * M�todo de retorno da contagem dos dados v�lidos
	 **/	
	public static int getContador() {
		return contador;
	}
	
	
	/**
	 * Alerte de dado inv�lido e contagem dos dodos v�lidos
	 */
	private static void emiteAlerta(String valor, String msg){
		if (valor.equals("")){
			Print.msg(msg);			
		}else{
			contador++;
		}
	}	

	
	/**
	 * M�todo de valida��o dos dados
	 */
	public static void validaDado(String valor, String cotacao, String unidadeMonetaria){
		contador=0;		
		
		try {			
			Dados.setValor(Float.parseFloat(valor));
			Dados.setCotacao(Float.parseFloat(cotacao));
			emiteAlerta(unidadeMonetaria, "Falta op��o de moeda!");
			emiteAlerta(valor, "Falta valor de convers�o!");
			emiteAlerta(cotacao, "Falta op��o de cota��o!");
		
		} catch (NumberFormatException e) {
			Print.msg("O campo valor deve ser prenchido com valores num�ricos!");
		}		
	}
}
