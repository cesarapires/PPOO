public class App {

    public static void main(String[] args) {
        Estoque estoque = new Estoque("fluxo");

        estoque.addProduto(new Produto("Sabonete", "Dove", 50));
        estoque.addProduto(new Produto("Sabonete", "Nivea", 25));
        estoque.addProduto(new Produto("Arroz", "Tio Joao", 125));
        estoque.addProduto(new Produto("Sabonete", "Palmolive", 40));
        estoque.addProduto(new Produto("Arroz", "Prato Fino", 250));

        estoque.gerarRelatorio();
    }   
}
