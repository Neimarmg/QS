package App;
 
import java.awt.EventQueue;
import App.Forms.constroiPainel;
 
public class app {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					constroiPainel frame = new constroiPainel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}