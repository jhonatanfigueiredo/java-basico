package quadrado_magico;

public class App {

    public static void main(String[] args) {

        Matriz matrizA = new Matriz(3, 3, new int[]{3, 7, 8, 1, 5, 9, 4, 2, 6});
        Matriz matrizB = new Matriz(2, 2, new int[]{2, 2, 2, 2});
        Matriz matrizC = new Matriz(3, 3, new int[]{2, 7, 6, 9, 5, 1, 4, 3, 8});
        Matriz matrizD = new Matriz(3, 3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        dizerSeEQuadradoMagico(matrizA); // quadrado não mágico
        dizerSeEQuadradoMagico(matrizB); // quadrado mágico
        dizerSeEQuadradoMagico(matrizC); // quadrado mágico
        dizerSeEQuadradoMagico(matrizD); // quadrado não mágico
    }

    public static void dizerSeEQuadradoMagico(Matriz matriz) {

        if (!matriz.isQuadradoMagico()) {
            System.out.println("Quadrado não mágico");
            return;
        }
        System.out.println("Quadrado mágico");
    }
}