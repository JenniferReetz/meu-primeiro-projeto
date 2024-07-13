import java.util.Scanner;
import java.util.Random;
    public class OutroLoop {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double mediaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0;

            while (nota != -1) {
                System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
                nota = leitura.nextDouble();

                if (nota != -1) {
                    mediaAvaliacao += nota;
                    totalDeNotas++;
                }

            }

            System.out.println("Média de avaliações " + mediaAvaliacao/totalDeNotas);
        }
    }



class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}
class SegundoJogo{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt( 100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 entre 100: ");
        numeroDigitado = leitor.nextInt();
            tentativas++;
             if (numeroDigitado == numeroGerado) {
            System.out.println("Parabéns, você acertou o número em" + tentativas + "tentativas!");
            break;
             }
        }
    }
}