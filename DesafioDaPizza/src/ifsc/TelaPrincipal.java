package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPincipal frame = new TelaPincipal();
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
		setTitle("Massas E Queijos");
		getContentPane().setBackground(new Color(243, 240, 180));
		setBounds(100, 100, 450, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 66, 119, 195);
		panel.setForeground(new Color(0, 255, 64));
		panel.setBackground(new Color(236, 227, 128));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxCalabesa = new JCheckBox("Calabresa ($20)");
		chckbxCalabesa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxCalabesa.setBounds(6, 9, 107, 23);
		panel.add(chckbxCalabesa);
		
		JCheckBox chckbxPortuguesa = new JCheckBox("Portuguesa");
		chckbxPortuguesa.setBounds(6, 87, 88, 23);
		panel.add(chckbxPortuguesa);
		
		JCheckBox chckbx4Queijos = new JCheckBox("4 Queijos");
		chckbx4Queijos.setBounds(6, 113, 88, 23);
		panel.add(chckbx4Queijos);
		
		JCheckBox chckbxFrango = new JCheckBox("Frango");
		chckbxFrango.setBounds(6, 61, 88, 23);
		panel.add(chckbxFrango);
		
		JCheckBox chckbxVgetariana = new JCheckBox("Vegetariana");
		chckbxVgetariana.setBounds(6, 139, 88, 23);
		panel.add(chckbxVgetariana);
		
		JCheckBox chckbxTomate = new JCheckBox("Tomate");
		chckbxTomate.setBounds(6, 165, 88, 23);
		panel.add(chckbxTomate);
		
		JCheckBox chckbxAlcatra = new JCheckBox("Alcatra");
		chckbxAlcatra.setBounds(6, 35, 88, 23);
		panel.add(chckbxAlcatra);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(252, 66, 100, 22);
		getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Retirada", "Tele Entrega", "No local"}));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(190, 219, 138));
		panel_1.setBounds(152, 198, 100, 63);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnBorda = new JRadioButton("Com borda");
		rdbtnBorda.setBounds(6, 7, 87, 23);
		panel_1.add(rdbtnBorda);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("Sem borda");
		rdbtnSemBorda.setBounds(6, 33, 87, 23);
		panel_1.add(rdbtnSemBorda);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(0, 255, 64));
		panel_2.setBackground(new Color(233, 179, 129));
		panel_2.setBounds(152, 66, 100, 113);
		getContentPane().add(panel_2);
		
		JCheckBox chckbxCatupiry = new JCheckBox("+ Catupiry");
		chckbxCatupiry.setBounds(6, 7, 88, 23);
		panel_2.add(chckbxCatupiry);
		
		JCheckBox chckbxQueijo = new JCheckBox("+ Milho");
		chckbxQueijo.setBounds(6, 33, 88, 23);
		panel_2.add(chckbxQueijo);
		
		JCheckBox chckbxCheddar = new JCheckBox("+ Cheddar");
		chckbxCheddar.setBounds(6, 59, 88, 23);
		panel_2.add(chckbxCheddar);
		
		JCheckBox chckbxErvilha = new JCheckBox("+ Ervilha");
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

	}
}
