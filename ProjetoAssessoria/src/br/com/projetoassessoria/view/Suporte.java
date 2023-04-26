package br.com.projetoassessoria.view;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.com.projetoassessoria.dao.CRUDAssessoria;
import br.com.projetoassessoria.domain.Assessoria;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Suporte extends JFrame {

	private JPanel contentPane;
	CRUDAssessoria cc = new CRUDAssessoria();
	MaskFormatter dr;
	private JTable table;
	private JComboBox txtStatus;
	private JTextField txtObservacoes;
	private JTextField txtId;
	private JTextField txtResponsavel;
	private JFormattedTextField txtDataResolucao;
	private JLabel lblObservacoes;
	private JLabel lblResponsavel;
	private JLabel lblDataResolucao;
	private JLabel lblStatus;
	private JLabel lblId;
	private Long id = null;
	private JPanel btnDeletar;
	private JPanel btnAtualizar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suporte frame = new Suporte();
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
	public Suporte() {
		try {
			setTitle("Suporte");
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 684, 625);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(107, 34, 135));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setLocationRelativeTo(null);
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			carregarTabela();
			
			lblId = new JLabel("ID do Chamado:");
			lblId.setForeground(new Color(255, 255, 255));
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
			lblId.setBounds(34, 154, 146, 26);
			contentPane.add(lblId);
			
			lblStatus = new JLabel("Status do Chamado:");
			lblStatus.setForeground(new Color(255, 255, 255));
			lblStatus.setHorizontalAlignment(SwingConstants.LEFT);
			lblStatus.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
			lblStatus.setBounds(190, 143, 162, 26);
			contentPane.add(lblStatus);
			
			lblDataResolucao = new JLabel("Data de Resolução:");
			lblDataResolucao.setForeground(new Color(255, 255, 255));
			lblDataResolucao.setHorizontalAlignment(SwingConstants.LEFT);
			lblDataResolucao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
			lblDataResolucao.setBounds(34, 205, 146, 26);
			contentPane.add(lblDataResolucao);
			
			lblResponsavel = new JLabel("Funcionário:");
			lblResponsavel.setForeground(new Color(255, 255, 255));
			lblResponsavel.setHorizontalAlignment(SwingConstants.LEFT);
			lblResponsavel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
			lblResponsavel.setBounds(34, 94, 146, 26);
			contentPane.add(lblResponsavel);
			
			lblObservacoes = new JLabel("Observações:");
			lblObservacoes.setForeground(new Color(255, 255, 255));
			lblObservacoes.setHorizontalAlignment(SwingConstants.LEFT);
			lblObservacoes.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 16));
			lblObservacoes.setBounds(34, 273, 124, 26);
			contentPane.add(lblObservacoes);
			
			txtStatus = new JComboBox();
			txtStatus.setModel(new DefaultComboBoxModel(new String[] {"Resolvido", "Pendente", "Em Análise"}));
			txtStatus.setBounds(190, 173, 200, 40);
			contentPane.add(txtStatus);
			
			
			txtObservacoes = new JTextField();
			txtObservacoes.setBounds(34, 298, 429, 127);
			contentPane.add(txtObservacoes);
			txtObservacoes.setColumns(10);
			
			txtId = new JTextField();
			txtId.setColumns(10);
			txtId.setBounds(34, 180, 146, 26);
			contentPane.add(txtId);
			
			txtResponsavel = new JTextField();
			txtResponsavel.setColumns(10);
			txtResponsavel.setBounds(34, 120, 356, 26);
			contentPane.add(txtResponsavel);
			
			dr = new MaskFormatter("####/##/##");
			dr.setPlaceholderCharacter('_');
			
			txtDataResolucao = new JFormattedTextField(dr);
			txtDataResolucao.setBounds(34, 230, 146, 26);
			contentPane.add(txtDataResolucao);
			
			btnDeletar = new JPanel();
			btnDeletar.setBackground(new Color(255, 255, 255));
			btnDeletar.setBounds(473, 367, 162, 58);
			contentPane.add(btnDeletar);
			
			JLabel lblDeletar = new JLabel("Deletar");
			lblDeletar.setFont(new Font("Tahoma", Font.PLAIN, 30));
			btnDeletar.add(lblDeletar);
			
			btnAtualizar = new JPanel();
			btnAtualizar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Assessoria rChamado = new Assessoria();
						
						
						if(txtResponsavel.getText().trim().equals("") || txtStatus.setSelectedItem()!= null || txtId.getText().trim().equals("") 
								|| txtDataResolucao.getText().trim().equals("")) {
							JOptionPane.showMessageDialog(null, "Os campos Responsável Chamado, Id do Chamado, Status do Chamado e Data de Resolução devem ser preenchidos",
									"Erro 202363XXc" , JOptionPane.ERROR_MESSAGE);
						}
						else {
							rChamado.setNomeFuncionario(txtResponsavel.getText());
							rChamado.setStatusChamado(txtStatus.getSelectedItem());
							rChamado.setDataResolucao(Date.valueOf(txtDataResolucao.getText()));
							rChamado.setObservacao(txtObservacoes.getText());
							rChamado.setIdChamado(id);
							
							JOptionPane.showMessageDialog(null, cc.atualizar(rChamado));
							carregarTabela();
							limparCampos();
						}
					}
				});
			btnAtualizar.setBackground(new Color(255, 255, 255));
			btnAtualizar.setBounds(473, 298, 162, 58);
			contentPane.add(btnAtualizar);
			
			JLabel lblNewLabel_2 = new JLabel("Atualizar");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			btnAtualizar.add(lblNewLabel_2);
			
			JLabel lblNewLabel = new JLabel("Suporte VIVO");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
			lblNewLabel.setBounds(34, 23, 356, 40);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Suporte.class.getResource("/vivo-op.png")));
			lblNewLabel_1.setBounds(420, 49, 225, 227);
			contentPane.add(lblNewLabel_1);
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
	private void carregarTabela() {
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 436, 601, 139);
		contentPane.add(scrollPane);
		
		String[] cabecalho = {
				"Id Chamado",
				"Solicitação",
				"Departamento",
				"Descrição",
				"Data de Abertura"
			};
		Object[][] dados = new Object[cc.listar().size()][5];
		for(int i = 0 ; i < dados.length ; i++) {
			dados[i][0] = cc.listar().get(i).getIdChamado();
			dados[i][1] = cc.listar().get(i).getNomePessoa();
			dados[i][2] = cc.listar().get(i).getDepartamento();
			dados[i][3] = cc.listar().get(i).getDescricao();
			dados[i][4] = cc.listar().get(i).getDataAbertura();
		}
		
		DefaultTableModel model = new DefaultTableModel(dados,cabecalho);
		JTable table = new JTable(model);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				id = Long.parseLong(String.valueOf(table.getValueAt(table.getSelectedRow(),0)));
				txtId.setText(String.valueOf(id));
			}
		});
		
		table.setForeground(SystemColor.desktop);
		table.setBackground(SystemColor.control);
		scrollPane.setViewportView(table);
	}
	private void limparCampos() {
		txtResponsavel.setText("");
		txtDataResolucao.setText("");
		txtId.setText("");
		txtObservacoes.setText("");
	}
}