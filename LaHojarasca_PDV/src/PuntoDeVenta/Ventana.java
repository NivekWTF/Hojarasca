package PuntoDeVenta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Ventana extends JFrame {
	JPanel panel = new JPanel();
	Ordenes orden;
	static int num=0;
	
	public Ventana() {
		Container contentPane = getContentPane();
		orden = new Ordenes();
		
		this.setSize(1920,1080);
		setTitle("Sistema de ventas");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(200,200));
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane.add(orden);
		contentPane.add(panel);
		orden.setBounds(46,172,563,725);
		
	}
	
	private void iniciarComponentes() {
		
		ColocarPaneles();
		ColocaBotones();
		ColocaLabels();
		//Usuarios();
		BotonesOrdenes();
		this.setBackground(Color.decode("#F0F0F0"));
		
	}
	
	private void ColocarPaneles() {
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		/*panelOrdenes = new JPanel();
		panelOrdenes.setLayout(null);
		panelOrdenes.setSize(10,10);
		panelOrdenes.setBorder(BorderFactory.createLineBorder(Color.black));
		//panelOrdenes.setBackground(Color.black);
		this.getContentPane().add(panelOrdenes);*/
	}
	
	private void ColocaBotones() {

		
		
		JButton btnlogo = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btnUsuarios = new JButton(new ImageIcon("src/img/user.png"));
		
		btnlogo.setBounds(27,25,131,134);//Boton Logo Hojarasca
		btn2.setBounds(208,103,176,31);//Boton Inventario
		btn3.setBounds(401,103,176,31);//Boton Ventas
		btn4.setBounds(591,103,176,31);//Boton Pedidos
		btn5.setBounds(782,103,176,31);//Boton Ajustes
		btn6.setBounds(975,103,176,31);//Boton Reportes
		btnUsuarios.setBounds(1758,101,31,34);//Boton Usuarios
		
		
		btn2.setText("Inventario");
		btn3.setText("Ventas");
		btn4.setText("Pedidos");
		btn5.setText("Ajustes");
		btn6.setText("Reportes");
		
		
		btn2.setFont(new Font ("Montserrat Bold",1,20));
		btn3.setFont(new Font ("Montserrat Bold",1,20));
		btn4.setFont(new Font ("Montserrat Bold",1,20));
		btn5.setFont(new Font ("Montserrat Bold",1,20));
		btn6.setFont(new Font ("Montserrat Bold",1,20));
		
		
		
		btnlogo.setBackground(Color.white);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn4.setBackground(Color.WHITE);
		btn5.setBackground(Color.WHITE);
		btnUsuarios.setBackground(Color.decode("#3A2012"));
		
		ImageIcon LogoHojarasca = new ImageIcon("src/img/logo.png");
		btnlogo.setIcon(new ImageIcon(LogoHojarasca.getImage().getScaledInstance(btnlogo.getWidth()-10,btnlogo.getHeight()-9,Image.SCALE_SMOOTH)));
		
		panel.add(btnlogo);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btnUsuarios);
		
		
	}
	
	private void ColocaLabels() {
		Label lb1 = new Label();
		lb1.setBounds(178,90,1699,57);
		lb1.setBackground(Color.decode("#3A2012"));
		
		Label usuario = new Label();
		usuario.setBounds(1664,102,82,34);
		usuario.setText("Admin");
		usuario.setFont(new Font ("Montserrat Bold",1,20));
		usuario.setForeground(Color.WHITE);
		usuario.setBackground(Color.decode("#3A2012"));
		
		JLabel labelTotal = new JLabel("TOTAL:");
		labelTotal.setBounds(83,900,122,47);
		labelTotal.setFont(new Font ("Open Sans Bold",1,25));
		
		JLabel Total = new JLabel("$1000");
		Total.setBounds(448,900,122,47);
		Total.setFont(new Font ("Open Sans Bold",1,25));
		//iconUsuario.setBounds(1758,101,31,34);
		//iconUsuario.setBackground(Color.decode("#3A2012"));
		panel.add(Total);
		panel.add(labelTotal);
		panel.add(usuario);
		panel.add(lb1);
	}
	
	private void BotonesOrdenes() {
		JButton btnHamburguesa = new JButton();
		JButton btnFrappe = new JButton();
		JButton btnNachos = new JButton();
		JButton btnEnsalada = new JButton();
		JButton btnOrdenes = new JButton();
		JButton btnTortas = new JButton();
		JButton btnBoneless = new JButton();
		JButton btnCuernito = new JButton();
		JButton btnSalchipapas = new JButton();
		JButton btnCombos = new JButton();
		JButton btnExtras = new JButton();
		////////////////////////////////////////////////
		JButton btnNuevaOrden = new JButton("NUEVA ORDEN");
		JButton btnBorrarArticulo = new JButton("BORRAR ARTICULO");
		JButton btnBorrarOrden = new JButton("BORRAR ORDEN");
		
		ActionListener click = new ActionListener() {
			
			String [] p1 = {"1", "Hamb. Clásica","$55.00"};
			String [] p2 = {"1", "Frappé Fresa","$45.00"};	
			String [] p3 = {"1", "Nachos","$35.00"};	
			String [] p4 = {"1", "Ensalada","$55.00"};	
			String [] p5 = {"1", "Orden de papas","$50.00"};
			String [] p6 = {"1", "Torta con papas","$50.00"};
			String [] p7 = {"1", "Orden de boneless","$50.00"};
			String [] p8 = {"1", "Cuernito con papas","$60.00"};
			String [] p9 = {"1", "Salchipapas","$50.00"};
			String [] p10 = {"1", "Combo tito","$100.00"};
			String [] p11 = {"1", "Aderezo EXTRA","$50.00"};
			
			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnHamburguesa) {
						orden.datos.addRow(p1);
					}
					
					if(e.getSource() == btnFrappe) {
						orden.datos.addRow(p2);
					}
					
					if(e.getSource() == btnNachos) {
						orden.datos.addRow(p3);
					}
					
					if(e.getSource() == btnEnsalada) {
						orden.datos.addRow(p4);
					}
					
					if(e.getSource() == btnOrdenes) {
						orden.datos.addRow(p5);
					}
					
					if(e.getSource() == btnTortas) {
						orden.datos.addRow(p6);
					}
					
					if(e.getSource() == btnBoneless) {
						orden.datos.addRow(p7);
					}
					
					if(e.getSource() == btnCuernito) {
						orden.datos.addRow(p8);
					}
					
					if(e.getSource() == btnSalchipapas) {
						orden.datos.addRow(p9);
					}
					
					if(e.getSource() == btnCombos) {
						orden.datos.addRow(p10);
					}
					
					if(e.getSource() == btnExtras) {
						orden.datos.addRow(p11);
					}
					
					if(e.getSource() == btnNuevaOrden) {
						num++;
						orden.setNumOrden(num);
						
					}
					if(e.getSource() == btnBorrarOrden) {
						double suma = 0;
						for(int i=0; i<orden.datos.getRowCount(); i++) {
							
						}
					}
					if(e.getSource() == btnBorrarArticulo) {
						 
					}
					
				}
			};
		btnHamburguesa.addActionListener(click);
		btnFrappe.addActionListener(click);
		btnNachos.addActionListener(click);
		btnEnsalada.addActionListener(click);
		btnOrdenes.addActionListener(click);
		btnTortas.addActionListener(click);
		btnBoneless.addActionListener(click);
		btnCuernito.addActionListener(click);
		btnSalchipapas.addActionListener(click);
		btnCombos.addActionListener(click);
		btnExtras.addActionListener(click);
		btnBorrarOrden.addActionListener(click);
		
		ImageIcon btn1 = new ImageIcon("src/img/burger.png");
		btnHamburguesa.setIcon(new ImageIcon(btn1.getImage().getScaledInstance(145,133,Image.SCALE_SMOOTH)));
		
		ImageIcon btn2 = new ImageIcon("src/img/frappe.png");
		btnFrappe.setIcon(new ImageIcon(btn2.getImage().getScaledInstance(102,177,Image.SCALE_SMOOTH)));
		
		ImageIcon btn3 = new ImageIcon("src/img/nachos.png");
		btnNachos.setIcon(new ImageIcon(btn3.getImage().getScaledInstance(207,207,Image.SCALE_SMOOTH)));
		
		ImageIcon btn4 = new ImageIcon("src/img/ensalada.png");
		btnEnsalada.setIcon(new ImageIcon(btn4.getImage().getScaledInstance(171,134,Image.SCALE_SMOOTH)));
		
		ImageIcon btn5 = new ImageIcon("src/img/ORDENES.png");
		btnOrdenes.setIcon(new ImageIcon(btn5.getImage().getScaledInstance(207,207,Image.SCALE_SMOOTH)));
		
		ImageIcon btn6 = new ImageIcon("src/img/torta.png");
		btnTortas.setIcon(new ImageIcon(btn6.getImage().getScaledInstance(207,207,Image.SCALE_SMOOTH)));
		
		ImageIcon btn7 = new ImageIcon("src/img/boneless.png");
		btnBoneless.setIcon(new ImageIcon(btn7.getImage().getScaledInstance(171,134,Image.SCALE_SMOOTH)));
		
		ImageIcon btn8 = new ImageIcon("src/img/cuerno.png");
		btnCuernito.setIcon(new ImageIcon(btn8.getImage().getScaledInstance(171,134,Image.SCALE_SMOOTH)));
		
		ImageIcon btn9 = new ImageIcon("src/img/salchipapas.png");
		btnSalchipapas.setIcon(new ImageIcon(btn9.getImage().getScaledInstance(207,207,Image.SCALE_SMOOTH)));
		
		btnCombos.setText("COMBOS");
		
		btnExtras.setText("EXTRAS");
		btnSalchipapas.setFont(new Font ("Montserrat Bold",1,25));
		btnCombos.setFont(new Font ("Montserrat Black",1,25));
		btnExtras.setFont(new Font ("Montserrat Black",1,25));
		
		btnHamburguesa.setBounds(657,186,207,207);
		btnFrappe.setBounds(892,186,207,207);
		btnNachos.setBounds(1121,186,207,207);
		btnEnsalada.setBounds(1347,186,207,207);
		btnOrdenes.setBounds(1582,186,207,207);
		btnTortas.setBounds(657,421,207,207);
		btnBoneless.setBounds(893,421,207,207);
		btnCuernito.setBounds(1120,421,207,207);
		btnSalchipapas.setBounds(1347,421,207,207);
		btnCombos.setBounds(1583,421,207,207);
		btnExtras.setBounds(657,654,207,207);
		
		
		btnNuevaOrden.setBounds(95,940,127,69);
		btnBorrarArticulo.setBounds(249,940,127,69);
		btnBorrarOrden.setForeground(Color.white);
		btnBorrarOrden.setBounds(435,940,127,69);
		btnBorrarOrden.setBackground(Color.decode("#A70028"));
		
		btnNuevaOrden.addActionListener(click);
		
		panel.add(btnNuevaOrden);
		panel.add(btnBorrarArticulo);
		panel.add(btnBorrarOrden);
		
		panel.add(btnHamburguesa);
		panel.add(btnFrappe);
		panel.add(btnNachos);
		panel.add(btnEnsalada);
		panel.add(btnOrdenes);
		panel.add(btnTortas);
		panel.add(btnBoneless);
		panel.add(btnCuernito);
		panel.add(btnSalchipapas);
		panel.add(btnCombos);
		panel.add(btnExtras);
		
		
	}
	
	
	/*public void Usuarios() {
		JTextField usuario = new JTextField();
		usuario.setBounds(1664,102,82,34);
		usuario.setText("Admin");
		usuario.setFont(new Font ("Montserrat Bold",1,20));
		panel.add(usuario);
	}*/
}
