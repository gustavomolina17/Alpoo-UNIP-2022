/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpoo_01;

/**
 *
 * @author Gustavo Molina
 */
import java.awt.*;

public class TelaCadastro {
	
	public static void main (String[] args) {
		TelaBase t01 = new TelaBase();
		t01.setTitle("Tela Cadastro");
		t01.setLayout(null);
		t01.setSize(500, 300);

		Label lb01 = new Label("Código");
		lb01.setSize(50, 20);
		lb01.setLocation(20, 50);
		t01.add(lb01);

		Label lb02 = new Label("Nome");
		lb02.setSize(50, 20);
		lb02.setLocation(200, 50);
		t01.add(lb02);

		Label lb03 = new Label("Email");
		lb03.setSize(40, 20);
		lb03.setLocation(20, 90);
		t01.add(lb03);

		Label lb04 = new Label("Fone");
		lb04.setSize(40, 20);
		lb04.setLocation(290, 90);
		t01.add(lb04);

		Label lb05 = new Label("Endereço");
		lb05.setSize(60, 20);
		lb05.setLocation(20, 130);
		t01.add(lb05);
		
		TextField txCodigo = new TextField();
		txCodigo.setLocation(70, 50);
		txCodigo.setSize(50, 20);
		t01.add(txCodigo);
		
		TextField txNome = new TextField();
		txNome.setLocation(250, 50);
		txNome.setSize(200, 20);
		t01.add(txNome);

		TextField txEmail = new TextField();
		txEmail.setLocation(70, 90);
		txEmail.setSize(170, 20);
		t01.add(txEmail);

		TextField txFone = new TextField();
		txFone.setLocation(330, 90);
		txFone.setSize(120, 20);
		t01.add(txFone);

		TextField txEndereco = new TextField();
		txEndereco.setLocation(90, 130);
		txEndereco.setSize(360, 20);
		t01.add(txEndereco);
		
		Button btOk = new Button("Ok");
		btOk.setLocation(370, 250);
		btOk.setSize(70, 25);
		t01.add(btOk);
		
		t01.setVisible(true);
	}
}