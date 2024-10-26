package desafio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import desafio.TelaDePedido;
import javax.swing.JButton;

public class TelaDePedido extends JFrame {

	private static final long serialVersionUID = 1L;

	ButtonGroup rdbuttons = new ButtonGroup();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDePedido frame = new TelaDePedido();
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
	public TelaDePedido() {
		setTitle("Massas E Queijos");
		getContentPane().setBackground(new Color(243, 240, 180));
		setBounds(100, 100, 450, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 98, 119, 195);
		panel.setForeground(new Color(0, 255, 64));
		panel.setBackground(new Color(236, 227, 128));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxCalabresa = new JCheckBox("Calabresa ($20)");
		chckbxCalabresa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxCalabresa.setBounds(6, 9, 107, 23);
		panel.add(chckbxCalabresa);
		
		JCheckBox chckbxPortuguesa = new JCheckBox("Portuguesa ($15)");
		chckbxPortuguesa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPortuguesa.setBounds(6, 87, 107, 23);
		panel.add(chckbxPortuguesa);
		
		JCheckBox chckbx4Queijos = new JCheckBox("4 Queijos ($14)");
		chckbx4Queijos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbx4Queijos.setBounds(6, 113, 107, 23);
		panel.add(chckbx4Queijos);
		
		JCheckBox chckbxFrango = new JCheckBox("Frango ($18)");
		chckbxFrango.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxFrango.setBounds(6, 61, 107, 23);
		panel.add(chckbxFrango);
		
		JCheckBox chckbxVegetariana = new JCheckBox("Vegetariana($12)");
		chckbxVegetariana.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxVegetariana.setBounds(6, 139, 107, 23);
		panel.add(chckbxVegetariana);
		
		JCheckBox chckbxTomate = new JCheckBox("Tomate ($10)");
		chckbxTomate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxTomate.setBounds(6, 165, 107, 23);
		panel.add(chckbxTomate);
		
		JCheckBox chckbxAlcatra = new JCheckBox("Alcatra ($25)");	
		chckbxAlcatra.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxAlcatra.setBounds(6, 35, 107, 23);
		panel.add(chckbxAlcatra);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setBounds(273, 98, 130, 22);
		getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Retirada", "Tele Entrega (+ $10)", "No local"}));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(190, 219, 138));
		panel_1.setBounds(163, 230, 130, 63);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnBorda = new JRadioButton("Com borda (+ $2)");
		rdbtnBorda.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnBorda.setBounds(6, 7, 116, 23);
		panel_1.add(rdbtnBorda);
		rdbuttons.add(rdbtnBorda);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("Sem borda");
		rdbtnSemBorda.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnSemBorda.setBounds(6, 33, 116, 23);
		panel_1.add(rdbtnSemBorda);
		rdbuttons.add(rdbtnSemBorda);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(0, 255, 64));
		panel_2.setBackground(new Color(233, 179, 129));
		panel_2.setBounds(163, 98, 100, 115);
		getContentPane().add(panel_2);
		
		JCheckBox chckbxCatupiry = new JCheckBox("+ Catupiry");
		chckbxCatupiry.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxCatupiry.setBounds(6, 7, 88, 23);
		panel_2.add(chckbxCatupiry);
		
		JCheckBox chckbxQueijo = new JCheckBox("+ Milho");
		chckbxQueijo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxQueijo.setBounds(6, 33, 88, 23);
		panel_2.add(chckbxQueijo);
		
		JCheckBox chckbxCheddar = new JCheckBox("+ Cheddar");
		chckbxCheddar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxCheddar.setBounds(6, 59, 88, 23);
		panel_2.add(chckbxCheddar);
		
		JCheckBox chckbxErvilha = new JCheckBox("+ Ervilha");
		chckbxErvilha.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxErvilha.setBounds(6, 85, 88, 23);
		panel_2.add(chckbxErvilha);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 255, 64));
		panel_3.setBackground(new Color(250, 248, 199));
		panel_3.setBounds(22, 11, 391, 38);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFacaSeuPedido = new JLabel("FAÇA SEU PEDIDO");
		lblFacaSeuPedido.setBounds(125, 11, 127, 14);
		panel_3.add(lblFacaSeuPedido);
		lblFacaSeuPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacaSeuPedido.setFont(new Font("Tahoma", Font.ITALIC, 14));
		
		JLabel lblPor = new JLabel("$5 por adicional");
		lblPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblPor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPor.setBounds(154, 74, 109, 14);
		getContentPane().add(lblPor);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(new Color(0, 255, 64));
		panel_4.setBackground(new Color(236, 227, 128));
		panel_4.setBounds(273, 161, 130, 30);
		getContentPane().add(panel_4);
		
		JLabel lblValor = new JLabel("");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblValor.setBounds(77, 10, 53, 13);
		panel_4.add(lblValor);
		
		JLabel lblText = new JLabel("Valor a pagar:");
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblText.setBounds(10, 10, 69, 13);
		panel_4.add(lblText);
		
		JButton btnConcluir = new JButton("Concluir");
		
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sabor=0;
				double valor=0;
				
				if(chckbxCalabresa.isSelected()) {
					valor = valor + 20;
					sabor++;
				}
				if(chckbxPortuguesa.isSelected()) {
					valor = valor + 15;
					sabor++;
				}
				if(chckbxAlcatra.isSelected()) {
					valor = valor + 25;
					sabor++;
				}
				if(chckbx4Queijos.isSelected()) {
					valor = valor + 14;
					sabor++;
				}
				if(chckbxFrango.isSelected()) {
					valor = valor + 18;
					sabor++;
				}
				if(chckbxVegetariana.isSelected()) {
					valor = valor + 12;
					sabor++;
				}
				if(chckbxTomate.isSelected()) {
					valor = valor + 10;
					sabor++;
				}
				
				if(sabor>3) {
					JOptionPane.showMessageDialog(null, "", "Apenas 3 sabores permitidos",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(chckbxCatupiry.isSelected()) {
					valor = valor + 5;
				}
				if(chckbxQueijo.isSelected()) {
					valor = valor + 5;
				}
				if(chckbxCheddar.isSelected()) {
					valor = valor + 5;
				}
				if(chckbxErvilha.isSelected()) {
					valor = valor + 5;
				}
				
				if(comboBox.getSelectedItem().equals("Tele Entrega (+ $10)")) {
					valor = valor + 10;
				}
				
				if(rdbtnBorda.isSelected()) {
					valor = valor + 2;
				}

				
				
				lblValor.setText("$" + valor);
				
				
				
			}});
		btnConcluir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConcluir.setBounds(273, 130, 130, 21);
		getContentPane().add(btnConcluir);
		
		JLabel lblSabores = new JLabel("Sabores");
		lblSabores.setHorizontalAlignment(SwingConstants.CENTER);
		lblSabores.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSabores.setBounds(34, 74, 109, 14);
		getContentPane().add(lblSabores);

		

	}
}
