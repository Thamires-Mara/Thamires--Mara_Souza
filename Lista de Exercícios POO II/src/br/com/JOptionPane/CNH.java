package br.com.JOptionPane;

import javax.swing.JOptionPane;

public class CNH {
	
public static void main (String args[]) {
	
	String nome;
	String idade;
	int num;
	
	nome  = JOptionPane.showInputDialog("Informe seu nome");
	idade = JOptionPane.showInputDialog("Informe sua idade");
	num = Integer.parseInt( idade );

     if (num >= 18){
     
     JOptionPane.showInternalMessageDialog(null, num   +   " \nVocê já possui idade para retirar Carteira de Habilitação");
    	
}else
     
    JOptionPane.showInternalMessageDialog(null, num   +   " \nVocê ainda não possui idade para retirar Carteira de Habilitação");
    	 
}
}

