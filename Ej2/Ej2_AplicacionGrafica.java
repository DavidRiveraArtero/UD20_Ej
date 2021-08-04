package Ej2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ej2_AplicacionGrafica extends JFrame{
	
	private JPanel contentPane;
	Ej2_AplicacionGrafica(){
		//CUANDO LE DEMOS A LA X SE CERRARA EL PROGRAMA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//HACEMOS LA VENTANA VISIBLE
		setVisible(true);
		
		//CREAMOS EL PANEL;
		contentPane= new JPanel();
		
		//INDICAMOS SU DISE�O
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//A�ADIMOS TITULO A LA VENTANA
		setTitle("Peliculas");
		
		//TAMA�O DE LA VENTANA
		setBounds(400,400,450,400);
		
		//CREAMOS LOS CONTENIDOS
		JLabel texto1 = new JLabel("Escribe el titulo de una pelicula");
		JTextField nombrePelicula= new JTextField();
		JLabel texto2 = new JLabel("Peliculas");
		JComboBox peliculas = new JComboBox<>();
		JButton a�adir = new JButton("A�adir");
		
		//COLOCAR EL CONTENIDO
		texto1.setBounds(20,20,300,70);
		nombrePelicula.setBounds(35,80,150,20);
		texto2.setBounds(320,20,300,70);
		peliculas.setBounds(280,80,150,20);
		a�adir.setBounds(58,120,89,20);
		
		//A�ADIR CONTENIDO
		contentPane.add(texto1);
		contentPane.add(nombrePelicula);
		contentPane.add(texto2);
		contentPane.add(peliculas);
		contentPane.add(a�adir);
		
		//EVENTO BOTON
		a�adir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculas.addItem(nombrePelicula.getText());
				
			}
		});
	}
}
