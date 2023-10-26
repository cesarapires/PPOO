public class Pessoa implements Segurado {
    private char sexo;

    private int idade;


    public Pessoa(char sexo, int idade) {
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public float calcularPremio() {
        if (getIdade() < 60) {
            return ((getIdade() / 10) + 1 ) * 100;
        }

        return getSexo() == 'F' ? 700.0f : 800.0f;  
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "{" +
            " valorPremio='" + calcularPremio() + "'" +
            " sexo='" + getSexo() + "'" +
            ", idade='" + getIdade() + "'" +
            "}";
    }

}
