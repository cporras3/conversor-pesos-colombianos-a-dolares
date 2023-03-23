
	
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

	public class CPrincipal extends JFrame {
		
		private JTextField cantidad;
		private JButton boton1, boton2;
		
		public CPrincipal() {
			super("conversor pesos a dolares");
			boton1 = new JButton("A Dolares");
			boton2 = new JButton("A Pesos");
			cantidad = new JTextField(10);
			add(cantidad);
			add(boton1);
			add(boton2);
			
			setLayout(new FlowLayout());
			boton1.addActionListener(new OyenteBoton());
			boton2.addActionListener(new OyenteBoton());
			
			setSize(300,250);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			
		}
		
		public static void main(String[] args) {
			CPrincipal ventana = new CPrincipal();
		}
		
		class OyenteBoton implements ActionListener{
			public void actionPerformed(ActionEvent ae) {
				Float f = new Float(cantidad.getText());
				float valor = f.floatValue();
				String s = (String)ae.getActionCommand();
				if(s.equals("A Pesos")) {
					valor = (float) (valor / 0.00021);
				}
				
				else if(s.equals("A Dolares")) {
					valor = (float) (valor * 0.00021);
				}
				cantidad.setText(Float.toString(valor));
			}
		}
		
	}



