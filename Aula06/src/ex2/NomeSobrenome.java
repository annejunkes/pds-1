package ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ex1.Conversao;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class NomeSobrenome extends JFrame {
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NomeSobrenome frame = new NomeSobrenome();
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
	public NomeSobrenome() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(76, 69, 56, 14);
		getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(76, 106, 85, 14);
		getContentPane().add(lblSobrenome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(156, 66, 86, 20);
		getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBounds(156, 103, 86, 20);
		getContentPane().add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);
		
		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCompleto.setBounds(28, 172, 384, 14);
		getContentPane().add(lblNomeCompleto);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			//mostrarResultado();
			String nome = textFieldNome.getText();
			String sobrenome = textFieldSobrenome.getText();
			
			if(nome.isEmpty() || sobrenome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Campos obrigatórios", "", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			try {
			
			String mensagem = nome + " " + sobrenome;
			
			lblNomeCompleto.setText(mensagem);
			
		
			
			}catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Insira nome e sobrenome novamente: ", "", JOptionPane.ERROR_MESSAGE);
				
			}
		}

		});
		btnConcluir.setBounds(283, 86, 104, 23);
		getContentPane().add(btnConcluir);


	}

}

