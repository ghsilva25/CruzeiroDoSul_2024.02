import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        // Ordena o array
        Arrays.sort(array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
