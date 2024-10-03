package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AreaPerimetro extends JFrame {
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaPerimetro frame = new AreaPerimetro();
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
	public AreaPerimetro() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Calcule o perímetro e a base de um retângulo");
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
		
		JLabel lblPerimetro = new JLabel("");
		lblPerimetro.setBounds(165, 199, 45, 13);
		getContentPane().add(lblPerimetro);
		
		JLabel lblArea = new JLabel("");
		lblArea.setBounds(276, 199, 45, 13);
		getContentPane().add(lblArea);

		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String alturaStr = textFieldAltura.getText();
				String baseStr = textFieldBase.getText();
				
				if(alturaStr.isEmpty() || baseStr.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Insira valores nos dois campos","",JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {

				Double altura = Double.parseDouble(alturaStr);
				
				Double base = Double.parseDouble(baseStr);
				
				Retangulo retangulo = new Retangulo();
				double perimetro = retangulo.calcularPerimetro(altura,base);
				double area = retangulo.calcularArea(altura, base);
				
				String resultadoPerimetro = "" + perimetro;
				lblPerimetro.setText(resultadoPerimetro);
				
				String resultadoArea = "" + area;
				lblArea.setText(resultadoArea);
				
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Valor inserido deve ser número","", JOptionPane.ERROR_MESSAGE);
				}
		}
		});		
		btnCalcular.setBounds(266, 105, 110, 23);
		getContentPane().add(btnCalcular);
		
		JLabel lbl = new JLabel("Perímetro =");
		lbl.setBounds(86, 198, 86, 14);
		getContentPane().add(lbl);
		
		JLabel lbl2 = new JLabel("Área =");
		lbl2.setBounds(230, 199, 55, 13);
		getContentPane().add(lbl2);


	}
}
