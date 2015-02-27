package C;

import App.Forms.Msgs;
import M.AbreCaixa;

public class ValidadorCaixa {
	
	/**
	 * Informa campo embraco
	 * @param data
	 */
	public static void validadata(String data){
		if (data.equals("")){
			Msgs.msg("Data de abertura inv�lida!");	
		}else{
			AbreCaixa.setDateAbertura(data);
			Msgs.msg("Caixa liberado com sucesso!");				
		}		
	}	
	
	
	/**
	 * Informa campo embraco
	 * @param nome
	 */
	public static void validaFuncionario(String nome){		
		if (AbreCaixa.getFucionario().equals("")){
			Msgs.msg("Responsavel inv�lido!");			
		}else{			
			AbreCaixa.setFucionario(nome);
		}			
	}
	
	
	/*
	 * Informa campo embraco
	 */
	public static void validaSaldo(int saldo){
		Msgs.msg(saldo);
		if (AbreCaixa.getSaldoInicial() == 0){
			Msgs.msg("Seu saldo e zero deseja seguir assim mesmo!");			
		}
		AbreCaixa.setSaldoInicial(saldo);
	}
}
