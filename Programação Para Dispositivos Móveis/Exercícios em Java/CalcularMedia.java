import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / 10;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
