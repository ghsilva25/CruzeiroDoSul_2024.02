import java.util.Scanner; // Importa a classe Scanner

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada

        System.out.print("Digite um número inteiro: "); // Pede ao usuário um número
        int numero = scanner.nextInt(); // Lê o número digitado

        // Verifica se o número é primo e exibe o resultado
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close(); // Fecha o scanner
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int n) {
        if (n < 2) return false; // Números menores que 2 não são primos
        for (int i = 2; i < n; i++) { // Verifica divisores de 2 até n-1
            if (n % i == 0) return false; // Se for divisível, não é primo
        }
        return true; // Se não encontrou divisores, é primo
    }
}
