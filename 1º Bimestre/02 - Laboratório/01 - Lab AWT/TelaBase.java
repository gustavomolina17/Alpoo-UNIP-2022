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
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaBase extends Frame {
	TelaBase() {
		Dimension d01 =new Dimension(300, 300);
		this.setSize(d01);
		// Fechamento da Janela
		addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				dispose();  
			}  
		});  
	}
}
