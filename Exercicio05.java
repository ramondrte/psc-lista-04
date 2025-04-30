import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            int populacaoA, populacaoB;
            double taxaA, taxaB;

            do {
                System.out.print("População do país A: ");
                populacaoA = scanner.nextInt();
            } while (populacaoA <= 0);

            do {
                System.out.print("Taxa de crescimento A (%): ");
                taxaA = scanner.nextDouble();
            } while (taxaA <= 0);

            do {
                System.out.print("População do país B: ");
                populacaoB = scanner.nextInt();
            } while (populacaoB <= 0);

            do {
                System.out.print("Taxa de crescimento B (%): ");
                taxaB = scanner.nextDouble();
            } while (taxaB <= 0);

            int anos = 0;
            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaA / 100;
                populacaoB += populacaoB * taxaB / 100;
                anos++;
            }

            System.out.println("Anos necessários: " + anos);

            System.out.print("Deseja repetir? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);
        } while (repetir == 's');

        scanner.close();
    }
}