import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo do produto: ");
        float codigoProduto = scanner.nextFloat();
        System.out.print("Entre com a quantidade: ");
        float quantidade = scanner.nextFloat();

        float precoProduto = 0;

        if (codigoProduto <= 10) {
            precoProduto = 10;
        } else if (codigoProduto <= 20) {
            precoProduto = 15;
        } else if (codigoProduto <= 30) {
            precoProduto = 20;
        } else if (codigoProduto <= 40) {
            precoProduto = 30;
        }

        double totalBruto = precoProduto * quantidade;

        double desconto = 0;

        if (totalBruto < 250) {
            desconto = totalBruto * 0.05;
        } else if (totalBruto < 500) {
            desconto = totalBruto * 0.10;
        } else {
            desconto = totalBruto * 0.15;
        }

        double totalLiquido = totalBruto - desconto;

        System.out.println("Preco unitario: " + precoProduto);
        System.out.println("Valor bruto: " + totalBruto);
        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Preco final: " + totalLiquido);

        scanner.close();
    }
}
