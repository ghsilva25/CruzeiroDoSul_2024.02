import java.util.Scanner;

public class ContarConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int numeroDeConsoantes = contarConsoantes(texto);
        System.out.println("O número de consoantes na string é: " + numeroDeConsoantes);

        scanner.close();
    }

    public static int contarConsoantes(String texto) {
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char charAtual = texto.charAt(i);
            // Verifica se é uma letra e não é uma vogal
            if (Character.isLetter(charAtual) && vogais.indexOf(charAtual) == -1) {
                contador++;
            }
        }

        return contador;
    }
}
