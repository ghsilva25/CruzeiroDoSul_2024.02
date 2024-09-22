import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número
        System.out.print("Digite um número para exibir a tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada do número fornecido
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fechar o scanner
        scanner.close();
    }
}