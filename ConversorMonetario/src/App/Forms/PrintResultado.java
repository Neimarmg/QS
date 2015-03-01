package App.Forms;
import javax.swing.*;

public class PrintResultado {
	
	public static void msg(Object desc){	
		//System.out.print(desc);
		JOptionPane.showMessageDialog(null,desc);
	}	
	
	public static void ObjetoNaoImplementado(){
		PrintResultado.msg("Não implementado!");
	}
}
