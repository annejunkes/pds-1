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

public class Gasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldPrecoLitro;
	private JTextField textFieldPagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina frame = new Gasolina();
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
	public Gasolina() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Quer saber quantos litros de gasolina consegue abastecer por preço?");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 48, 416, 22);
		getContentPane().add(lblTitulo);
		
		JLabel lblInsiraPreçoLitro = new JLabel("Preço por litro:");
		lblInsiraPreçoLitro.setBounds(90, 93, 108, 13);
		getContentPane().add(lblInsiraPreçoLitro);
		
		JLabel lblInsiraValor = new JLabel("Valor a pagar:");
		lblInsiraValor.setBounds(90, 129, 108, 13);
		getContentPane().add(lblInsiraValor);
		
		textFieldPrecoLitro = new JTextField();
		textFieldPrecoLitro.setBounds(190, 90, 96, 19);
		getContentPane().add(textFieldPrecoLitro);
		textFieldPrecoLitro.setColumns(10);
		
		textFieldPagamento = new JTextField();
		textFieldPagamento.setBounds(190, 126, 96, 19);
		getContentPane().add(textFieldPagamento);
		textFieldPagamento.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResposta.setBounds(79, 189, 225, 13);
		getContentPane().add(lblResposta);
		
		JButton btnCalcular = new JButton("Calcular");
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String precoLitroStr = textFieldPrecoLitro.getText();
				String pagamentoStr = textFieldPagamento.getText();
				
				if(precoLitroStr.isEmpty() || pagamentoStr.isEmpty()) {
					JOptionPane.showMessageDialog(null, "", "Preencha os dois campos",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
					
					double precoLitro = Double.parseDouble(precoLitroStr);
					double pagamento = Double.parseDouble(pagamentoStr);
					
					double qtdLitros = pagamento/precoLitro;
					 
					String padrao = "###,###.##";
					DecimalFormat df = new DecimalFormat(padrao);
					
					String resposta = "Quantidade de litros: " + df.format(qtdLitros);
					lblResposta.setText(resposta);
					
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "", "Insira valor válido", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCalcular.setBounds(310, 107, 85, 21);
		getContentPane().add(btnCalcular);

	}
}
