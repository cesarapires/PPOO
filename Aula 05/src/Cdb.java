public class Cdb extends Aplicacao {
    private double taxaCdi;

    public Cdb(double taxaCdi, double valorAplicado) {
        super(valorAplicado);
        this.taxaCdi = taxaCdi;
    }

    public double getTaxaCdi() {
        return this.taxaCdi;
    }

    private double getRendimento() {
        return (1.2 * getTaxaCdi());
    }

    public double calcularRetorno(int tempo) {
        return getValorAplicado() * Math.pow(1 + getRendimento() / 100, tempo);
    }
}
