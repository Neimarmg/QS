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
 * @author Neimar, Aurélio
 */
public class Form_Painel extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;
	private JLabel lblValor;
	private JTextField txtCotacao;
	private JLabel lblCotacao;
	private JButton btnConverter;
	private JComboBox<?> txtMoeda;
	private JLabel lblMoeda;
	
	/***/
	private String getMoeda(String unidadeMonetaria) {
		return unidadeMonetaria = (String) unidadeMonetaria.toString();
	}
	
	/***/
	private  String getValor(String valorDeConversao) {
		 return valorDeConversao = (String) valorDeConversao;
	}
	
	/***/
	private String getCotacao(String cotacao) {
		 return cotacao = (String) cotacao;
	}
	
	/***/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void AdicionaUnidadeMonetaria() {
		txtMoeda = new JComboBox();
		txtMoeda.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtMoeda.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtMoeda.setModel(new DefaultComboBoxModel(new String[] {"", "Dolar", "Euro", "Libra"}));
		txtMoeda.setBounds(201, 178, 384, 48);
		contentPane.add(txtMoeda);
		
		lblMoeda = new JLabel("Moeda:");
		lblMoeda.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblMoeda.setBounds(130, 181, 68, 45);
		contentPane.add(lblMoeda);
	}
	
	/***/
	private void adicionarValorAConverter() {
		lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblValor.setBounds(142, 76, 56, 46);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtValor.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtValor.setColumns(10);
		txtValor.setBounds(201, 76, 384, 48);
		contentPane.add(txtValor);
	}
	
	
	/***/
	private void adicionarCotacao() {
		lblCotacao = new JLabel("Cotação:");
		lblCotacao.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblCotacao.setBounds(117, 272, 81, 46);
		contentPane.add(lblCotacao);
		
		txtCotacao = new JTextField();
		txtCotacao.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtCotacao.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txtCotacao.setColumns(10);
		txtCotacao.setBounds(201, 270, 384, 48);
		contentPane.add(txtCotacao);
	}
	
	/***/
	private void botConverter() {
		btnConverter = new JButton("Converter");
		btnConverter.setForeground(Color.ORANGE);
		btnConverter.setBackground(UIManager.getColor("Button.highlight"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Conversor.caregaValores(
					getValor(txtValor.getText()), getCotacao(txtCotacao.getText()), getMoeda((String)txtMoeda.getSelectedItem ()).intern());
			}
		});
		btnConverter.setBounds(201, 366, 384, 78);
		contentPane.add(btnConverter);
		
	}
	
	/***/
	private void defineLayaut() {		
		setBounds(100, 100, 759, 583);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 204, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/*
	 * Create the frame. 
	 */
	public Form_Painel() {
		super("Aplicativo de conversões monetárias");
		defineLayaut();
		adicionarValorAConverter();
		adicionarCotacao();
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
