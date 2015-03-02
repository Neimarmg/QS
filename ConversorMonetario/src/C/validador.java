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
			Dados.setValor(Float.parseFloat(valor)); /*Valida dado convertendo-o para o tipo desejado" se inválida vai para exessão*/
			Dados.setCotacao(Float.parseFloat(cotacao)); /*Valida dado convertendo-o para o tipo desejado" se inválida vai para exessão*/
			emiteAlerta(unidadeMonetaria, "Falta opção de moeda!"); /*Valida se existe um valor != "" se inválida vai para exessão*/
			emiteAlerta(valor, "Falta valor de conversão!");/*Valida se existe um valor != "" se inválida vai para exessão*/
			emiteAlerta(cotacao, "Falta opção de cotação!");/*Valida se existe um valor != "" se inválida vai para exessão*/
		
		} catch (NumberFormatException e) {
			Print.msg("O campo valor deve ser prenchido com valores numéricos!");
		}		
	}
}
