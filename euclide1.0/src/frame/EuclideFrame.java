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
	//private ImageIcon icona2 = new ImageIcon("euclidepapiro.jpg");
	private JButton b1 = new JButton("MCD");
	private JButton bReset = new JButton(icona1);
	private JButton bImmagine = new JButton(icona1);
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
		
		// titolo
		setTitle(titolo);
		// chiusura
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// contenitore
		Container cp = getContentPane();
		b1.setPreferredSize(new Dimension(200,100));
		bReset.setPreferredSize(new Dimension(200,100));
		// layout della finestra
		input.setLayout(new FlowLayout());
		// aggiungo gli oggetti nella finestra
		input.add(lA);
		input.add(tA);
		input.add(lB);
		input.add(tB);
		
		output.setLayout(new FlowLayout());
		output.add(tR);
		tR.setEditable(false);
		
		pulsanti.setLayout(new BorderLayout());
		pulsanti.add(b1,BorderLayout.WEST);
		pulsanti.add(bReset,BorderLayout.EAST);
		pulsanti.add(bImmagine,BorderLayout.CENTER);
		
		input.setBackground(Color.green);
		output.setBackground(Color.blue);
		
		cp.setLayout(new BorderLayout());
		cp.add(input,BorderLayout.NORTH);
		cp.add(output,BorderLayout.SOUTH);
		cp.add(pulsanti,BorderLayout.CENTER);
		
		tA.getDocument().addDocumentListener(new LeggiA());
		tB.getDocument().addDocumentListener(new LeggiB());
		b1.addActionListener(new CalcolaMCD());
		//bReset.addActionListener(new Reset());
	
		pack();
	}
	
	class LeggiA implements DocumentListener {
		public void insertUpdate(DocumentEvent e) {
			a = Integer.parseInt(tA.getText());
		}
		public void removeUpdate(DocumentEvent e) {}
		public void changedUpdate(DocumentEvent e) {}
	}
	class LeggiB implements DocumentListener {
		public void insertUpdate(DocumentEvent e) {
			b = Integer.parseInt(tB.getText());
		}
		public void removeUpdate(DocumentEvent e) {}
		public void changedUpdate(DocumentEvent e) {}
	}
	class CalcolaMCD implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			MCDEuclide mcd = new MCDEuclide(a,b);
			int risultato = mcd.mcdEuclide();
			if(risultato!=0) {
				tR.setText("Massimo comun divisore = "+risultato);
			}else {
				tR.setText("Errore: entrambi i numeri sono uguali a zero!");
			}
		}
	}
	// metodo che resetta i risultati
	class Reset implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tA.setText(null);
			tB.setText(null);
			tR.setText(null);
			a=b=0;
		}
	}
}
