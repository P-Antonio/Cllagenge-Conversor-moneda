package conver;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Temperatura extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JComboBox<Object> boxTemperatura = new JComboBox<Object>();
	JButton btnAceptar;
	int decisionConfirmDialog;
	
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Imput");
		setLocationRelativeTo(null);
		setResizable(false);
		
		setBounds(100, 100, 316, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(1, 0));
		
		JPanel Titulo = new JPanel();
		contentPane.add(Titulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Elija la temperatura que desea convertir");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.add(lblNewLabel);
		
		JPanel botones = new JPanel();
		contentPane.add(botones, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(this);
		botones.add(btnAceptar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		botones.add(btnCancelar);
		
		
		boxTemperatura.setModel(new DefaultComboBoxModel<Object>(new String[] {"Celsius a Kelvin", "Celsius a Fahrenheid", "kelvin a Celsius", "Fahrenheid a Celsius"}));
		contentPane.add(boxTemperatura, BorderLayout.CENTER);
	}
	
	double temperatura;
	public void setgradoUsuario(double cantidadTemperatura) {
		this.temperatura = cantidadTemperatura;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String Cambio = boxTemperatura.getSelectedItem().toString();
		if(Cambio == "Celsius a Kelvin") {
			double celsius = 1;
			double kelvin = 274.15;
			double grdoUsuario = temperatura;
			
			double resultado = grdoUsuario * kelvin /  celsius;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " grados kelvin");
				decisionConfirmDialog =JOptionPane.showConfirmDialog(null,"¿desea continuar con el programa");
				if(decisionConfirmDialog == 0) {
					Menu menu = new Menu();
					menu.setVisible(true);
					this.dispose();
				}
				if(decisionConfirmDialog == 1) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				if(decisionConfirmDialog == 2) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
			}
		}
		
		if(Cambio == "Celsius a Fahrenheid") {
			double celsius = 1;
			double farenheit = 33.8;
			double grdoUsuario = temperatura;
			
			double resultado = grdoUsuario * farenheit /  celsius;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " grados Fhareneit");
				decisionConfirmDialog =JOptionPane.showConfirmDialog(null,"¿desea continuar con el programa");
				if(decisionConfirmDialog == 0) {
					Menu menu = new Menu();
					menu.setVisible(true);
					this.dispose();
				}
				if(decisionConfirmDialog == 1) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				if(decisionConfirmDialog == 2) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
			}
		}
		
		if(Cambio == "kelvin a Celsius") {
			double celsius = 1;
			double kelvin = 33.8;
			double grdoUsuario = temperatura;
			
			double resultado = grdoUsuario * celsius /  kelvin;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " grados Celsius");
				decisionConfirmDialog =JOptionPane.showConfirmDialog(null,"¿desea continuar con el programa");
				if(decisionConfirmDialog == 0) {
					Menu menu = new Menu();
					menu.setVisible(true);
					this.dispose();
				}
				if(decisionConfirmDialog == 1) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				if(decisionConfirmDialog == 2) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
			}
		}
		
		if(Cambio == "Fahrenheid a Celsius") {
			double celsius = 1;
			double farenheit = 33.8;
			double grdoUsuario = temperatura;
			
			double resultado = grdoUsuario * celsius /  farenheit;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " grados Celsius");
				decisionConfirmDialog =JOptionPane.showConfirmDialog(null,"¿desea continuar con el programa");
				if(decisionConfirmDialog == 0) {
					Menu menu = new Menu();
					menu.setVisible(true);
					this.dispose();
				}
				if(decisionConfirmDialog == 1) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				if(decisionConfirmDialog == 2) {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
			}
		}
			
	}

}
