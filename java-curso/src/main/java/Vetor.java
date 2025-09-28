import java.util.ArrayList;

public class Vetor {

    public static void main(String[] args) {
        int colecaoDeInteiros[] = {1, 2, 3, 4, 5};

        System.out.println(colecaoDeInteiros[0]);

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.remove(1);

        System.out.println(nomes.get(0));
    }

}
