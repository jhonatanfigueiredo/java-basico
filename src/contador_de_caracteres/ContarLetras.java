package contador_de_caracteres;

import java.util.ArrayList;

public class ContarLetras {

    public static void main(String[] args) {

        String qualquer = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit."
                + "Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy"
                + " uctor massa. Pellentesque habitant morbi tristique senectus et netus"
                + " et malesuada fames ac turpis egestas. Nulla at risus. Quisque purus magna,"
                + " auctor et, sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing.";

        // contarLetras("Jhonatan");
        // contarLetras("teste");
        // contarLetras("as7hyd8t7stsadsasbdsiauds78t3278");
        contarLetras(qualquer);
    }

    public static void contarLetras(String string) {

        // filtrando a string informada no parâmetro
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] auxiliar = string.toLowerCase().toCharArray(); // convertendo a String passada no parâmetro para array
        String stringFiltrada = "";

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < abecedario.length; j++) {
                if (auxiliar[i] == abecedario[j]) {
                    stringFiltrada += abecedario[j];
                }
            }
        }

        // contando as letras
        ArrayList<Character> letras = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        for (Character ch : stringFiltrada.toCharArray()) {
            ch = Character.toUpperCase(ch);

            if (!letras.contains(ch)) {
                letras.add(ch);
                quantidades.add(1);
            } else {
                int indice = letras.indexOf(ch);
                quantidades.set(indice, quantidades.get(indice) + 1);
            }
        }

        System.out.println("Total de letras: " + stringFiltrada.length());
        for (Character ch : letras) {
            System.out.println(ch + " = " + quantidades.get(letras.indexOf(ch)));
        }
    }
}