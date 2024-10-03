package ex4e5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Fomelandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fomelandia frame = new Fomelandia();
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
	public Fomelandia() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Fomelândia");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(173, 18, 98, 18);
		getContentPane().add(lblTitulo);
		
		JLabel lblPrecoKg = new JLabel("Preço/kg: $9.95");
		lblPrecoKg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecoKg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecoKg.setBounds(173, 56, 98, 18);
		getContentPane().add(lblPrecoKg);
		
		JLabel lblInsiraPeso = new JLabel("Peso do prato:");
		lblInsiraPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInsiraPeso.setBounds(121, 102, 111, 13);
		getContentPane().add(lblInsiraPeso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(210, 100, 96, 19);
		getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		JLabel lblPagamento = new JLabel("");
		lblPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPagamento.setBounds(138, 174, 178, 27);
		getContentPane().add(lblPagamento);
		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pesoStr = textFieldPeso.getText();
				
				if(pesoStr.isEmpty()) {
					JOptionPane.showMessageDialog(null, "", "Campo obrigatório", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
					
					double peso = Double.parseDouble(pesoStr);
					
					double valor = peso*9.95;
					 
					String padrao = "###,###.##";
					DecimalFormat df = new DecimalFormat(padrao);
					
					String mensagem = "Valor a pagar: $" + df.format(valor);
					lblPagamento.setText(mensagem);
					
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "", "Insira valor válido", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCalcular.setBounds(186, 143, 85, 21);
		getContentPane().add(btnCalcular);

	}

}
