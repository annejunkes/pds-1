package exemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
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
	public ValidarIdade() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(33, 42, 56, 14);
		getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(33, 93, 56, 14);
		getContentPane().add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 39, 86, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(78, 90, 86, 20);
		getContentPane().add(txtIdade);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setBounds(10, 223, 414, 14);
		getContentPane().add(lblResposta);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrarResultado();
				String nome = txtNome.getText();
				
				if(nome.isEmpty()) {
					lblResposta.setText("Por favor, insira nome");
				}
				
				try {
				String idadeTxt = txtIdade.getText();
				int idade = Integer.parseInt(idadeTxt);
				
				if(idade<0) {
					JOptionPane.showMessageDialog(null, "Insira a idade novamente: ", "", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String mensagem = "Nome: " + nome + ", Idade: " + idade;
				if(idade<18) {
					mensagem += "(menor de idade)";
				}
				
				lblResposta.setText(mensagem);
				
			
				
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Insira a idade novamente: ", "", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnValidar.setBounds(176, 179, 89, 23);
		getContentPane().add(btnValidar);
		
	}
	
	//private void mostrarResultado() {
	//	String nome = txtNome.getText();
		
		//String idadeTxt = txtIdade.getText();
		
		//int idade = Integer.valueOf(idadeTxt);
		
		//lblResposta.setText("Nome e idade validados");
	//}
}
