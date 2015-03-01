package V;

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
public class Form_Painel extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;
	private JLabel lblValor;
	private JButton btnConverter;
	private JComboBox<?> txtMoeda;
	private JLabel lblMoeda;
	
	/***/
	public String getMoeda(String unidadeMonetaria) {
		return unidadeMonetaria = (String) unidadeMonetaria.toString();
	}
	
	/***/
	public String getValor(String valorDeConversao) {
		 return valorDeConversao = (String) valorDeConversao;
	}
	
	/***/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void AdicionaUnidadeMonetaria() {
		txtMoeda = new JComboBox();
		txtMoeda.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtMoeda.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtMoeda.setModel(new DefaultComboBoxModel(new String[] {"", "Dolar", "Euro", "Libra"}));
		txtMoeda.setBounds(201, 216, 384, 48);
		contentPane.add(txtMoeda);
		
		lblMoeda = new JLabel("Moeda:");
		lblMoeda.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblMoeda.setBounds(122, 219, 76, 45);
		contentPane.add(lblMoeda);
	}
	
	/***/
	private void adicionarValorAConverter() {
		lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblValor.setBounds(122, 92, 76, 46);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtValor.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtValor.setColumns(10);
		txtValor.setBounds(201, 90, 384, 48);
		contentPane.add(txtValor);
	}
	
	/***/
	private void botConverter() {
		btnConverter = new JButton("Converter");
		btnConverter.setForeground(new Color(51, 102, 0));
		btnConverter.setBackground(UIManager.getColor("Button.highlight"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Conversor.caregaValores(
					getValor(txtValor.getText()), getMoeda((String)txtMoeda.getSelectedItem ()).intern());
			}
		});
		btnConverter.setBounds(201, 347, 384, 78);
		contentPane.add(btnConverter);
		
	}
	
	/***/
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
	public Form_Painel() {
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
		Form_Painel frame = new Form_Painel();
		frame.setVisible(true);		
	}
}
