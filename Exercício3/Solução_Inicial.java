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
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= N; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        // Checa se N faz parte da sequência de Fibonacci
        boolean isFibonacci = false;
        a = 1;
        b = 1;
        int current = a + b;

        if (N == 1) {
            isFibonacci = true;
        } else {
            while (current <= N) {
                if (current == N) {
                    isFibonacci = true;
                    break;
                }
                a = b;
                b = current;
                current = a + b;
            }
        }

        System.out.println("\nO número " + N + (isFibonacci ? " faz" : " não faz") + " parte da sequência de Fibonacci.");

        scanner.close();
    }
}