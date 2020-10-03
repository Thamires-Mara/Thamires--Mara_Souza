package br.com.JOptionPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio10 frame = new Exercicio10();
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
	public Exercicio10() {
		setTitle("Exerc\u00EDcio 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxcity = new JComboBox();
		comboBoxcity.setEditable(true);
		comboBoxcity.setBounds(23, 59, 216, 30);
		contentPane.add(comboBoxcity);
		
		comboBoxcity.addItem("Belo Horizonte");
		comboBoxcity.addItem("Ouro Preto");
		comboBoxcity.addItem("Mariana");
		comboBoxcity.addItem("Itabirito");
		comboBoxcity.addItem("Diamantina");
        comboBoxcity.setSelectedItem(null);
		
		comboBoxcity.setSelectedItem("Selecione uma opção");
		
		JLabel lblNewLabel = new JLabel("Escolha uma Cidade");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 26, 199, 21);
		contentPane.add(lblNewLabel);
		
		JButton confirm = new JButton("Confirmar");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String value = (String) comboBoxcity.getSelectedItem ();
				JOptionPane.showMessageDialog(contentPane, "A cidade selecionada foi " + value);
			}
		});
		confirm.setBounds(297, 190, 107, 42);
		contentPane.add(confirm);
	}
}
