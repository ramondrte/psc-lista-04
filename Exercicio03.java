import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Idade (0-150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salário (maior que 0): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        scanner.nextLine(); // limpar buffer

        do {
            System.out.print("Sexo ('f' ou 'm'): ");
            sexo = scanner.nextLine().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Estado Civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = scanner.nextLine().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("Informações cadastradas com sucesso!");
        scanner.close();
    }
}