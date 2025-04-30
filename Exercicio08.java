import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
        }

        media = soma / 5.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        scanner.close();
    }
}