import java.util.Scanner;

public class SequenciaMaiorMenor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Solicita a quantidade de números ao usuário
		System.out.println("Digite a quantidade de números da sequência:");
		int quantidade = scanner.nextInt();
		
		// Cria um array para armazenar a sequência de números
		int[] sequencia = new int[quantidade];
		
		// Solicita que o usuário insira cada número
		System.out.println("Digite a sequência de números:");
		for(int i = 0; i < quantidade; i++) {
			
			sequencia[i] = scanner.nextInt();
			
		}
		
		// Exibe a sequência de números digitada
        System.out.print("Sequência digitada: ");
        for (int numero : sequencia) {
            System.out.print(numero + " ");
        }
		
        // Calcula o menor e o maior número da sequência
        int menor = sequencia[0];
        int maior = sequencia[0];
        int segundoMaior = sequencia[0];

        for (int i = 1; i < quantidade; i++) {
            if (sequencia[i] < menor) {
                menor = sequencia[i];
            }
            if (sequencia[i] > maior) {
            	segundoMaior = maior;
                maior = sequencia[i];
            } else {
            	if (sequencia[i] > segundoMaior) {
                	segundoMaior = sequencia[i];
                }
            	
            }
        }

        // Exibe o menor e o maior número da sequência
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Segundo maior número: " + segundoMaior);

        scanner.close();
	}
}
