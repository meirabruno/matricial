package br.com.hunters.control;

import java.awt.EventQueue;

import javax.swing.JButton;

import br.com.hunters.view.Tela;

public class Principal {
	
	public static void main (String [] args) {  
		final Tela tela = new Tela();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                tela.setVisible(true);
            }
        });
		
	} 
	
	



}
