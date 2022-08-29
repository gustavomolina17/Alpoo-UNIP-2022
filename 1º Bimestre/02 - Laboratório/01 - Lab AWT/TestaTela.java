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
import java.awt.Color;

public class TestaTela {

	public static void main(String[] args){
		TelaBase t01 = new TelaBase();
		t01.setTitle("Tela Base - Tela 01");
		t01.setBackground(Color.green);
		t01.setVisible(true);
		
		TelaBase t02 = new TelaBase();
		t02.setTitle("Tela Base - Tela 02");
		t02.setBackground(Color.yellow);
		t02.setLocation(310, 0);
		t02.setVisible(true);
		
	}
}
