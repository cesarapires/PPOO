import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Entre com a quantidade de amostras coletadas: ");
        int quantidadeExames = scanner.nextInt();
        
        Paciente paciente = new Paciente(nome, quantidadeExames);

        for (int i = 0; i < quantidadeExames; i++) {
            System.out.print("Insira o resultado do teste " + (i + 1) + ": ");

            double resultadoExame = scanner.nextDouble();

            paciente.setResultadoExame(resultadoExame);

        }

        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.printf("Resultado médio = %.2f \n", paciente.getMediaResultadoExame());
        System.out.println("Diagnostico: " + paciente.getDiagnostico());
    }
}
