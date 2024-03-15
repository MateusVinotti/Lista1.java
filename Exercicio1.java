import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("Número maior que 10!");
        } else if (numero < 10) {
            System.out.println("Número menor que 10!");
        } else if (numero == 10) {
            System.out.println("Número igual a 10!");
        }

        scanner.close();
    }
}