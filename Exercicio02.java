import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            }

        } while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }
}