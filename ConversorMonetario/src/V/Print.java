package V;
import javax.swing.*;

public class Print {
	
	public static void msg(Object desc){	
		//System.out.print(desc);
		JOptionPane.showMessageDialog(null,desc);
	}	
	
	public static void ObjetoNaoImplementado(){
		Print.msg("Não implementado!");
	}
}
