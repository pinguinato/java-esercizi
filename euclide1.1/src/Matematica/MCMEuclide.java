package Matematica;

public class MCMEuclide extends EuclideAlgoritmo {
	/**
	 * Costruttore della classe
	 */
	public MCMEuclide(int a,int b) {
		super(a,b);
	}
	/**
	 * Algoritmo del minimo comune multiplo
	 */
	public int mcmEuclide() {
		int x = getA();
		int y = getB();
		
		if(x==0 || y==0) return 0;
		else {
			x = Math.abs(x);
			y = Math.abs(y);
			int multX = x;
			int multY = y;
			while(multX != multY) {
				while(multX < multY) multX += x;
				while(multY < multX) multY += y;
			}
			return multX;
		}
	}
	/**
	 * Test della classe
	 */
	public static void main(String[]args) {
		MCMEuclide test = new MCMEuclide(20456,1234);
		System.out.println("Il minimo comune multiplo di A e B è = "+test.mcmEuclide());
	}
}
