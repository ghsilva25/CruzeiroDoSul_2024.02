import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class FatorialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada

        System.out.print("Digite um número inteiro não negativo: "); // Solicita ao usuário que digite um número
        int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

        // Verifica se o número é negativo
        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos."); // Mensagem de erro
        } else {
            // Chama a função calcularFatorial para obter o fatorial do número
            long fatorial = calcularFatorial(numero);
            // Exibe o resultado do fatorial
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }

    // Função que calcula o fatorial de um número inteiro não negativo
    public static long calcularFatorial(int n) {
        long fatorial = 1; // Inicializa a variável fatorial como 1 (fatorial de 0 e 1 é 1)
        // Loop para multiplicar os números de 2 até n
        for (int i = 2; i <= n; i++) {
            fatorial *= i; // Multiplica o fatorial pelo valor atual de i
        }
        return fatorial; // Retorna o valor do fatorial calculado
    }
}
