package Desafio;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");
        }
    }
}

class Comparacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}


 class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Digite um número");

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");


            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
class Escolhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int escolha = 0;
        int escolha1 = 0;
        int escolhaCase1 = 0;
        int escolhaCase2 = 0;
        int escolha2 = 0;
        int simOuNao = 0;
        System.out.println("DIGITE UM NÚMERO : ");
        numero = scanner.nextInt();
        while (escolha != 4) {
            System.out.println("-----Menu-----");
            System.out.println("1. Seu número é maior que 20?");
            System.out.println("2. Ou menor que 20?");
            System.out.println("3. Ou é 20?");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {

                System.out.println("1.Seu número é maior que 50?");
                System.out.println("2.Seu número é menor que 500? ");
                System.out.println("3.Seu número está entre 20 e 50? ");
                System.out.println("4. Deseja tentar denovo?");
                escolha1 = scanner.nextInt();
                switch (escolha1) {
                    case 1:
                        if (numero > 50) {

                        } else {
                            System.out.println("Você tem certeza? Deseja tentar denovo ?\n 1.Sim, mas adivinhe primeiro");
                            escolhaCase1 = scanner.nextInt();
                            if (escolhaCase1 == 1) {
                                break;
                            } else {
                                System.out.println("Ops! acho que você não digitou uma escolha válida!\n mas vamos continuar mesmo assim");
                                break;

                            }
                        }
                    case 2:
                        if (numero < 500) {

                        } else{
                            System.out.println("Você tem certeza? Deseja tentar denovo ?\n 1.Sim, mas adivinhe primeiro");
                            escolhaCase2 = scanner.nextInt();
                            if (escolhaCase2 == 1) {
                                break;

                            }else {
                                System.out.println("Ops! acho que você não digitou uma escolha!\n mas vamos continuar mesmo assim");
                                break;

                            }
                        }
                }
                System.out.println("Seu número por acaso é " + numero + "?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                simOuNao = scanner.nextInt();
                switch (simOuNao){
                    case 1:
                        System.out.println("Que bom que eu adivinhei!");
                        break;
                    case 2:
                        System.out.println("Você tem certeza? (Eu li sua mente para adivinhar) eu acho que não...");
                        break;
                    default:
                        System.out.println("Ops! acho que você não digitou uma escolha!");
                break;}
            } else if (escolha == 2) {
                System.out.println("1.Seu número é menor que 10?");
                System.out.println("2.Seu número é maior que 15?");
                escolha2 = scanner.nextInt();
                System.out.println("Seu número por acaso é " + numero + "?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                simOuNao = scanner.nextInt();
                switch (simOuNao){
                    case 1:
                        System.out.println("Que bom que eu adivinhei!");
                        break;
                    case 2:
                        System.out.println("Você tem certeza? (Eu li sua mente para adivinhar) eu acho que não...");
                        break;
                    default:
                        System.out.println("Ops! acho que você não digitou uma escolha!");
                        break;
            }
            } else if (escolha == 3) {
                System.out.println("Que bom que eu adivinhei!");
            } else if (escolha == 4) {
                System.out.println("Menu fechado.");
                break;

            } else {
                System.out.println("Ops! acho que você não digitou uma escolha!");
                break;
            }
            break;

        }


    }
}