import java.util.ArrayList;
import java.util.Comparator;

public class Estoque {
    private String tipo;

    private ArrayList<Produto> produtos;


    public Estoque(String tipo) {
        this.tipo = tipo;
        produtos = new ArrayList<Produto>();
    }

    public String getTipo() {
        return this.tipo;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Comparator<Produto> getComparador() {
        Comparator<Produto> comparador = new Comparator<Produto>( ) {
            @Override
            public int compare(Produto produto1, Produto produto2){
                int comparadorNome = produto1.getNome().compareTo(produto2.getNome());
                if (comparadorNome != 0) {
                    return comparadorNome;
                }

                return produto1.getMarca().compareTo(produto2.getMarca());
            }
        };

        return comparador;
    }

    public void gerarRelatorio() {
        produtos.sort(getComparador());

        System.out.println("Tipo do estoque: " + getTipo());
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-14s%-14s%-14s\n", "Nome", "Marca", "Quantidade");
        System.out.println("-------------------------------------------------------------");

        for (Produto produto : produtos) {
            System.out.printf("%-14s%-14s%-14d\n", produto.getNome(), produto.getMarca(), produto.getQuantidade());
        } 
    }
}
