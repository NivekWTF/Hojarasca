package PuntoDeVenta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Ordenes extends JPanel {
	Border border = BorderFactory.createLineBorder(Color.decode("#707070"), 1);
	public DefaultTableModel datos = new DefaultTableModel();
	
	public int numOrden=001;
	JTextField numPedido = new JTextField();
	
	public int getNumOrden() {
		return numOrden;
	}



	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}



	public JTextField getNumPedido() {
		return numPedido;
	}



	public void setNumPedido(JTextField numPedido) {
		this.numPedido = numPedido;
	}



	public Ordenes() {
		JLabel label = new JLabel("NO. DE PEDIDO",SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBounds(112,10,338,131);
		label.setBackground(Color.decode("#EEBF24"));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setFont(new Font("Open Sans Bold",1,27));
		
		
		numPedido.setBounds(140,47,282,66);
		numPedido.setBackground(Color.white);
		numPedido.setEnabled(false);
		numPedido.setAlignmentY(CENTER_ALIGNMENT);
		numPedido.setAlignmentX(CENTER_ALIGNMENT);
		numPedido.setFont(new Font("Montserrat",1,54));
		numPedido.setText(Integer.toString(numOrden));
		
		
		JLabel columnas = new JLabel("Cant        Producto          Total    ",SwingConstants.CENTER);
		columnas.setOpaque(true);
		columnas.setBounds(33,185,500,25);
		columnas.setFont(new Font("Open Sans Semibold Italic",1,27));
		columnas.setBorder(border);
		
		
		datos.addColumn("Cantidad");
		datos.addColumn("Producto");
		datos.addColumn("Total");
		
		
		
		JTable tabla = new JTable(datos);
		tabla.setBorder(border);
		tabla.setBounds(33,210,500,500);
		tabla.setFont(new Font ("Open Sans",1,20));
		
		this.add(columnas);
		this.add(numPedido);
		this.add(tabla);
		this.setBorder(border);
		this.setLayout(null);
		this.add(label);
	
		
	}
	
	
	
	public static void TablasOrdenes() {
		
		
	}

	
	
	
	
}
