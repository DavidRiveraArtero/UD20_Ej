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
		
		//INDICAMOS SU DISEÑO
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//AÑADIMOS TITULO A LA VENTANA
		setTitle("Peliculas");
		
		//TAMAÑO DE LA VENTANA
		setBounds(400,400,450,400);
		
		//CREAMOS LOS CONTENIDOS
		JLabel texto1 = new JLabel("Escribe el titulo de una pelicula");
		JTextField nombrePelicula= new JTextField();
		JLabel texto2 = new JLabel("Peliculas");
		JComboBox peliculas = new JComboBox<>();
		JButton añadir = new JButton("Añadir");
		
		//COLOCAR EL CONTENIDO
		texto1.setBounds(20,20,300,70);
		nombrePelicula.setBounds(35,80,150,20);
		texto2.setBounds(320,20,300,70);
		peliculas.setBounds(280,80,150,20);
		añadir.setBounds(58,120,89,20);
		
		//AÑADIR CONTENIDO
		contentPane.add(texto1);
		contentPane.add(nombrePelicula);
		contentPane.add(texto2);
		contentPane.add(peliculas);
		contentPane.add(añadir);
		
		//EVENTO BOTON
		añadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculas.addItem(nombrePelicula.getText());
				
			}
		});
	}
}
