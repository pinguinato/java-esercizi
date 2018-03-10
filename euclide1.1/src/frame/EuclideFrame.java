package frame;

import Matematica.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EuclideFrame extends JFrame {
	
	// variabili di istanza
	private int a,b;
	
	private String num1Str,num2Str;
	private String regexSoloInteri = "-?\\d+";
	private boolean range = true;
	
	private ImageIcon icona1 = new ImageIcon("gomma.jpg");
	
	//private ImageIcon icona2 = new ImageIcon("euclidepapiro.jpg");
	private JButton b1 = new JButton("MCD"); // bottone massimo comune div.
	private JButton b2 = new JButton("MCM"); // bottne monimo comune mult.
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
	
	private Font font1 = new Font("Verdana",Font.BOLD,18);
	private Font font2 = new Font("Arial",Font.ITALIC,20);
	private Color verdePetrolio = new Color(51,119,119);
	
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
		b2.setPreferredSize(new Dimension(200,100));
		
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
		output.add(bReset);
		tR.setEditable(false);
		
		pulsanti.setLayout(new BorderLayout());
		pulsanti.add(b1,BorderLayout.WEST);
		pulsanti.add(b2,BorderLayout.EAST);
		//pulsanti.add(bReset,BorderLayout.EAST);
		pulsanti.add(bImmagine,BorderLayout.CENTER);
		
		input.setBackground(Color.black);
		output.setBackground(Color.black);
		b2.setBackground(verdePetrolio);
		b2.setForeground(Color.white);
		b1.setBackground(verdePetrolio);
		b1.setForeground(Color.white);
		tR.setFont(font1);
		lA.setFont(font2);
		lB.setFont(font2);
		tA.setFont(font1);
		tB.setFont(font1);
		lA.setForeground(Color.white);
		lB.setForeground(Color.white);
		
		cp.setLayout(new BorderLayout());
		cp.add(input,BorderLayout.NORTH);
		cp.add(output,BorderLayout.SOUTH);
		cp.add(pulsanti,BorderLayout.CENTER);
		
		tA.getDocument().addDocumentListener(new LeggiA());
		tB.getDocument().addDocumentListener(new LeggiB());
		b1.addActionListener(new CalcolaMCD());
		b2.addActionListener(new CalcolaMCM());
		//bReset.addActionListener(new Reset());
	
		pack();
	}
	
	class LeggiA implements DocumentListener {
		public void insertUpdate(DocumentEvent e) {
			//a = Integer.parseInt(tA.getText());
			num1Str = tA.getText();
		}
		public void removeUpdate(DocumentEvent e) {}
		public void changedUpdate(DocumentEvent e) {}
	}
	class LeggiB implements DocumentListener {
		public void insertUpdate(DocumentEvent e) {
			//b = Integer.parseInt(tB.getText());
			num2Str = tB.getText();
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
	class CalcolaMCM implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			MCMEuclide mcm = new MCMEuclide(a,b);
			int risultato = mcm.mcmEuclide();
			if(risultato!=0) {
				tR.setText("Minimo comune multiplo = "+risultato);
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
			num1Str = num2Str = null;
			a=b=0;
		}
	}
	
	//solo interi nel range
	private boolean soloINteriNelRange() {
		boolean formatoERangeOK = false;
		
		range = true;
		
	}
}
