package ex1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Temperatura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
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
	public Temperatura() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblDigiteTemperatura = new JLabel("Digite uma temperatura em Farenheit:");
		lblDigiteTemperatura.setBounds(88, 70, 293, 14);
		getContentPane().add(lblDigiteTemperatura);
		
		textFieldTemperatura = new JTextField();
		textFieldTemperatura.setBounds(88, 114, 86, 20);
		getContentPane().add(textFieldTemperatura);
		textFieldTemperatura.setColumns(10);
		
		JLabel lbl = new JLabel("Temperatura em Celsius:");
		lbl.setBounds(88, 161, 162, 14);
		getContentPane().add(lbl);

		JLabel lblTemperaturaConvertida = new JLabel("");
		lblTemperaturaConvertida.setBounds(261, 161, 46, 14);
		getContentPane().add(lblTemperaturaConvertida);

		
		JButton btnConverter = new JButton("Converter");
		
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrarResultado();
				String farenheitStr = textFieldTemperatura.getText();
				
				if(farenheitStr.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campo Obrigatório", "", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
				double farenheit = Double.parseDouble(textFieldTemperatura.getText());
				
				double c;
				
				Conversao conversao = new Conversao();
				
				conversao.calcularTemperatura(farenheit);
				
				String mensagem = "" + conversao.calcularTemperatura(farenheit);
				
				lblTemperaturaConvertida.setText(mensagem);
				
			
				
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Insira a temperatura novamente: ", "", JOptionPane.ERROR_MESSAGE);
					
				}
			}

		});
		
		btnConverter.setBounds(192, 113, 129, 23);
		getContentPane().add(btnConverter);
		
	}
}
