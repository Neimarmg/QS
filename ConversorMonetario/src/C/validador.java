package C;

import M.Dados;
import V.Print;

public class validador {
	
	static int contador = 0;

	
	/**
	 * Método de retorno da contagem dos dados válidos
	 **/	
	public static int getContador() {
		return contador;
	}
	
	
	/**
	 * Alerte de dado inválido e contagem dos dodos válidos
	 */
	private static void emiteAlerta(String valor, String msg){
		if (valor.equals("")){
			Print.msg(msg);			
		}else{
			contador++;
		}
	}	

	
	/**
	 * Método de validação dos dados
	 */
	public static void validaDado(String valor, String cotacao, String unidadeMonetaria){
		contador=0;		
		try {			
			Dados.setValor(Integer.parseInt(valor));
			Dados.setCotacao(Integer.parseInt(cotacao));
			emiteAlerta(unidadeMonetaria, "Falta opção de moeda!");
			emiteAlerta(valor, "Falta valor de conversão!");
			emiteAlerta(cotacao, "Falta opção de cotação!");
		
		} catch (NumberFormatException e) {
			Print.msg("O campo valor deve ser prenchido com valores numéricos!");
		}		
	}
}
