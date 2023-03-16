package br.com.poo.estruturairepeticao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class EstruturaWhile1 extends JFrame {

	private JPanel contentPane;
	private JTextField textInicial;
	private JTextField txtFinal;
	
	String dados = "";
	int i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstruturaWhile1 frame = new EstruturaWhile1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EstruturaWhile1() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joao.vasena\\Downloads\\índice.jpg"));
		setBackground(new Color(17, 31, 64));
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(17, 31, 64));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número Inicial");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 113, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmeroFinal = new JLabel("Número Final");
		lblNmeroFinal.setForeground(Color.WHITE);
		lblNmeroFinal.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNmeroFinal.setBounds(10, 53, 113, 21);
		contentPane.add(lblNmeroFinal);
		
		textInicial = new JTextField();
		textInicial.setForeground(new Color(255, 255, 255));
		textInicial.setBackground(new Color(17, 31, 74));
		textInicial.setBounds(123, 10, 51, 20);
		contentPane.add(textInicial);
		textInicial.setColumns(10);
		
		txtFinal = new JTextField();
		txtFinal.setForeground(Color.WHITE);
		txtFinal.setColumns(10);
		txtFinal.setBackground(new Color(17, 31, 74));
		txtFinal.setBounds(123, 52, 51, 20);
		contentPane.add(txtFinal);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 213, 233);
		contentPane.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		

		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				i = Integer.parseInt(txtInicial.getText());
				
			while (i <= Integer.parseInt(txtFinal.getText())) {
				dados += i +"\n";
				i++;
			}
			txtResultado.setText(dados);
			txtInicial.setText("");
			txtFinal.setText("");
			dados = "";
			}
		});
		btnExecutar.setFont(new Font("Calibri", Font.BOLD, 14));
		btnExecutar.setBackground(new Color(255, 255, 255));
		btnExecutar.setForeground(new Color(0, 0, 0));
		btnExecutar.setBounds(20, 85, 140, 23);
		contentPane.add(btnExecutar);
	}
}
