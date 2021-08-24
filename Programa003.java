package cod3r;

public class Programa003 {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double farenheit;
		farenheit = 86;
		double celsius = (farenheit - AJUSTE) * FATOR;
		
		System.out.println("O reslutado é " + celsius + "C.");
		
		
		
	}
}
