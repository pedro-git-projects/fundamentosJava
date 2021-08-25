package cod3r;
//notação ponto
public class Programa006 {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; //Necessário lembrar que String não é primitivo
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		//métodos são acessados através da notação ponto
		System.out.println(s);
		
		System.out.println("Pedro".toUpperCase());
		
		String x = "Pedro".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Tati")
				.toUpperCase()
				.concat("!!!");
				
		
		System.out.println(y);
		
		// O operador "." não está definido para tipos primitivos
		int a = 3;
		System.out.println(a);
	}
}
