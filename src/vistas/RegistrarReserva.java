package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.JComboBox;

public class RegistrarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaReserva;
	private JTextField txtFechaServicio;
	private JTextField txtTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarReserva frame = new RegistrarReserva();
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
	public RegistrarReserva() {
		setTitle("Registro Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCliente.setBounds(31, 50, 55, 31);
		contentPane.add(lblCliente);
		
		JButton btnNewButton = new JButton("Agregar Detalle");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(31, 318, 134, 25);
		contentPane.add(btnNewButton);
		
		JComboBox cmbCliente = new JComboBox();
		cmbCliente.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cmbCliente.setEditable(true);
		cmbCliente.setBounds(115, 54, 284, 22);
		contentPane.add(cmbCliente);
		
		JLabel lblFechaReserva = new JLabel("Fecha Reserva");
		lblFechaReserva.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblFechaReserva.setBounds(31, 124, 108, 16);
		contentPane.add(lblFechaReserva);
		
		txtFechaReserva = new JTextField();
		txtFechaReserva.setBounds(148, 122, 155, 22);
		contentPane.add(txtFechaReserva);
		txtFechaReserva.setColumns(10);
		
		JLabel lblFechaServicio = new JLabel("Fecha Servicio");
		lblFechaServicio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblFechaServicio.setBounds(31, 180, 108, 16);
		contentPane.add(lblFechaServicio);
		
		txtFechaServicio = new JTextField();
		txtFechaServicio.setBounds(148, 178, 155, 22);
		contentPane.add(txtFechaServicio);
		txtFechaServicio.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblTipo.setBounds(31, 227, 36, 31);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setText("'R'eserva o 'S'ervicio");
		txtTipo.setBounds(148, 232, 155, 22);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		JButton btnRegistrarReserva = new JButton("Registrar Reserva");
		btnRegistrarReserva.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnRegistrarReserva.setBounds(286, 318, 139, 25);
		contentPane.add(btnRegistrarReserva);
	}
}
