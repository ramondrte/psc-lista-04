import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("Maior número: " + maior);
        scanner.close();
    }
}