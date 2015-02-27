
 
import javax.swing.JFrame;  // inclui, da biblioteca swing, apenas JFrame
 
public class painel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Este e' um teste");
		frame.setSize(500, 500);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}