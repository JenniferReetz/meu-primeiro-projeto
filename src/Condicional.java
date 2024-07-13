public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
class SwitchCase {
    public static void main(String[] args) {
        String expressão= "Não gostei!";
        String motivo= "Bug";
        switch (expressão) {
            case "Amei!":
                System.out.println("Que bom que gostou!");
                // código a ser executado se a expressão for igual a valor1
                break;
            case "Gostei!":
                System.out.println("Que bom que gostou!");
                // código a ser executado se a expressão for igual a valor2
                break;
            case "Não gostei!":
                System.out.println("Que pena que não gostou, vamos fazer o melhor possível para arrumar o " + motivo);
                // código a ser executado se a expressão for igual a valor3
                break;

            default:
                System.out.println("Que pena que não gostou");
                // código a ser executado se a expressão não for igual a nenhum valor
                break;
        }
    }



}