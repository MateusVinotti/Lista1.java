import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da variável A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor da variável B: ");
        int B = scanner.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }

}
