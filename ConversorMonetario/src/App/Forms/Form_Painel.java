package App.Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import C.ValidadorUser;

import javax.swing.UIManager;


/**
 * Classe log destinada a todas a operaçãoes de caixa
 * @author Neimar
 */
public class Form_Painel extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtValorDeConversao;
	private JLabel lblValorDeConversao;
	private JButton btnConverter;
	private static JComboBox<?> txtCargo;
	private JLabel lblCargo;
	private String cargo,senha;
	
		
	public void setCago(String cargo) {
		this.cargo = (String) cargo.toString() ;
	}
	
	public void setSenha(String senha) {
		this.senha = (String) senha;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	public String getSenha() {
		return senha;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void AdicionaUnidadeMonetaria() {
		txtCargo = new JComboBox();
		txtCargo.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtCargo.setModel(new DefaultComboBoxModel(new String[] {"", "Diretor", "Auxiliar"}));
		txtCargo.setBounds(83, 48, 224, 29);
		contentPane.add(txtCargo);
		
		lblCargo = new JLabel("unidade monetária:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(27, 49, 52, 26);
		contentPane.add(lblCargo);
	}
	
	
	private void adicionarValorAConverter() {
		lblValorDeConversao = new JLabel("Valor em reais:");
		lblValorDeConversao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorDeConversao.setBounds(27, 128, 52, 26);
		contentPane.add(lblValorDeConversao);
		
		txtValorDeConversao = new JTextField();
		txtValorDeConversao.setBackground(UIManager.getColor("Button.disabledShadow"));
		txtValorDeConversao.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtValorDeConversao.setColumns(10);
		txtValorDeConversao.setBounds(83, 127, 224, 29);
		contentPane.add(txtValorDeConversao);
	}
	
	
	private void botConverter() {
		btnConverter = new JButton("Entrar");
		btnConverter.setBackground(UIManager.getColor("Button.highlight"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				setCago((( String ) txtCargo.getSelectedItem ()).intern());
				setSenha(( String ) txtValorDeConversao.getText());
				ValidadorUser.verificaAcesso(getCargo(),getSenha());
			}
		});
		btnConverter.setBounds(83, 200, 224, 37);
		contentPane.add(btnConverter);
		
	}
	
	
	private void defineLayaut() {		
		setBounds(100, 100, 592, 539);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	}
	
	
	/**
	 * Create the frame.
	 */
	private Form_Painel() {
		super("Aplicativo de conversor monetário");
		defineLayaut();
		adicionarValorAConverter();
		AdicionaUnidadeMonetaria();
		botConverter();
	}
	
	
	/**
	 * Abre freme 
	 */
	public static void abreFreme() {
		Form_Painel frame = new Form_Painel();
		frame.setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Painel frame = new Form_Painel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
