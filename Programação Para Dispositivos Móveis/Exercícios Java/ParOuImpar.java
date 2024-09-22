import java.util.Scanner;

public class ParOuImpar {

    public static void main (String[] args){

        Scanner ParOuImpar = new Scanner(System.in);


        // Informando o número correspondente:
        System.out.println("Informe um número, por gentileza: ");
        int num = ParOuImpar.nextInt();
// _____________________________________________________________________________________________________________________

        // Se o número informado for divísivel por 2 ele é par. Caso contrário ele será impar...
        if(num % 2 == 0){
            System.out.println("O número que você descreveu, cujo é " + num + " é classificado como par!");
        }else{
            System.out.println("O número que você descreveu, cujo é " + num + " é classificado como ímpar!");

        }



    }


}