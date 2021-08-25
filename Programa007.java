package cod3r;
//tipo String
public class Programa007 {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		//String é imutável, não modificamos o valor inicial, mas substituimos
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		
		var nome = "Pedro";
		var sobrenome = "Martins";
		var idade = 23;
		var salario = 12345.98;
		
		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + " \nIdade : " + idade + " \nSalário: " + salario);
		
		System.out.printf("%s %s tem %d, anos e ganha %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n%s %s tem %d, anos e ganha %.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
