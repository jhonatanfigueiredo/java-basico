package anagrama;

import java.util.Arrays;

public class AnagramasOuNao {

    public static void main(String[] args) {

        String classe1 = "casar, sacar, caras";
        String classe2 = "foi, fio";
        String classe3 = "opa, bis, nao";

        verificarSeEClasseDeAnagramas(classe1); // anagramas
        verificarSeEClasseDeAnagramas(classe2); // anagramas
        verificarSeEClasseDeAnagramas(classe3); // !anagramas
    }

    public static void verificarSeEClasseDeAnagramas(String classe) {

        String[] vetor = classe.split(", "); // usando split para organizar cada palavra da classe em uma posição do vetor

        // validando se todas as strings da classe possuem o mesmo tamanho
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i].length() != vetor[i + 1].length()) {
                throw new RuntimeException("Strings com tamanhos diferentes.".toUpperCase());
            }
        }

        char[] auxiliar1 = vetor[0].toCharArray(); // fixando uma palavra da classe para ser usada na comparação
        Arrays.sort(auxiliar1); // usando a função sort(), do próprio java, para ordenar a palavra fixada e facilitar a comparação
        char[] auxiliar2;

        for (int i = 1; i < vetor.length; i++) { // começando da posição 1 porque a posição 0 já está fixada (na variável auxiliar1)
            auxiliar2 = vetor[i].toCharArray();
            Arrays.sort(auxiliar2);
            if (!Arrays.equals(auxiliar1, auxiliar2)) {
                System.out.println("Não é uma classe de anagramas.");
                return;
            }
        }
        System.out.println("É uma classe de anagramas.");
    }
}