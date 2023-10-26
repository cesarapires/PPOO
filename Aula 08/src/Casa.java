public class Casa extends Imovel {
    private boolean ehCondominio;

    public Casa(float area, boolean ehCondominio) {
        super(area);
        this.ehCondominio = ehCondominio;
    }

    public boolean ehCondominio() {
        return this.ehCondominio;
    }

    @Override
    public float calcularPremio() {
        if (ehCondominio()) {
            return 5 * getArea();
        }

        return 7 * getArea();
    }

    @Override
    public String toString() {
        return "{" +
            " valorPremio='" + calcularPremio() + "'" +
            " ehCondominio='" + ehCondominio() + "'" +
            "}";
    }
}
