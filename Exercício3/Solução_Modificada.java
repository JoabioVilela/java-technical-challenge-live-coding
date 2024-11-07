import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira o valor de N
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        // Validação de entrada para N ser maior que 0
        if (N <= 0) {
            System.out.println("O valor de N deve ser maior que 0.");
            scanner.close();
            return;
        }

        // Exibe os N primeiros números da sequência de Fibonacci
        System.out.println("Os primeiros " + N + " números da sequência de Fibonacci:");
        int a = 1, b = 1, c = 1;
        System.out.print(a + " " + b + " ");
        int next = 0;
        
        for (int i = 3; i <= N; i++) {
            if (i >= 4 && b % 2 == 0) {
                // Caso o elemento anterior seja par, soma três elementos anteriores
                next = a + b + c;
                System.out.print(next + " ");
                c = a;
                a = b;
                b = next;
            } else {
                // Soma apenas os dois elementos anteriores
                next = a + b;
                System.out.print(next + " ");
                c = a;
                a = b;
                b = next;
            }
        }

        // Checa se N faz parte da sequência de Fibonacci alterada
        boolean isFibonacci = false;
        a = 1;
        b = 1;
        c = 1;
        int current = a + b;
        System.out.println("\n\nVerificando se " + N + " faz parte da sequência de Fibonacci alterada:");

        // Iniciando os primeiros números da sequência
        System.out.print(a + " " + b + " ");
        
        if (N == 1) {
            isFibonacci = true;
        } else {
            while (current <= N) {
                System.out.print(current + " ");
                
                if (current == N) {
                    isFibonacci = true;
                    break;
                }
                
                if (b % 2 == 0) {
                    current = a + b + c;
                } else {
                    current = a + b;
                }
                
                c = a;
                a = b;
                b = current;
            }
        }
        
        System.out.println("\nFibonacci: " + isFibonacci);
        System.out.println("\nO número " + N + (isFibonacci ? " faz" : " não faz") + " parte da sequência de Fibonacci.");

        scanner.close();
    }
}
