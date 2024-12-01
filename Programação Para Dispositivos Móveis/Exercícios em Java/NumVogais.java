import java.util.Scanner;

public class NumVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int numeroDeVogais = contarVogais(texto);
        System.out.println("O número de vogais na string é: " + numeroDeVogais);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char charAtual = texto.charAt(i);
            if (vogais.indexOf(charAtual) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
