import java.util.Scanner;

public class Amigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entre com o valor investido pelo Joao: ");
        float valorInvestidoJoao = scanner.nextFloat();

        System.out.print("Entre com o valor investido pelo Pedro: ");
        float valorInvestidoPedro = scanner.nextFloat();

        int meses = 0;
        while (valorInvestidoJoao <= valorInvestidoPedro) {
            valorInvestidoJoao += valorInvestidoJoao * 0.025;
            valorInvestidoPedro += valorInvestidoPedro * 0.005;
            meses++;
        }

        System.out.println("Quantidade de meses necessarios: " + meses);

        scanner.close();
    }
}
