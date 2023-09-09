import java.util.Scanner;

public class Frases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua frase para analise: ");
        String frase = scanner.nextLine();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        String[] palavras;

        palavras = frase.split(" ");

        String palavraComMaisVogal = "";
        int quantidadeVogaisMaiorPalavra = 0;

        // Percorre a o Array de String
        for (String palavra : palavras) {
            int quantidadeVogais = 0;

            // Percorre a palavra para obter a letra
            for (int posicao = 0; posicao < palavra.length(); posicao++) {
                char letra = palavra.charAt(posicao);

                for (char vogal : vogais) {
                    if (letra == vogal) {
                        quantidadeVogais++;
                    }
                }
            }
            
            if (quantidadeVogais > quantidadeVogaisMaiorPalavra) {
                palavraComMaisVogal = palavra;
                quantidadeVogaisMaiorPalavra = quantidadeVogais;
            }
        }

        System.out.println("Palavra com mais vogais: " + palavraComMaisVogal);
        System.out.println("Tamanho: " + quantidadeVogaisMaiorPalavra);

        scanner.close();

    }
}
