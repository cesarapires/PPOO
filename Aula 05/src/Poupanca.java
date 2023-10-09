public class Poupanca extends Aplicacao {
    private double taxaSelic;
    private double taxaTr;

    public Poupanca(
        double taxaSelic, 
        double taxaTr,
        double valorAplicado
    ) {
        super(valorAplicado);
        this.taxaSelic = taxaSelic;
        this.taxaTr = taxaTr;
    }

    public double getTaxaSelic() {
        return this.taxaSelic;
    }

    public double getTaxaTr() {
        return this.taxaTr;
    }

    public double getRendimento() {
        return (0.7 * getTaxaSelic() + getTaxaTr());
    }

    public double calcularRetorno(int tempo) {
        return getValorAplicado() * Math.pow(1 + getRendimento() / 100, tempo);
    }
}
