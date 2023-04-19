package br.com.projetoescola.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.com.projetoescola.dao.CRUDCurso;
import br.com.projetoescola.domain.Curso;

public class GerenciarCurso extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtTitulo;
	
	MaskFormatter di;
	MaskFormatter dt;
	MaskFormatter hi;
	MaskFormatter ht;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarCurso frame = new GerenciarCurso();
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
	public GerenciarCurso() {
		try {
		setTitle("Gerenciar Curso");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 109));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 582, 153);
		contentPane.add(scrollPane);
		
		String[] cabecalho = {
				"ID Curso",
				"Título do Curso",
				"Descrição do Curso",
				"Data de Início",
				"Data de Término",
				"Horário de Início",
				"Horário de Término",
				
		};
		
		CRUDCurso cc = new CRUDCurso();
		Object[][] dados = new Object[cc.listar().size()][7];
		
		for(int i = 0; i < dados.length; i++) {
			dados[i][0] = cc.listar().get(i).getIdCurso();
			dados[i][0] = cc.listar().get(i).getTitulo();
			dados[i][0] = cc.listar().get(i).getDescricao();
			dados[i][0] = cc.listar().get(i).getDatainicio();
			dados[i][0] = cc.listar().get(i).getDatatermino();
			dados[i][0] = cc.listar().get(i).getHorainicio();
			dados[i][0] = cc.listar().get(i).getHaratermino();
		};
		
		DefaultTableModel model = new DefaultTableModel(dados, cabecalho);
		
		table = new JTable(model);
		table.setBackground(new Color(255,255,255));
		scrollPane.setViewportView(table);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTitulo.setBounds(10, 47, 332, 25);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setBounds(352, 129, 115, 47);
		contentPane.add(btnCadastrar);
		
		JEditorPane txtDescricao = new JEditorPane();
		txtDescricao.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDescricao.setBounds(10, 93, 332, 137);
		contentPane.add(txtDescricao);
		txtDescricao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		JLabel lblDescricao = new JLabel("Descrição do Curso:");
		lblDescricao.setForeground(new Color(255, 255, 255));
		lblDescricao.setFont(new Font("Arial", Font.BOLD, 12));
		lblDescricao.setBounds(10, 72, 130, 20);
		contentPane.add(lblDescricao);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 12));
		btnConsultar.setBackground(new Color(255, 255, 255));
		btnConsultar.setBounds(477, 129, 115, 47);
		contentPane.add(btnConsultar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAtualizar.setBackground(new Color(255, 255, 255));
		btnAtualizar.setBounds(352, 183, 115, 47);
		contentPane.add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setFont(new Font("Arial", Font.BOLD, 12));
		btnApagar.setBackground(new Color(255, 255, 255));
		btnApagar.setBounds(477, 183, 115, 47);
		contentPane.add(btnApagar);
		
		di = new MaskFormatter("##/##/####");
		di.setPlaceholderCharacter('_');
		
		JFormattedTextField txtDataInicio = new JFormattedTextField(di);
		txtDataInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDataInicio.setBounds(352, 47, 115, 25);
		contentPane.add(txtDataInicio);
		
		JLabel lblNomeDoCurso = new JLabel("Nome do Curso:");
		lblNomeDoCurso.setForeground(new Color(255, 255, 255));
		lblNomeDoCurso.setBackground(new Color(255, 255, 255));
		lblNomeDoCurso.setFont(new Font("Arial", Font.BOLD, 12));
		lblNomeDoCurso.setBounds(10, 25, 130, 20);
		contentPane.add(lblNomeDoCurso);
		
		dt = new MaskFormatter("##/##/####");
		dt.setPlaceholderCharacter('_');
		
		JFormattedTextField txtDataTermino = new JFormattedTextField(dt);
		txtDataTermino.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDataTermino.setBounds(477, 47, 115, 25);
		contentPane.add(txtDataTermino);
		
		hi = new MaskFormatter("##:##");
		hi.setPlaceholderCharacter('_');
		
		JFormattedTextField txtHorarioInicio = new JFormattedTextField(hi);
		txtHorarioInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		txtHorarioInicio.setBounds(352, 93, 115, 25);
		contentPane.add(txtHorarioInicio);
		
		ht = new MaskFormatter("##:##");
		ht.setPlaceholderCharacter('_');
		
		JFormattedTextField txtHorarioTermino = new JFormattedTextField(ht);
		txtHorarioTermino.setFont(new Font("Arial", Font.PLAIN, 12));
		txtHorarioTermino.setBounds(477, 93, 115, 25);
		contentPane.add(txtHorarioTermino);
		
		JLabel lblDataDeIncio = new JLabel("Data de Início:");
		lblDataDeIncio.setForeground(Color.WHITE);
		lblDataDeIncio.setFont(new Font("Arial", Font.BOLD, 12));
		lblDataDeIncio.setBackground(Color.WHITE);
		lblDataDeIncio.setBounds(352, 25, 115, 20);
		contentPane.add(lblDataDeIncio);
		
		JLabel lblDataDeTrmino = new JLabel("Data de Término:");
		lblDataDeTrmino.setForeground(Color.WHITE);
		lblDataDeTrmino.setFont(new Font("Arial", Font.BOLD, 12));
		lblDataDeTrmino.setBackground(Color.WHITE);
		lblDataDeTrmino.setBounds(477, 28, 115, 20);
		contentPane.add(lblDataDeTrmino);
		
		JLabel lblHorrioDeTrmino = new JLabel("Horário de Término:");
		lblHorrioDeTrmino.setForeground(Color.WHITE);
		lblHorrioDeTrmino.setFont(new Font("Arial", Font.BOLD, 12));
		lblHorrioDeTrmino.setBackground(Color.WHITE);
		lblHorrioDeTrmino.setBounds(477, 72, 115, 20);
		contentPane.add(lblHorrioDeTrmino);
		
		JLabel lblHorrioDeIncio = new JLabel("Horário de Início:");
		lblHorrioDeIncio.setForeground(Color.WHITE);
		lblHorrioDeIncio.setFont(new Font("Arial", Font.BOLD, 12));
		lblHorrioDeIncio.setBackground(Color.WHITE);
		lblHorrioDeIncio.setBounds(352, 72, 130, 20);
		contentPane.add(lblHorrioDeIncio);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Curso cadCurso = new Curso();
				if(txtTitulo.getText().trim().equals("")
						|| txtDescricao.getText().trim().equals("")
						|| txtDataInicio.getText().trim().equals("")
						|| txtDataTermino.getText().trim().equals("")
						|| txtHorarioInicio.getText().trim().equals("")
						|| txtHorarioTermino.getText().trim().equals("")
						) {
					JOptionPane.showMessageDialog(null,"Você deve preencher todos os campos","Erro",JOptionPane.ERROR_MESSAGE);
				}
				else {
					cadCurso.setTitulo(txtTitulo.getText());
					cadCurso.setDescricao(txtDescricao.getText());
					cadCurso.setDatainicio(Date.valueOf(txtDataInicio.getText()));
					cadCurso.setDatatermino(Date.valueOf(txtDataTermino.getText()));
					cadCurso.setHorainicio(txtHorarioInicio.getText());
					cadCurso.setHaratermino(txtHorarioTermino.getText());
					
					JOptionPane.showMessageDialog(null, cc.gravar(cadCurso));
					
				}
			}
		});		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
