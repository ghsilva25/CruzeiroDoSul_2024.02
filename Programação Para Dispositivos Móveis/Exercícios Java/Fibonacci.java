import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja exibir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
            exibirFibonacci(n);
        }

        scanner.close();
    }

    public static void exibirFibonacci(int n) {
        int primeiro = 0, segundo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println(); // Para nova linha após a sequência
    }
}
