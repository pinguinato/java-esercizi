package app;

import java.awt.*;
import frame.*;


/**
 * Classe che esegue l'implementazione dell'algoritmo di Euclide 
 * @version 1.0
 * @author roberto - gianottoroberto@gmail.com 2016
 *
 */

public class Main {
	/**
	 * Metodo main() - crea una finestra Euclide Frame per eseguire l'algoritmo di Euclide
	 * @param args
	 */
	public static void main(String[]args) {
		EuclideFrame finestra = new EuclideFrame("Massimo Coumune Divisore");
		Toolkit kit = finestra.getToolkit();
		Dimension dim = kit.getScreenSize();
		finestra.setBounds(dim.width/4,dim.height/4,dim.width/2,dim.height/2);
		finestra.setVisible(true);
	}
	
	
}
