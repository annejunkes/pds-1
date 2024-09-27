package aula06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Quiz Duna");
		lblNewLabel.setBounds(49, 38, 115, 14);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(184, 216, 65, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JButton btnTeste1 = new JButton("Teste1");
		btnTeste1.setBounds(34, 138, 89, 23);
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Lisan al gaib");
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnTeste1);
		getContentPane().add(lblNewLabel);
		getContentPane().add(btnFechar);
		
		JButton btnTeste2 = new JButton("Teste2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int input = JOptionPane.showConfirmDialog(null, "Você conhece o Muad D'ib?",
					"Responda",JOptionPane.YES_NO_OPTION);
			System.out.println(input);//sim=0 nao=1

			if(input == 0) {
				JOptionPane.showMessageDialog(null,"Parabéns! você ganhou um ponto", "input sim",JOptionPane.INFORMATION_MESSAGE);
				
			}
			if(input == 1) {
				JOptionPane.showMessageDialog(null,"Que pena! Você não ganhou nenhum ponto","input não",JOptionPane.ERROR_MESSAGE);
				
			}
			
				
			}
			
		});
		btnTeste2.setBounds(170, 138, 89, 23);
		getContentPane().add(btnTeste2);
		
		JButton btnTeste3 = new JButton("Teste3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null, "Escreva o seu nome:", JOptionPane.QUESTION_MESSAGE);
				
				JOptionPane.showMessageDialog(btnTeste3, e);
			}
			
		});
		btnTeste3.setBounds(305, 138, 89, 23);
		getContentPane().add(btnTeste3);

	}
}
