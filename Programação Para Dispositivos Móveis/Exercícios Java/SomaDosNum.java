public class SomaDosNum {
    public static void main(String[] args) {
        int a = 25;
        int b = 175;

        // Número total de termos
        int n = (b - a + 1);

        // Soma dos números de a até b
        int soma = (n * (a + b)) / 2;

        System.out.println("A soma dos números de " + a + " a " + b + " é: " + soma + ". ");
    }
}