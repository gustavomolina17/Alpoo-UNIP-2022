
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
..............................................
   AQUI COLOCAMOS OS MÉTODOS QUE IRÃO:
   - CAPTURAR OS DADOS DA TELA E GERAR UM JAVA BEAN COM ESTES DADOS
   - PREENCHER OS CAMPOS DA TELA COM OS DADOS DO JAVA BEAN RECEBIDO
   - VALIDAR OS CAMPOS ANTES DE REALIZAR QUALQUER OPERAÇÃO
..............................................
*/

public class CtrlTela {

	String txtLog = "";

	//..COMANDO SELECT DO BANCO DE DADOS
	public void select(TelaPrincipal ti) {
		
		Aluno al = new Aluno();
		AlunoDAO alDao = new AlunoDAO();
		// -------------------------------------------
		String txtId = ti.tfId.getText();
		// -------------------------------------------
		if (txtId.trim().equals("")) {
			txtLog = "O campo \"ID\" deve ser preenchido.";
			this.geraMSG(txtLog);
		} else if (!(this.ehNum(txtId))) {
			txtLog = "O valor do \"ID\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else {
			al.setId(Long.parseLong(txtId));
			// -------------------------------------------
			txtLog = alDao.select(al);
			// -------------------------------------------
			if (al.getNome().equals("")) {
				ti.tfNome.setText("");
				ti.tfRa.setText("");
				ti.tfIdade.setText("");
				txtLog = "Dados não encontrados";
			} else {
				ti.tfNome.setText(al.getNome());
				ti.tfRa.setText(al.getRa());
				ti.tfIdade.setText(Integer.toString(al.getIdade()));
			}
			// -------------------------------------------
			this.geraLog(ti);
		}
	}

	//..COMANDO INSERT DO BANCO DE DADOS
	public void insert(TelaPrincipal ti) {
		Aluno al = new Aluno();
		AlunoDAO alDao = new AlunoDAO();
		// -------------------------------------------
		String txtId = ti.tfId.getText();
		String txtNome = ti.tfNome.getText();
		String txtRa = ti.tfRa.getText();
		String txtIdade = ti.tfIdade.getText();
		// -------------------------------------------
		if (txtId.trim().equals("") || txtNome.trim().equals("")
				|| txtRa.trim().equals("") || txtIdade.trim().equals("")) {
			txtLog = "TODOS os campos devem ser preenchidos.";
			this.geraMSG(txtLog);
		} else if (!this.ehNum(txtId)) {
			txtLog = "O valor do \"ID\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else if (!this.ehNum(txtIdade)) {
			txtLog = "O valor da \"IDADE\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else {
			al.setId(Long.parseLong(txtId));
			al.setNome(txtNome);
			al.setRa(txtRa);
			al.setIdade(Integer.parseInt(txtIdade));
			// -------------------------------------------
			txtLog = alDao.insert(al);
			this.geraLog(ti);
		}
	}

	//..COMANDO DELETE DO BANCO DE DADOS
	public void delete(TelaPrincipal ti) {
		Aluno al = new Aluno();
		AlunoDAO alDao = new AlunoDAO();
		// -------------------------------------------
		String txtId = ti.tfId.getText();
		// -------------------------------------------
		if (txtId.trim().equals("")) {
			txtLog = "O campo \"ID\" deve ser preenchido.";
			this.geraMSG(txtLog);
		} else if (!(this.ehNum(txtId))) {
			txtLog = "O valor do \"ID\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else if (confirmaAcao("Atenção!!", "Confirma a Exclusão?", ti)){
			al.setId(Long.parseLong(txtId));
			// -------------------------------------------
			txtLog = alDao.delete(al);
			// -------------------------------------------
			ti.tfId.setText("");
			ti.tfNome.setText("");
			ti.tfRa.setText("");
			ti.tfIdade.setText("");
			this.geraLog(ti);
		}
	}

	//..COMANDO UPDATE DO BANCO DE DADOS
	public void update(TelaPrincipal ti) {
		Aluno al = new Aluno();
		AlunoDAO alDao = new AlunoDAO();
		// -------------------------------------------
		String txtId = ti.tfId.getText();
		String txtNome = ti.tfNome.getText();
		String txtRa = ti.tfRa.getText();
		String txtIdade = ti.tfIdade.getText();
		// -------------------------------------------
		if (txtId.trim().equals("") || txtNome.trim().equals("")
				|| txtRa.trim().equals("") || txtIdade.trim().equals("")) {
			txtLog = "TODOS os campos devem ser preenchidos.";
			this.geraMSG(txtLog);
		} else if (!this.ehNum(txtId)) {
			txtLog = "O valor do \"ID\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else if (!this.ehNum(txtIdade)) {
			txtLog = "O valor da \"IDADE\" deve ser numérico.";
			this.geraMSG(txtLog);
		} else {
			al.setId(Long.parseLong(txtId));
			al.setNome(txtNome);
			al.setRa(txtRa);
			al.setIdade(Integer.parseInt(txtIdade));
			// -------------------------------------------
			txtLog = alDao.update(al);
			this.geraLog(ti);
		}
	}

	//............METODOS AUXILIARES.............
	//...........................................

	public void geraLog(TelaPrincipal ti) {

		Date agora = new Date();
		String form1 = "dd/MM/yyyy";
		String form2 = "hh:mm:ss";
		DateFormat df1 = new SimpleDateFormat(form1);
		DateFormat df2 = new SimpleDateFormat(form2);

		String txt = ti.taObs.getText();
		ti.taObs.setText(txt + ">> " + txtLog + "\n\t[em " + df1.format(agora)
				+ ", às " + df2.format(agora) + "]\n\n");
	}
	
	public void geraMSG(String st) {
		JOptionPane.showMessageDialog(null, st, "Atenção !!", JOptionPane.WARNING_MESSAGE);
	}
	
	public boolean ehNum(String st) {
		boolean b = false;
		try {
			int a = Integer.parseInt(st);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}
	
	public boolean confirmaAcao(String msg1, String msg2, TelaPrincipal ti) {
		boolean fim = false;
		int n = JOptionPane.showConfirmDialog(
			    ti,msg2,msg1,JOptionPane.OK_CANCEL_OPTION);
		if (n == 0)
			fim = true;
		return fim;
	}


}
