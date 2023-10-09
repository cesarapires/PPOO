public class Acoes extends Aplicacao  {
    private double precoInicial;
    private double precoFinal;

    public Acoes(double precoInicial, double precoFinal, double valorAplicado) {
        super(valorAplicado);
        this.precoInicial = precoInicial;
        this.precoFinal = precoFinal;
    }

    public double getPrecoInicial() {
        return this.precoInicial;
    }

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    private double getRendimento() {
        return (getPrecoFinal()/getPrecoFinal()) * 100 - 100;
    }

    public double calcularRetorno(int tempo) {
        return getValorAplicado() * Math.pow(1 + getRendimento() / 100, tempo);
    }
}
