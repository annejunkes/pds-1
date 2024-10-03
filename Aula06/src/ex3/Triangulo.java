package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Triangulo extends JFrame {
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Calcule o perímetro e a base de um triângulo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(69, 44, 313, 22);
		getContentPane().add(lblTitulo);
		
		JLabel lblInsiraBase = new JLabel("Base:");
		lblInsiraBase.setBounds(69, 93, 46, 14);
		getContentPane().add(lblInsiraBase);
		
		JLabel lblInsiraAltura = new JLabel("Altura:");
		lblInsiraAltura.setBounds(69, 127, 46, 14);
		getContentPane().add(lblInsiraAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setBounds(136, 90, 86, 20);
		getContentPane().add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(136, 124, 86, 20);
		getContentPane().add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(266, 105, 110, 23);
		getContentPane().add(btnCalcular);
		
		JLabel lbl = new JLabel("Base");
		lbl.setBounds(86, 198, 46, 14);
		getContentPane().add(lbl);

	}

}
