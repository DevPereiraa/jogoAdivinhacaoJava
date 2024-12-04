import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacaoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        while (jogarNovamente) {
            int numeroSecreto = (int) (Math.random() * 10) + 1;
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("Tente adivinhar o número entre 1 e 10:");

            while (!acertou) {
                System.out.println("Digite seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite == numeroSecreto) {
                    acertou = true;
                    System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

                } else if (palpite < numeroSecreto) {
                    System.out.println("Tente um número maior.");
                } else {
                    System.out.println("Tente um número menor.");
                }

            }
            System.out.println("Deseja continuar jogando? (S/N)");
            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("N")) {
                jogarNovamente = false;
            }

        }
        scanner.close();
        System.out.println("Obrigado por jogar! Volte sempre!");

    }
}
