
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaPrincipal extends JFrame implements ActionListener {

	private JLabel lbId;
	private JLabel lbNome;
	private JLabel lbRa;
	private JLabel lbIdade;
	private JLabel lbLog;
	
	public JTextField tfId;
	public JTextField tfNome;
	public JTextField tfRa;
	public JTextField tfIdade;
	public JTextArea taObs;
	
	private JScrollPane sp; 
	private JButton btIns;
	private JButton btUpd;
	private JButton btDel;
	private JButton btSel;
	private JButton btCancel;
	
	public TelaPrincipal() {
		
		this.setLayout(null);
		this.setTitle("Tela de Acesso ao MySQL (Tabela \"aluno\")...");
		this.setBounds(200, 100, 450, 460);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		lbId = new JLabel("Id:...");
		lbId.setBounds(30, 30, 50, 25);
		tfId = new JTextField();
		tfId.setBounds(100, 30, 50, 25);

		lbNome = new JLabel("Nome:...");
		lbNome.setBounds(30, 60, 50, 25);
		tfNome = new JTextField();
		tfNome.setBounds(100, 60, 250, 25);

		lbRa = new JLabel("RA:...");
		lbRa.setBounds(30, 90, 50, 25);
		tfRa = new JTextField();
		tfRa.setBounds(100, 90, 100, 25);

		lbIdade = new JLabel("Idade:...");
		lbIdade.setBounds(30, 120, 50, 25);
		tfIdade = new JTextField();
		tfIdade.setBounds(100, 120, 50, 25);

		btIns = new JButton("Inserir");
		btIns.setBounds(20, 160, 95, 25);
		btUpd = new JButton("Atualizar");
		btUpd.setBounds(120, 160, 95, 25);
		btDel = new JButton("Excluir");
		btDel.setBounds(220, 160, 95, 25);
		btSel = new JButton("Visualizar");
		btSel.setBounds(320, 160, 95, 25);
		btCancel = new JButton("Cancel");
		btCancel.setBounds(320, 385, 95, 25);

		lbLog = new JLabel("(log das ações):");
		lbLog.setBounds(20, 200, 110, 25);
		
		Font f1 = new Font("Arial", Font.ITALIC, 14);
		taObs = new JTextArea();
		sp = new JScrollPane(taObs);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setBounds(20, 225, 395, 150);
		taObs.setEditable(false);
		taObs.setLineWrap(true);
		taObs.setWrapStyleWord(true);
		taObs.setBackground(new Color(216, 216, 216));
		taObs.setForeground(new Color(100, 0, 0));
		taObs.setFont(f1);
		
		this.add(lbId);
		this.add(tfId);
		this.add(lbNome);
		this.add(tfNome);
		this.add(lbRa);
		this.add(tfRa);
		this.add(lbIdade);
		this.add(tfIdade);
		
		this.add(btIns);
		this.add(btUpd);
		this.add(btDel);
		this.add(btSel);
		this.add(btCancel);

		btIns.addActionListener(this);
		btSel.addActionListener(this);
		btUpd.addActionListener(this);
		btDel.addActionListener(this);
		btCancel.addActionListener(this);
		
		this.add(lbLog);
		this.add(sp);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {

		CtrlTela ct = new CtrlTela();
		Object obj = arg0.getSource();

		if (obj.equals(btCancel)) {
			System.exit(0);
		} else if (obj.equals(btSel)) {
			ct.select(this);
		} else if (obj.equals(btIns)) {
			ct.insert(this);
		} else if (obj.equals(btUpd)) {
			ct.update(this);
		} else if (obj.equals(btDel)) {
			ct.delete(this);
		}

	}
	
}
