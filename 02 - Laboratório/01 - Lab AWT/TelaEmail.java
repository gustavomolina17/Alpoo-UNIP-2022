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

public class TelaEmail {
	
	public static void main (String[] args) {
		TelaBase t01 = new TelaBase();
		t01.setTitle("Tela Email");
		t01.setLayout(null);
		t01.setSize(300, 160);

		Label lb01 = new Label("Nome");
		lb01.setSize(50, 20);
		lb01.setLocation(20, 50);
		t01.add(lb01);

		TextField txtNome = new TextField();
		txtNome.setSize(170, 20);
		txtNome.setLocation(100, 50);
		t01.add(txtNome);

		Label lb02 = new Label("Email");
		lb02.setSize(50, 20);
		lb02.setLocation(20, 80);
		t01.add(lb02);

		TextField txEmail = new TextField();
		txEmail.setSize(170, 20);
		txEmail.setLocation(100, 80);
		t01.add(txEmail);
		
		Button btCancelar = new Button("Cancelar");
		btCancelar.setSize(120, 20);
		btCancelar.setLocation(20, 120);
		t01.add(btCancelar);
		
		Button btOk = new Button("Ok");
		btOk.setSize(120, 20);
		btOk.setLocation(150, 120);
		t01.add(btOk);

		t01.setVisible(true);
	}
}
