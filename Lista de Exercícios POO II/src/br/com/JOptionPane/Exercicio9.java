package br.com.JOptionPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio9 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio9 frame = new Exercicio9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio9() {
		setTitle("Exerc\u00EDcio 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Acr\u00E9scimos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(196, 38, 214, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox bacon = new JCheckBox("Bacon");
		bacon.setBounds(12, 22, 97, 23);
		panel.add(bacon);
		
		JCheckBox calabresa = new JCheckBox("Calabresa");
		calabresa.setBounds(12, 51, 97, 23);
		panel.add(calabresa);
		
		JCheckBox queijo = new JCheckBox("Queijo");
		queijo.setBounds(12, 80, 97, 23);
		panel.add(queijo);
		
		JCheckBox Molho = new JCheckBox("Molho");
		Molho.setBounds(12, 109, 97, 23);
		panel.add(Molho);
		
		JCheckBox borda = new JCheckBox("Borda Recheada");
		borda.setBounds(12, 138, 120, 23);
		panel.add(borda);
		
		JButton Confim = new JButton("Confirmar");
		Confim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String result = "";
				for (Component c : panel.getComponents()) {
					if (c.getClass().equals (JCheckBox.class)) {
						JCheckBox jck = (JCheckBox) c;
						if (jck.isSelected())
							result += jck.getText() +" ,";
						
					}
				}
				
				JOptionPane.showMessageDialog(null, result);
			}
		});
		Confim.setBounds(107, 167, 97, 23);
		panel.add(Confim);
		
		JComboBox comboBoxSabores = new JComboBox();
		comboBoxSabores.setEditable(true);
		comboBoxSabores.setBounds(10, 110, 176, 22);
		contentPane.add(comboBoxSabores);
		
	
		comboBoxSabores.addItem("4 Queijos");
		comboBoxSabores.addItem("Frango com Catupiry");
		comboBoxSabores.addItem("Margherita");
		comboBoxSabores.addItem("Vegetariana");
		comboBoxSabores.addItem("Portuguesa");
		comboBoxSabores.setSelectedItem(null);
		
		comboBoxSabores.setSelectedItem("Selecione a opção");
		
		JLabel options = new JLabel("Escolha o sabor da sua Pizza!");
		options.setForeground(Color.BLUE);
		options.setFont(new Font("Calibri Light", Font.PLAIN, 13));
		options.setBounds(10, 77, 158, 22);
		contentPane.add(options);
		
		JLabel optionsacrescimos = new JLabel("Escolha 1 ou mais acr\u00E9scimos");
		optionsacrescimos.setForeground(Color.BLUE);
		optionsacrescimos.setFont(new Font("Calibri Light", Font.PLAIN, 13));
		optionsacrescimos.setBounds(199, 13, 211, 22);
		contentPane.add(optionsacrescimos);
		
		JButton confirmasabor = new JButton("Confirmar sabor");
		confirmasabor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String value = (String) comboBoxSabores.getSelectedItem ();
				JOptionPane.showMessageDialog(contentPane, value);
			}
		});
		confirmasabor.setBounds(23, 175, 132, 31);
		contentPane.add(confirmasabor);
		
		
		
		
	}
}
