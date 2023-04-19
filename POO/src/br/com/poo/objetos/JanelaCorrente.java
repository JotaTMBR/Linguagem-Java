package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaCorrente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtAgencia;
	private JTextField txtNumeroConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JTextField txtLimite;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public JanelaCorrente() {
		setTitle("Janela Conta Corrente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1037, 618);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(39, 39, 39));
		pnlMenu.setBounds(0, 0, 200, 579);
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JLabel lblOperacoes = new JLabel("Operações");
		lblOperacoes.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/logobanco.png")));
		lblOperacoes.setForeground(new Color(255, 255, 255));
		lblOperacoes.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		lblOperacoes.setBounds(10, 28, 180, 33);
		pnlMenu.add(lblOperacoes);
		
		JLabel lblAbrirConta = new JLabel("   Abrir Conta");
		lblAbrirConta.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/logoabrirconta.png")));
		lblAbrirConta.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
		lblAbrirConta.setForeground(new Color(255, 255, 255));
		lblAbrirConta.setBounds(10, 104, 180, 33);
		pnlMenu.add(lblAbrirConta);
		
		JLabel lblVerificarSaldo = new JLabel("   Verificar Saldo");
		lblVerificarSaldo.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/logoverificar.png")));
		lblVerificarSaldo.setForeground(Color.WHITE);
		lblVerificarSaldo.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
		lblVerificarSaldo.setBounds(10, 160, 180, 33);
		pnlMenu.add(lblVerificarSaldo);
		
		JLabel lblDepositar = new JLabel("   Depositar");
		lblDepositar.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/logodepositar.png")));
		lblDepositar.setForeground(Color.WHITE);
		lblDepositar.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
		lblDepositar.setBounds(10, 229, 180, 33);
		pnlMenu.add(lblDepositar);
		
		JLabel lblSacar = new JLabel("   Sacar");
		lblSacar.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/logodepositar.png")));
		lblSacar.setForeground(Color.WHITE);
		lblSacar.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
		lblSacar.setBounds(10, 286, 180, 33);
		pnlMenu.add(lblSacar);
		
		JLabel lblNewLabel = new JLabel("   Ana Dias");
		lblNewLabel.setIcon(new ImageIcon(JanelaCorrente.class.getResource("/br/com/poo/images/user.png")));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 519, 180, 33);
		pnlMenu.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(210, 11, 371, 557);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Número Banco");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 22, 332, 30);
		panel.add(lblNewLabel_1);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNumeroBanco.setBounds(10, 52, 351, 43);
		panel.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		JLabel lblAgencia = new JLabel("Agência");
		lblAgencia.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblAgencia.setBounds(10, 94, 332, 30);
		panel.add(lblAgencia);
		
		txtAgencia = new JTextField();
		txtAgencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(10, 123, 351, 43);
		panel.add(txtAgencia);
		
		JLabel lblNumeroConta = new JLabel("Número da Conta");
		lblNumeroConta.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNumeroConta.setBounds(10, 165, 332, 30);
		panel.add(lblNumeroConta);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(10, 206, 351, 43);
		panel.add(txtNumeroConta);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblTitular.setBounds(10, 259, 332, 30);
		panel.add(lblTitular);
		
		txtTitular = new JTextField();
		txtTitular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTitular.setColumns(10);
		txtTitular.setBounds(10, 288, 351, 43);
		panel.add(txtTitular);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblSaldo.setBounds(10, 330, 332, 30);
		panel.add(lblSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(10, 360, 351, 43);
		panel.add(txtSaldo);
		
		JLabel lblLimite = new JLabel("Limite");
		lblLimite.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLimite.setBounds(10, 403, 332, 30);
		panel.add(lblLimite);
		
		txtLimite = new JTextField();
		txtLimite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLimite.setColumns(10);
		txtLimite.setBounds(10, 433, 351, 43);
		panel.add(txtLimite);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(591, 11, 420, 557);
		scrollPane.setBorder(null);
		contentPane.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
	}
}
