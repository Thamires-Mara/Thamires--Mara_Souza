package br.com.JOptionPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldname;
	private JTextField textFieldcurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio7 frame = new Exercicio7();
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
	public Exercicio7() {
		setTitle("Exerc\u00EDcio 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite seu nome");
		lblNewLabel.setBounds(22, 49, 102, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite seu curso");
		lblNewLabel_1.setBounds(22, 92, 102, 17);
		contentPane.add(lblNewLabel_1);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(169, 49, 230, 20);
		contentPane.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldcurso = new JTextField();
		textFieldcurso.setBounds(169, 93, 230, 20);
		contentPane.add(textFieldcurso);
		textFieldcurso.setColumns(10);
		
		JButton btnNewButtonConfirm = new JButton("Confirmar");
		btnNewButtonConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Nome " + textFieldname.getText() + "\n Curso " + textFieldcurso.getText() );
							
				textFieldname.setText("");
				textFieldcurso.setText("");
				;
			}
		});
		btnNewButtonConfirm.setBounds(297, 197, 102, 23);
		contentPane.add(btnNewButtonConfirm);
	}

}
