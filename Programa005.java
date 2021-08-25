package cod3r;
//Tipos primitivos
public class Programa005 {
	public static void main(String[] args) {
		//Tipos numériocos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845233L;
		
		// Tipos numéricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//Tipo Caractere
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Salário
		System.out.println(id + ": ganha ->" + salario);
		
		//Está de férias?
		System.out.println("Férias?" + estaDeFerias);
		
		//Status
		System.out.println("Status: " + status);
	}
}
