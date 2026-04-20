package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			contentPane.setLayout(null);
		
					
		//Hay que hacerlo desde el design
			JLabel Titulo = new JLabel("Titular");
			Titulo.setBounds(194, 36, 33, 15);
			Titulo.setForeground(new Color(255, 0, 0));
			Titulo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			contentPane.add(Titulo);
			
			
			JTextField txtS = new JTextField();
			txtS.setBounds(177, 70, 86, 20);
			txtS.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(txtS);
			txtS.setColumns(10);
			
			JButton btnNewButton = new JButton("Hola");
			btnNewButton.setBackground(SystemColor.activeCaption);
			btnNewButton.setBounds(192, 101, 61, 29);
			btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Titulo.setText(textField.getText());
			}
			});
			contentPane.add(btnNewButton);
			
			

	}

}
