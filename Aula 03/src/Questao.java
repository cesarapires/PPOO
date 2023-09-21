import java.util.Random;

public class Questao {
    private static int numeroQuestao = 0;

    private int idQuestao;

    private String enunciado;

    private int gabarito;

    public Questao() {
        Random numeroAleatorio = new Random();

        numeroQuestao++;

        int num1 = numeroAleatorio.nextInt(10);
        int num2 = numeroAleatorio.nextInt(10);

        idQuestao = numeroQuestao;
        enunciado = "Quanto é "+ num1 + " * " + num2 + "?";
        gabarito = num1 * num2;
    }

    public int getId() {
        return idQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean estahCerto(int resposta) {
        return resposta == gabarito;
    }
}
