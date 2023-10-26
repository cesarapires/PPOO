import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Segurado> segurados = new ArrayList<Segurado>();

        segurados.add(new Apartamento(63.4f, 5));
        segurados.add(new Apartamento(43.2f, 3));

        segurados.add(new Casa(108.3f, true));
        segurados.add(new Casa(92.4f, false));

        segurados.add(new Pessoa('M', 37));
        segurados.add(new Pessoa('M', 79));
        segurados.add(new Pessoa('F', 65));

        for (Segurado segurado : segurados) {
            System.out.println(segurado.toString());
        }

    }
}
