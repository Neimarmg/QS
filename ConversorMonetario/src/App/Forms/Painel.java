package App.Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import C.Conversor;
import java.awt.Color;

/**
 * Classe log destinada a todas a operaçãoes de caixa
 * @author Neimar
 */
public class Painel extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorDeConversao;
	private JLabel lblValorDeConversao;
	private JButton btnConverter;
	private JComboBox<?> txtUnidadeMonetaria;
	private JLabel lblinidadeMonitaria;
	
	private String UnidadeMonetaria, ValorDeConversao;
	
	
	public void setUnidadeMonetaria(String unidadeMonetaria) {
		UnidadeMonetaria = (String) unidadeMonetaria.toString();
	}
	
	
	public String getUnidadeMonetaria() {
		return UnidadeMonetaria;
	}


	public void setValorDeConversao(String valorDeConversao) {
		ValorDeConversao = (String) valorDeConversao;
	}


	public String getValorDeConversao() {
		return ValorDeConversao;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void AdicionaUnidadeMonetaria() {
		txtUnidadeMonetaria = new JComboBox();
		txtUnidadeMonetaria.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtUnidadeMonetaria.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtUnidadeMonetaria.setModel(new DefaultComboBoxModel(new String[] {"", "Dolar", "Euro", "Libra"}));
		txtUnidadeMonetaria.setBounds(201, 216, 384, 48);
		contentPane.add(txtUnidadeMonetaria);
		
		lblinidadeMonitaria = new JLabel("Moeda:");
		lblinidadeMonitaria.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblinidadeMonitaria.setBounds(122, 219, 76, 45);
		contentPane.add(lblinidadeMonitaria);
	}
	
	
	private void adicionarValorAConverter() {
		lblValorDeConversao = new JLabel("Valor:");
		lblValorDeConversao.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblValorDeConversao.setBounds(122, 92, 76, 46);
		contentPane.add(lblValorDeConversao);
		
		txtValorDeConversao = new JTextField();
		txtValorDeConversao.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtValorDeConversao.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtValorDeConversao.setColumns(10);
		txtValorDeConversao.setBounds(201, 90, 384, 48);
		contentPane.add(txtValorDeConversao);
	}
	
	
	private void botConverter() {
		btnConverter = new JButton("Converter");
		btnConverter.setForeground(new Color(51, 102, 0));
		btnConverter.setBackground(UIManager.getColor("Button.highlight"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				setUnidadeMonetaria((( String ) txtUnidadeMonetaria.getSelectedItem ()).intern());
				setValorDeConversao((String) txtValorDeConversao.getText());
				Conversor.caregaValores(getValorDeConversao(), getUnidadeMonetaria());
			}
		});
		btnConverter.setBounds(201, 347, 384, 78);
		contentPane.add(btnConverter);
		
	}
	
	
	private void defineLayaut() {		
		setBounds(100, 100, 774, 569);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 204, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	public Painel() {
		super("Aplicativo de conversões monetárias");
		defineLayaut();
		adicionarValorAConverter();
		AdicionaUnidadeMonetaria();
		botConverter();
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void Form_abreFreme() {
		Painel frame = new Painel();
		frame.setVisible(true);		
	}	
}
