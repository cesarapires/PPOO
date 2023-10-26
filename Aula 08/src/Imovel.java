public abstract class Imovel implements Segurado {
    private float area;

    public Imovel(float area) {
        this.area = area;
    }

    public float getArea() {
        return this.area;
    }
}
