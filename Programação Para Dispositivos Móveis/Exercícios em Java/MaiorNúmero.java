import java.util.Scanner;
public class MaiorNúmero {

    public static void main(String[] args) {

        Scanner MaiorValor = new Scanner(System.in);
        int Valor = Integer.MIN_VALUE;

        System.out.println("Informe 5 números, por gentileza: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            int num = MaiorValor.nextInt();


            if (num > Valor) {
                Valor = num;


            }

            System.out.println("O maior número é: " + Valor);




        }
    }
}