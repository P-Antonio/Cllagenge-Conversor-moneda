package conver;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Monedas extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnAceptar;
	JComboBox<Object> CambioMoneda = new JComboBox<Object>();
	int decisionConfirmDialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas();
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
	public Monedas() {
		setTitle("Monedas");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel botones = new JPanel();
		contentPane.add(botones, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(this);
		botones.add(btnAceptar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		botones.add(btnCancelar);
		
		
		CambioMoneda.setModel(new DefaultComboBoxModel<Object>(new String[] {"De pesos a Dolar", "De pesos a Euros", "De pesos a Libras Esterlinas", "De pesos a Yen Japones", "De pesos a Won Soul-Coreano", "Convertir de Dolar a pesos", "Convertir de Euros a pesos", "Convertir de Libras Esterlinas a pesos", "Convertir de Yen Japones a pesos", "Convertir de Won Soul-Coreano a pesos"}));
		contentPane.add(CambioMoneda, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Elija la moneda que desea convertir su dinero");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}
	
	int dinero;
	public void setdinero(int cantidadDinero) {
		this.dinero = cantidadDinero;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String Cambio = CambioMoneda.getSelectedItem().toString();
		if(Cambio == "De pesos a Dolar") {
			double pesos = 1;
			int usuario = dinero;
			double dolares = 0.00021;
			
			double resultado = usuario * dolares / pesos;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " dolares");
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
		
		if(Cambio == "De pesos a Euros") {
			
			double pesos = 1;
			int usuario = dinero;
			double euro = 0.00019;
			
			double resultado = usuario * euro / pesos;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " Euros");
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
		
		if(Cambio == "De pesos a Libras Esterlinas") {
			
			double pesos = 1;
			int usuario = dinero;
			double librasEsterlinas = 0.00017;
			
			double resultado = usuario * librasEsterlinas / pesos;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " Libras Esterlinas");
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
		
		if(Cambio == "De pesos a Yen Japones") {
			
			double pesos = 1;
			int usuario = dinero;
			double yenJapones = 0.027;
			
			double resultado = usuario * yenJapones / pesos;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " Yen Japones");
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
		
		if(Cambio == "De pesos a Won Soul-Coreano") {
			
			double pesos = 1;
			int usuario = dinero;
			double won = 0.27;
			
			double resultado = usuario * won / pesos;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " Won Coreano");
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
		
		if(Cambio == "Convertir de Dolar a pesos") {
			
			double pesos = 1;
			int usuario = dinero;
			double dolares = 0.00021;
			
			double resultado = usuario * pesos / dolares;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " pesos");
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

		if(Cambio == "Convertir de Euros a pesos") {
			
			double pesos = 1;
			int usuario = dinero;
			double euros = 0.00019;
			
			double resultado = usuario * pesos / euros;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " pesos");
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

		if(Cambio == "Convertir de Libras Esterlinas a pesos") {
			
			double pesos = 1;
			int usuario = dinero;
			double librasEsterlinas = 0.00017;
			
			double resultado = usuario * pesos / librasEsterlinas;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " pesos");
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

		if(Cambio == "Convertir de Yen Japones a pesos") {
			
			double pesos = 1;
			int usuario = dinero;
			double yenJapones = 0.027;
			
			double resultado = usuario * pesos / yenJapones;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " pesos");
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
		

		if(Cambio == "Convertir de Won Soul-Coreano a pesos") {
			
			double pesos = 1;
			int usuario = dinero;
			double won = 0.27;
			
			double resultado = usuario * pesos / won;
			
			if(btnAceptar == e.getSource()) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "tienes: " + resultado + " pesos");
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
