package conver;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnAceptar;
	Monedas monedas = new Monedas();
	JComboBox<Object> TipoConversor = new JComboBox<Object>();
	int CantidadDinero;
	int cantidadTempertura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Menu Principal");
		setLocationRelativeTo(null);
		setResizable(false);
		
		setBounds(100, 100, 316, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JLabel lblTitulo1 = new JLabel("Seleccione una obcion de conversion.");
		lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo1, BorderLayout.NORTH);
		
		
		TipoConversor.setEditable(false);
		TipoConversor.setModel(new DefaultComboBoxModel<Object>(new String[] {"Coversor de moneda", "Conversor de temperatura"}));
		contentPane.add(TipoConversor, BorderLayout.CENTER);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar, BorderLayout.SOUTH);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String seleccionMenu = TipoConversor.getSelectedItem().toString();
		System.out.println(seleccionMenu);
		if (seleccionMenu == "Coversor de moneda" ) {
			if(btnAceptar == e.getSource()) {
				CantidadDinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir"));
				System.out.println(CantidadDinero);
				Monedas monedas = new Monedas();
				monedas.setdinero(CantidadDinero);
				monedas.setVisible(true);
				this.dispose();
				
			}
		}
		
		if (seleccionMenu == "Conversor de temperatura") {
			if(btnAceptar == e.getSource()) {
				cantidadTempertura = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la temperatura que desea convertir"));
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
				temperatura.setgradoUsuario(cantidadTempertura);
				this.dispose();
			}
		}
	}
}
