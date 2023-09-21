
public class Paciente {
    private String nome;
    private double[] exames;
    private int contador;

    public Paciente (String nome, int quantidadeExames) {
        this.nome = nome;
        exames = new double[quantidadeExames];
        contador++;
    }

    public String getNome() {
        return this.nome;
    }

    public double getResultadoExame(int numeroAmostra) {
        return this.exames[numeroAmostra - 1];
    }

    public double getMediaResultadoExame() {
        double somatorio = 0;

        for (double exame : this.exames) {
            somatorio += exame;
        }

        return somatorio / this.exames.length;
    }

    public String getDiagnostico() {
        double resultadoExame = this.getMediaResultadoExame();

        if (resultadoExame < 140) {
            return "Glicemia normal";
        } else if (resultadoExame < 200) {
            return "Risco de diabetes";
        } 

        return "Diabetes Mellitus";
    }

    public void setResultadoExame(double resultado) {
        exames[contador] = resultado;
        contador++;
    }

}
