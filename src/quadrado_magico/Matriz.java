package quadrado_magico;

public class Matriz {

    // atributos
    private int linhas;
    private int colunas;
    private int[] valores;

    // construtor
    public Matriz(int linhas, int colunas, int[] valores) {
        if (linhas != colunas) {
            throw new RuntimeException("O número de linhas deve ser igual ao número de colunas.".toUpperCase());
        }

        if (valores.length > linhas * colunas) {
            throw new RuntimeException("Matriz com valores excedentes.".toUpperCase());
        }

        this.linhas = linhas;
        this.colunas = colunas;
        this.valores = valores;
    }

    // métodos get
    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int[] getValores() {
        return valores;
    }

    // método adicional
    public boolean isQuadradoMagico() {

        // criando a matriz
        int[][] matriz = new int[getLinhas()][getColunas()];
        int x = 0;
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                matriz[i][j] = getValores()[x];
                x++;
            }
        }

        // verificando se a matriz criada é um quadrado mágico ou não
        int primeiraLinha = 0;
        int primeiraColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            int totalLinha = 0;
            int totalColuna = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0) {
                    primeiraLinha += matriz[i][j];
                    primeiraColuna += matriz[j][i];
                }
                totalLinha += matriz[i][j];
                totalColuna += matriz[j][i];
            }

            if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna || primeiraColuna != primeiraLinha) {
                return false;
            }
        }
        return true;
    }
}