package Matematica;

public class MCDEuclide extends EuclideAlgoritmo {
	
	/**
	 * Costruttore della classe, che eredita da EuclideAlgoritmo
	 * @param a
	 * @param b
	 */
	public MCDEuclide(int a,int b) {
		super(a,b);
	}
	
	/**
	 * Algoritmo del massimo comune divisore
	 * @return un numero intero
	 */
	public int mcdEuclide() {
		
		int x = getA();
		int y = getB();
		
		if(x != 0 || y != 0) {
			if (y == 0) {
				int temp;
				temp = x;
				x = y;
				y = temp;
			}
		
		
		int r = x % y;
		
		while( r != 0 ) {
			x = y;
			y = r;
			r = x % y;
		}
		
		return Math.abs(y);
		
		}else {
			return 0;
		}
	}
	
	//verifica
	public static void main(String[]args) {
		int a = 10;
		int b = 2500;
		MCDEuclide test = new MCDEuclide(a,b);
		System.out.println("Il massimo comune divisore tra A e B è = "+test.mcdEuclide());
	}
}
