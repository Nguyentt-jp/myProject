package OOPs;

public class ExPraction {
	private int denimitor;//mau so
	private int numerator;//tu so
	public int getDenimitor() {
		return denimitor;
	}
	public ExPraction() {
		super();
	}
	public ExPraction(int denimitor, int numerator) {
		super();
		this.denimitor = denimitor;
		this.numerator = numerator;
	}
	public void setDenimitor(int denimitor) {
		this.denimitor = denimitor;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public String toString() {
		return "Mau so: " + this.denimitor + "Tu so: " + this.numerator;
	}
	
	

}
