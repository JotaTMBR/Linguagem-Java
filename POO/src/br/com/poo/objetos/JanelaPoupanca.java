package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.classes.heranca.ContaPoupanca;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JLabel lblAgencia;
	private JTextField txtAgencia;
	private JLabel lblNumeroConta;
	private JTextField txtNumeroConta;
	private JLabel lblTitular;
	private JTextField txtTitular;
	private JLabel lblSaldo;
	private JTextField txtSaldo;
	private JLabel lblRendimento;
	private JTextField txtRendimento;
	private JButton btnVerificarSaldo;
	private JButton btnSacar;
	private JButton btnDepositar;
	private JTextField txtValor;
	private ContaPoupanca cp;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public JanelaPoupanca() {
		
		cp = new ContaPoupanca();
		
		setTitle("Conta Poupanca");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroBanco = new JLabel("Núm do Banco:");
		lblNumeroBanco.setBounds(10, 11, 142, 14);
		contentPane.add(lblNumeroBanco);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNumeroBanco.getText().equals("") || txtNumeroBanco.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Número banco obrigatório");
					txtNumeroBanco.requestFocus();
				}
			}
		});
		txtNumeroBanco.setBounds(10, 26, 86, 20);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		lblAgencia = new JLabel("Agência:");
		lblAgencia.setBounds(106, 11, 100, 14);
		contentPane.add(lblAgencia);
		
		txtAgencia = new JTextField();
		txtAgencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAgencia.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Número agencia obrigatório");
					txtAgencia.requestFocus();
				}
			}
		});
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(106, 26, 100, 20);
		contentPane.add(txtAgencia);
		
		lblNumeroConta = new JLabel("Número da Conta:");
		lblNumeroConta.setBounds(216, 11, 138, 14);
		contentPane.add(lblNumeroConta);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNumeroConta.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo obrigatório");
					txtNumeroConta.requestFocus();
				}
			}
		});
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(216, 26, 208, 20);
		contentPane.add(txtNumeroConta);
		
		lblTitular = new JLabel("Nome do Titular");
		lblTitular.setBounds(10, 58, 100, 14);
		contentPane.add(lblTitular);
		
		txtTitular = new JTextField();
		txtTitular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtTitular.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo obrigatório");
					txtTitular.requestFocus();
				}
			}
		});
		txtTitular.setColumns(10);
		txtTitular.setBounds(10, 73, 414, 20);
		contentPane.add(txtTitular);
		
		lblSaldo = new JLabel("Saldo Inicial:");
		lblSaldo.setBounds(10, 104, 100, 14);
		contentPane.add(lblSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSaldo.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo obrigatório");
					txtSaldo.requestFocus();
				}
			}
		});
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(10, 119, 196, 20);
		contentPane.add(txtSaldo);
		
		lblRendimento = new JLabel("Rendimento:");
		lblRendimento.setBounds(228, 104, 100, 14);
		contentPane.add(lblRendimento);
		
		txtRendimento = new JTextField();
		txtRendimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtRendimento.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo obrigatório");
					txtRendimento.requestFocus();
				}
				btnVerificarSaldo.setText("Abrir Conta");
				btnVerificarSaldo.setEnabled(true);
			}
		});
		txtRendimento.setColumns(10);
		txtRendimento.setBounds(228, 119, 196, 20);
		contentPane.add(txtRendimento);
		
		btnVerificarSaldo = new JButton("Verificar Saldo");
		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnVerificarSaldo.getText().equals("Abrir Conta")) {
					cp.setNumeroBanco(Long.parseLong(txtNumeroBanco.getText()));
					cp.setAgencia(Integer.parseInt(txtAgencia.getText()));
					cp.setNumeroConta(Long.parseLong(txtNumeroConta.getText()));
					cp.setTitular(txtTitular.getText());
					cp.setSaldo(Double.parseDouble(txtSaldo.getText()));
					cp.setRendimento(Double.parseDouble(txtRendimento.getText()));
					
					//Vamos trocar o texto do botão
					btnVerificarSaldo.setText("Verificar Saldo");
					
					//desabilitar as caixa de texto
					txtNumeroBanco.setEnabled(false);
					txtAgencia.setEditable(false);
					txtNumeroConta.setEnabled(false);
					txtTitular.setEnabled(false);
					txtSaldo.setEnabled(false);
					txtRendimento.setEnabled(false);
					
					//habilitar os botões sacar e depositar
					btnDepositar.setEnabled(true);
					btnSacar.setEnabled(true);
					txtValor.setEnabled(true);
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Seu dado é R$ "+cp.getSaldo());
				}		
				
				
				
				
			}
		});
		btnVerificarSaldo.setBounds(7, 150, 145, 57);
		contentPane.add(btnVerificarSaldo);
		btnVerificarSaldo.setEnabled(false);
		
		btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, cp.sacar(Double.parseDouble(txtValor.getText())));
				
			}
		});
		btnSacar.setBounds(162, 184, 145, 23);
		contentPane.add(btnSacar);
		btnSacar.setEnabled(false);
		
		btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, cp.depositar(Double.parseDouble(txtValor.getText())));
				
				
			}
		});
		btnDepositar.setBounds(162, 150, 145, 23);
		contentPane.add(btnDepositar);
		btnDepositar.setEnabled(false);
		
		txtValor = new JTextField();
		txtValor.setText("Valor");
		txtValor.setBounds(318, 151, 106, 56);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		txtValor.setEnabled(false);
	}
}
