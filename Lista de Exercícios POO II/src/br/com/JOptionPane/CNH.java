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
     
     JOptionPane.showInternalMessageDialog(null, num   +   " \nVoc� j� possui idade para retirar Carteira de Habilita��o");
    	
}else
     
    JOptionPane.showInternalMessageDialog(null, num   +   " \nVoc� ainda n�o possui idade para retirar Carteira de Habilita��o");
    	 
}
}

