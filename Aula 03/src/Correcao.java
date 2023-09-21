public class Correcao {
    private int numeroQuestao;

    private String situacao;

    private int numeroTentativas;

    public Correcao(int numeroQuestao, boolean estahCerto, int numeroTentativas) {
        this.numeroQuestao = numeroQuestao;
        situacao = estahCerto ? "acertou" : "errou";
        this.numeroTentativas = numeroTentativas;
    }


    public int getNumeroQuestao() {
        return numeroQuestao;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }
}
