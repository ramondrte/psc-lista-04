public class Exercicio04 {
    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA *= 1.03;
            populacaoB *= 1.015;
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
    }
}