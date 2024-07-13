public class Main {
    public static void main(String [] args) {
        System.out.println("Filme: Beekeper :Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
    }
}

 class Constantes {
    public static void main(String [] args) {
        int MINHACONSTANTE = 5;
        int resultadoDaConstante = MINHACONSTANTE++;
        System.out.println(MINHACONSTANTE); //6
        System.out.println(resultadoDaConstante);//6
    }
}

class Formatado {
    public static void main (String [] args) {
        String nome = "João";
        int aulas = 4;

        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome, aulas);

    }
}
class Programa {

    public static void main(String[] args) {


        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }
    }
}
class SobreBolean {
    public static void main(String[] args) {
        int idade = 20;
        if (idade > 18 && idade < 65) {
            System.out.println("parabens");
        }
    }

}

 class Media{
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
    }
}
class DesafioTemperatura {
    public static void main ( String [] args) {
        double temperaturaCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
class Casting {
    public static void main (String [] args) {
        double nota1 = 4.2;
        double nota2 = 10;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: "+ media);
    }
}
 class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "ZUL";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}
 class Produto{
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;

        System.out.println(mensagem);
    }
}
class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares =  109.90;
        double taxaDeConversao = 4.94;
        short robux = 1700;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("A quantidade necessária de reais é de " + valorEmReais + "R$ e em dólares é " + valorEmDolares + " US$ para comprar " + robux + " robux.");

    }
}
 class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}