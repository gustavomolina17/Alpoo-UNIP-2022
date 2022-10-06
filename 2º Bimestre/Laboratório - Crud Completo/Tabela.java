import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela extends JFrame implements ActionListener {

	JButton atual = new JButton("Atualizar");
	private JScrollPane objJSP = new JScrollPane();
	private JTable objJT;
	private DefaultTableModel objDTM;

	public Tabela() {

		this.setSize(500, 400);
		this.setLocation(700, 100);
		this.setTitle("CONSTRUINDO UMA TABELA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] titulos = { "ID", "NOME", "RA", "IDADE" };
		objDTM = new DefaultTableModel(titulos, 0);
		objJT = new JTable(objDTM);
		objJT.getColumnModel().getColumn(0).setPreferredWidth(20);
		objJT.getColumnModel().getColumn(1).setPreferredWidth(200);
		this.acessaBD();
		objJSP.setViewportView(objJT);
		this.add(objJSP);
		this.add(atual, BorderLayout.SOUTH);
		atual.addActionListener(this);
		this.setVisible(true);

	}

	public void acessaBD() {
		this.abreCon();
		String query = "select * from aluno";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String nome = rs.getString("nome");
				String ra = rs.getString("ra");
				String idade = rs.getString("idade");
				String[] dados = { id, nome, ra, idade };
				objDTM.addRow(dados);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(atual)) {
			int qtd = objDTM.getRowCount();
			for (int i = 0; i < qtd; i++) {
				objDTM.removeRow(0);
			}
			this.acessaBD();
		}
	}

	// ......PARA LIDAR COM O BANCO DE DADOS..........
	// ...............................................

	private Connection con;

	private void abreCon() {
		this.con = new ConnectionFactory().getConnection();
	}

	private void fechaCon() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
