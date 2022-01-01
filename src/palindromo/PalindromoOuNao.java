package palindromo;

public class PalindromoOuNao {

    public static void main(String[] args) {

        verificarSeEPalindromo("ovo"); // palíndromo
        verificarSeEPalindromo("cachorro"); // !palíndromo
        verificarSeEPalindromo("arara"); // palíndromo
        verificarSeEPalindromo("aranha"); // !palíndromo
        verificarSeEPalindromo("laranja"); // !palíndromo
        verificarSeEPalindromo("ana"); // palíndromo
        verificarSeEPalindromo("reviver"); // palíndromo
    }

    public static void verificarSeEPalindromo(String string) {

        // string = string.toUpperCase();
        if (!string.equals(new StringBuilder(string).reverse().toString())) {
            System.out.println(string + " não é palíndromo.");
            return;
        }
        System.out.println(string + " é palíndromo!");
    }
}