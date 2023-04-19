package br.com.projetoassessoria.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.projetoassessoria.dao.CRUDAssessoria;
import br.com.projetoassessoria.domain.Assessoria;
import br.com.projetoassessoria.util.AcessoSSH;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class SolicitacaoSuporte extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtDepartamento;
	JFormattedTextField txtData;
	CRUDAssessoria cc = new CRUDAssessoria();
	
	MaskFormatter ds;
	
	JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolicitacaoSuporte frame = new SolicitacaoSuporte();
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
	public SolicitacaoSuporte() {
		
		try {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 34, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo ao Suporte VIVO");
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(20, 11, 468, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeDoSolicitante = new JLabel("Nome do solicitante");
		lblNomeDoSolicitante.setForeground(Color.WHITE);
		lblNomeDoSolicitante.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 17));
		lblNomeDoSolicitante.setBounds(20, 100, 231, 42);
		contentPane.add(lblNomeDoSolicitante);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Verdana", Font.BOLD, 18));
		txtNome.setBounds(20, 143, 231, 31);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descricação do Problema:");
		lblDescricao.setForeground(Color.WHITE);
		lblDescricao.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 17));
		lblDescricao.setBounds(20, 237, 248, 42);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(20, 279, 398, 127);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDataDeSolicitao = new JLabel("Data de Solicitação:");
		lblDataDeSolicitao.setForeground(Color.WHITE);
		lblDataDeSolicitao.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 17));
		lblDataDeSolicitao.setBounds(261, 99, 231, 42);
		contentPane.add(lblDataDeSolicitao);
		
		ds = new MaskFormatter("####/##/##");
		ds.setPlaceholderCharacter('_');
		
		txtData = new JFormattedTextField(ds);
		txtData.setBounds(261, 143, 177, 31);
		contentPane.add(txtData);
		
		JLabel lblAno = new JLabel("Ano | Mês | Dia");
		lblAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblAno.setBounds(261, 163, 177, 42);
		contentPane.add(lblAno);
		
		JButton btnEnviar = new JButton("Enviar");
		
		
		btnEnviar.setBackground(new Color(255, 255, 255));
		btnEnviar.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		btnEnviar.setBounds(442, 347, 226, 59);
		contentPane.add(btnEnviar);
		
		JLabel lblDepartamentoSolicitado = new JLabel("Departamento:");
		lblDepartamentoSolicitado.setForeground(Color.WHITE);
		lblDepartamentoSolicitado.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 18));
		lblDepartamentoSolicitado.setBounds(20, 164, 231, 42);
		contentPane.add(lblDepartamentoSolicitado);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setFont(new Font("Verdana", Font.BOLD, 18));
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(20, 206, 231, 31);
		contentPane.add(txtDepartamento);
		
		JButton btnAbrirGrafico = new JButton("Gráfico");
		btnAbrirGrafico.setBackground(new Color(255, 255, 255));
		btnAbrirGrafico.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		btnAbrirGrafico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcessoSSH assh = new AcessoSSH();
				assh.executar();
			}
		});
		btnAbrirGrafico.setBounds(442, 248, 226, 88);
		contentPane.add(btnAbrirGrafico);
		
		JLabel lblProblema = new JLabel("Qual o problema que está ocorrendo?");
		lblProblema.setForeground(Color.WHITE);
		lblProblema.setFont(new Font("Swis721 WGL4 BT", Font.BOLD | Font.ITALIC, 14));
		lblProblema.setBounds(20, 51, 307, 26);
		contentPane.add(lblProblema);
		
		JLabel lblLinha = new JLabel("");
		lblLinha.setIcon(new ImageIcon(SolicitacaoSuporte.class.getResource("/vivo-op.png")));
		lblLinha.setBackground(new Color(255, 255, 255));
		lblLinha.setForeground(new Color(255, 255, 255));
		lblLinha.setFont(new Font("Swis721 WGL4 BT", Font.BOLD | Font.ITALIC, 14));
		lblLinha.setBounds(448, 17, 220, 220);
		contentPane.add(lblLinha);
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Assessoria cadChamado = new Assessoria();
				if(txtNome.getText().trim().equals("")
					||txtDescricao.getText().trim().equals("")
					||txtDepartamento.getText().trim().equals("")
					||txtData.getText().trim().equals("")
					
						
						
						
						
				
						
				) {
					JOptionPane.showMessageDialog(null, "Precisamos que você descreva o seu problema e preencha todos os campos.","Erro",JOptionPane.ERROR_MESSAGE);
				}
				else {
					cadChamado.setNomePessoa(txtNome.getText());
					cadChamado.setDescricao(txtDescricao.getText());
					cadChamado.setDepartamento(txtDepartamento.getText());
					cadChamado.setDataAbertura(Date.valueOf(txtData.getText()));
					cadChamado.setStatusChamado("Pendente");
					
					JOptionPane.showMessageDialog(null, cc.gravar(cadChamado));
					
					limparCampos();
					
					
				}
					
					
					
				
			}
			
			
		
		});
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	private void limparCampos() {
		
		txtNome.setText("");
		txtDepartamento.setText("");
		txtDescricao.setText("");
		txtData.setText("");
	}
}
