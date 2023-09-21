public class Produto {
    private String nome;
    
    private String marca;

    private int quantidade;

    public Produto(String nome, String marca, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
