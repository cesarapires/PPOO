public class Apartamento extends Imovel {
    private int numeroAndares;

    public Apartamento(float area, int numeroAndares) {
        super(area);
        this.numeroAndares = numeroAndares;
    }

    public int getNumeroAndares() {
        return this.numeroAndares;
    }

    @Override
    public float calcularPremio() {
        if (getNumeroAndares() < 4) {
            return 3 * getArea();
        }

        return 7 * getArea();
    }

    @Override
    public String toString() {
        return "{" +
            " valorPremio='" + calcularPremio() + "'" +
            " numeroAndares='" + getNumeroAndares() + "'" +
            "}";
    }
}
