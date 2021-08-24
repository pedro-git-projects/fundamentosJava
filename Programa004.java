package cod3r;

//demonstra inferência de tipos
public class Programa004 {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		//vriáveis inferidas devem ser inicializadas em sua declaração
		
		var c = "texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
	}
}
