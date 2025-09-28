import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.remove(1);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

    }

}
