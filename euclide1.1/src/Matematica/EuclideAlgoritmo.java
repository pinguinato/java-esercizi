package Matematica;

abstract class EuclideAlgoritmo {
	
	// varibili di istanza
	private int a;
	private int b;
	
	/**
	 * Costruttore
	 * @param a
	 * @param b
	 */
	public EuclideAlgoritmo(int a,int b) {
		this.a = a;
		this.b = b;
	}
	/**
	 * Metodo che ritorna il valore di a
	 * @return il valore di a
	 */
	public int getA() {
		return a;
	}
	/**
	 * Metodoi che ritorna il valore di b
	 * @return il valore di b
	 */
	public int getB() {
		return b;
	}
	/**
	 * Setta un valore a ad a
	 * @param a il valore da settare
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * Setta un valore b a b
	 * @param b il valore da settare
	 */
	public void setB(int b) {
		this.b = b;
	}	
}
