package C;

import App.Forms.Print;

public class validador {
	
	static int contador = 0;
	
	
	/*Método de retorno da contagem dos dados válidos*/
	public static int getContador() {
		return contador;
	}
	
	
	/*Alerte de dado inválido e contagem dos dodos válidos*/
	private static void emiteAlerta(String valor, String msg){
		if (valor.equals("")){
			Print.msg(msg);			
		}else{
			contador++;
		}
	}	
	
	
	/*Método de validação dos dados*/
	public static void validaDado(String valor, String unidadeMonetaria){
		contador=0;
		emiteAlerta(unidadeMonetaria, "Falta opção de moéda!");
		try {
			Integer.parseInt(valor);		
			emiteAlerta(valor, "Falta valor de conversão!");
		} catch (NumberFormatException e) {
			Print.msg("O campo valor deve ser prenchido com valores muméricos!");

		}		
		
	}
}
