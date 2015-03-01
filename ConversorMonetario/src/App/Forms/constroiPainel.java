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
public class constroiPainel extends JFrame {
	
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
		txtUnidadeMonetaria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUnidadeMonetaria.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtUnidadeMonetaria.setModel(new DefaultComboBoxModel(new String[] {"", "Dolar", "Euro", "Libra"}));
		txtUnidadeMonetaria.setBounds(201, 216, 384, 48);
		contentPane.add(txtUnidadeMonetaria);
		
		lblinidadeMonitaria = new JLabel("Unidade monet\u00E1ria:");
		lblinidadeMonitaria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblinidadeMonitaria.setBounds(60, 219, 138, 45);
		contentPane.add(lblinidadeMonitaria);
	}
	
	
	private void adicionarValorAConverter() {
		lblValorDeConversao = new JLabel("Valor em reais:");
		lblValorDeConversao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDeConversao.setBounds(60, 92, 138, 46);
		contentPane.add(lblValorDeConversao);
		
		txtValorDeConversao = new JTextField();
		txtValorDeConversao.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtValorDeConversao.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtValorDeConversao.setColumns(10);
		txtValorDeConversao.setBounds(201, 90, 384, 48);
		contentPane.add(txtValorDeConversao);
	}
	
	
	private void botConverter() {
		btnConverter = new JButton("Converter");
		btnConverter.setForeground(Color.GREEN);
		btnConverter.setBackground(UIManager.getColor("Button.highlight"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				setUnidadeMonetaria((( String ) txtUnidadeMonetaria.getSelectedItem ()).intern());
				setValorDeConversao((String) txtValorDeConversao.getText());
				Conversor.executaComando(getValorDeConversao(), getUnidadeMonetaria());
			}
		});
		btnConverter.setBounds(201, 347, 384, 78);
		contentPane.add(btnConverter);
		
	}
	
	
	private void defineLayaut() {		
		setBounds(100, 100, 764, 562);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	public constroiPainel() {
		super("Aplicativo de conversor monetário");
		defineLayaut();
		adicionarValorAConverter();
		AdicionaUnidadeMonetaria();
		botConverter();
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void Form_abreFreme() {
		constroiPainel frame = new constroiPainel();
		frame.setVisible(true);		
	}	

}
