package frame;

import Matematica.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EuclideFrame extends JFrame {
	
	// variabili di istanza
	private int a,b;
	private ImageIcon icona1 = new ImageIcon("gomma.jpg");
	private ImageIcon icona2 = new ImageIcon("euclidepapiro.jpg");
	private JButton b1 = new JButton("MCD");
	private JButton bReset = new JButton(icona1);
	private JButton bImmagine = new JButton(icona2);
	private JTextField tA = new JTextField(5);
	private JTextField tB = new JTextField(5);
	private JTextField tR = new JTextField(30);
	private JLabel lA = new JLabel("Inserisci a: ",JLabel.RIGHT);
	private JLabel lB = new JLabel("Inserisci b: ",JLabel.RIGHT);
	private JPanel input = new JPanel();
	private JPanel output = new JPanel();
	private JPanel pulsanti = new JPanel();
	
	/**
	 * Costruttore dell'interfaccia grafica
	 */
	public EuclideFrame(String titolo) {
		
		
		
		pack();
	}
	
}
