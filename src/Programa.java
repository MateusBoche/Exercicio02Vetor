import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numero vai digitar?");
        int quantidade = sc.nextInt();
        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.println("Digite o numero: ");
            int x = sc.nextInt();
            vetor[i] = x;

        }

        String x ="";
        for (int i = 0; i < vetor.length; i++) {

            x +=new StringBuilder().append(vetor[i]).append(" ").toString();


        }
        System.out.println("Valores: " + x);

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        }
        System.out.println("soma: "+ soma);

        System.out.println("Media= "+ soma/ vetor.length);
    }
}
