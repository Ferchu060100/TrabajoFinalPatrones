package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class DetalleReserva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleReserva frame = new DetalleReserva();
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
	public DetalleReserva() {
		setTitle("DetalleReserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 428);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(2147483647, 2147483647));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEspecialidadServicio = new JLabel("Especialidad Servicio");
		lblEspecialidadServicio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEspecialidadServicio.setBounds(50, 83, 153, 25);
		contentPane.add(lblEspecialidadServicio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(233, 85, 143, 22);
		contentPane.add(comboBox);
		
		JLabel lblEspecialidad = new JLabel("Especialidad Estilista");
		lblEspecialidad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEspecialidad.setBounds(50, 187, 153, 16);
		contentPane.add(lblEspecialidad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(233, 185, 143, 22);
		contentPane.add(comboBox_1);
		
		JButton btnGuardarDetalle = new JButton("Guardar Detalle");
		btnGuardarDetalle.setBounds(259, 343, 126, 25);
		contentPane.add(btnGuardarDetalle);
	}

}
