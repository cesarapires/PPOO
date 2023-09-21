import java.util.Scanner;

public class Prova {
    private Questao[] questao = new Questao[5];

    private Correcao[] correcao = new Correcao[5];

    public Prova() {
        for (int i = 0; i < 5; i++) {
            questao[i] = new Questao();
        }
    }

    public void aplicar() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            int tentativa = 0;
            int resposta;

            System.out.println("Questão: " + questao[i].getId() + ": " + questao[i].getEnunciado());
            System.out.print("R: ");
            resposta = scanner.nextInt();
            tentativa++;

            if (!questao[i].estahCerto(resposta)) {
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = scanner.nextInt();
                tentativa++;
            }

            String mensagemFinal = "Você tentou %d vez(es) e acertou a questão\n";

            if (!questao[i].estahCerto(resposta)) {
                mensagemFinal = "Você tentou %d vezes e errou a questão.\n";
            }

            correcao[i] = new Correcao(questao[i].getId(), questao[i].estahCerto(resposta), tentativa);
            System.out.printf(mensagemFinal, tentativa);
        }
    }

    public void gerarRelatorio() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-14s%-18s%-25s\n", "Questão", "Situação", "Número de Tentativas");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-14d%-18s%-25d\n", + correcao[i].getNumeroQuestao(), correcao[i].getSituacao(), correcao[i].getNumeroTentativas());
        }  
    }
}
