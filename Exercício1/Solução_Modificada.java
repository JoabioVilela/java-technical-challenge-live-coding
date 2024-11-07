import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário hora:");
				
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
				
		System.out.println("Digite a quantidade de filhos menores de 14 anos de idade:");
		
		float salarioBruto = scanner.nextFloat() * scanner.nextFloat();
		double salarioFamilia = 0;
		double salarioLiquido;
		
		if (!scanner.hasNextInt()) {
			System.out.println("Quantidade de filhos não pode ser tipo diferente de inteiro.");
			scanner.close();
			return ;
		}
				
		int quantidadeFilhosMenoresCatorze = scanner.nextInt();
		
		if (salarioBruto < 788) {
			salarioFamilia = 30.50 * quantidadeFilhosMenoresCatorze;
		}
		
		if (salarioBruto > 788 && salarioBruto < 1100) {
			salarioFamilia = 18 * quantidadeFilhosMenoresCatorze;
		}
		
		if (salarioBruto > 1100) {
			salarioFamilia = 11.90 * quantidadeFilhosMenoresCatorze;
		}
		
		salarioLiquido = salarioBruto + salarioFamilia;
				
		scanner.close();
		
		System.out.println("Salário bruto: R$" + salarioBruto);
		System.out.println("Salário família: R$" + salarioFamilia);
		System.out.println("Salário líquido: R$" + salarioLiquido);
		

	}

}
