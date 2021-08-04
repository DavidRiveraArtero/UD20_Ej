import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;
public class Ej1_AplicacionGrafica extends JFrame{
	
	private JPanel contentPane;
	public Ej1_AplicacionGrafica() {
		//CUANDO LE DEMOS A LA X SE CERRARA LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		//HACEMOS QUE LA VENTANA SEA VISIBLE
		setVisible(true);
		
		//CREAMOS EL PANEL
		contentPane = new JPanel();
		
		//INDICAMOS SU DISEÑO
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//AÑADIMOS TITULO A LA VENTANA
		setTitle("Saludador");
		
		//TAMAÑO DE LA VENTANA
		setBounds(400,400,450,400);
		
		//CREAMOS LOS CONTENIDOS
		JLabel texto=new JLabel("Escribe un nombre para saludar");
		JTextField nombre= new JTextField();
		JButton saludar = new JButton("SALUDAR");
		
		
		//COLOCAL EL COMPONENTE
		texto.setBounds(125,20,300,70);
		nombre.setBounds(75,100,300,20);
		saludar.setBounds(165,149,89,23);
		
		//AÑADIMOS EL LABEL AL PANEL
		contentPane.add(texto);
		contentPane.add(nombre);
		contentPane.add(saludar);
		
		//EVENTO BOTON
		saludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola "+ nombre.getText());
				
			}
		});
	} 
	

}
