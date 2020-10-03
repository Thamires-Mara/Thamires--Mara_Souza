package br.com.JOptionPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio8 extends JFrame {

	private JPanel contentPane;
	private JRadioButton primeiro;
	private JRadioButton segundo;
	private JRadioButton terceiro;
	private JRadioButton quarto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio8 frame = new Exercicio8();
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
	public Exercicio8() {
		setTitle("Exerc\u00EDcio 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 65, 10, -28);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Informe sua faixa et\u00E1ria");
		lblNewLabel.setBounds(123, 17, 166, 20);
		contentPane.add(lblNewLabel);
		
		primeiro = new JRadioButton("12 entre 16 anos");
		primeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (primeiro.isSelected()) {
					
					segundo.setSelected(false);
					terceiro.setSelected(false);
					quarto.setSelected(false);
				}
			}
		});
		primeiro.setBounds(41, 64, 166, 23);
		contentPane.add(primeiro);
		
		segundo = new JRadioButton("17 entre 21 anos");
		segundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (segundo.isSelected()) {
					
					primeiro.setSelected(false);
					terceiro.setSelected(false);
					quarto.setSelected(false);
				}
			}
		});
		segundo.setBounds(41, 104, 166, 23);
		contentPane.add(segundo);
		
		terceiro = new JRadioButton("22 entre 25 anos");
		terceiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                   if (terceiro.isSelected()) {
					
					primeiro.setSelected(false);
					segundo.setSelected(false);
					quarto.setSelected(false);
				}
				
			}			
			
		});
		terceiro.setBounds(41, 145, 166, 23);
		contentPane.add(terceiro);
		
		JButton btnNewButtonok = new JButton("OK");
		btnNewButtonok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String selection = null;
				
				if (primeiro.isSelected()) {
					selection = "12 entre 16 anos selecionado";
				}
					
				if (segundo.isSelected()) {
					selection = "17 entre 21 anos selecionado";
				}
				if (terceiro.isSelected()) {
					selection = "22 entre 25 anos selecionado";
				}
				if (quarto.isSelected()) {
					selection = "Você está ficando velho!";
				}
				
				JOptionPane.showMessageDialog(null, selection);
			}
		});
		btnNewButtonok.setBounds(300, 215, 89, 23);
		contentPane.add(btnNewButtonok);
		
		quarto = new JRadioButton("Acima");
		quarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				       if (quarto.isSelected()) {
						
						primeiro.setSelected(false);
						segundo.setSelected(false);
						terceiro.setSelected(false);
					}
				
			}
		});
		quarto.setBounds(41, 186, 166, 23);
		contentPane.add(quarto);
	}
}
