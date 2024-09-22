import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class StringInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada

        System.out.print("Digite uma string: "); // Solicita ao usuário que digite uma string
        String input = scanner.nextLine(); // Lê a string digitada pelo usuário

        // Chama a função para inverter a string
        String stringInvertida = inverterString(input);

        // Exibe a string invertida
        System.out.println("String invertida: " + stringInvertida);

        scanner.close(); // Fecha o scanner para liberar recursos
    }

    // Função que inverte a string
    public static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str); // Cria um StringBuilder com a string original
        return sb.reverse().toString(); // Inverte a string e retorna como uma nova string
    }
}
