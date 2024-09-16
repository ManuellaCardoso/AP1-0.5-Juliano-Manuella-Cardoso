import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    //Construtor da classe Matriz
    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }

    //Metodo para preencher a matriz com valores aleatórios
    public void preencherMatrizAleatoria() {
        Random rand = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rand.nextInt(100); // valores aleatórios entre 0 e 99
            }
        }
    }

    //Metodo para preencher a matriz manualmente
    public void preencherMatrizManual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    //Metodo para exibir a matriz
    public void exibirMatriz() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metodo para ordenar as linhas da matriz
    public void ordenarLinhas() {
        for (int i = 0; i < linhas; i++) {
            Arrays.sort(matriz[i]);
        }
    }

    //Metodo para ordenar as colunas da matriz
    public void ordenarColunas() {
        for (int j = 0; j < colunas; j++) {
            int[] coluna = new int[linhas];
            for (int i = 0; i < linhas; i++) {
                coluna[i] = matriz[i][j];
            }
            mergeSort(coluna, 0, coluna.length - 1);
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = coluna[i];
            }
        }
    }

    //Metodo para ordenar a matriz completa
    public void ordenarMatrizCompleta() {
        int[] vetor = new int[linhas * colunas];
        int k = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[k++] = matriz[i][j];
            }
        }
        mergeSort(vetor, 0, vetor.length - 1);
        k = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = vetor[k++];
            }
        }
    }

    //Algoritmo Merge Sort (recursivo)
    private void mergeSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(arr, esquerda, meio);
            mergeSort(arr, meio + 1, direita);
            merge(arr, esquerda, meio, direita);
        }
    }

    private void merge(int[] arr, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
        int[] esquerdaArr = new int[n1];
        int[] direitaArr = new int[n2];

        System.arraycopy(arr, esquerda, esquerdaArr, 0, n1);
        System.arraycopy(arr, meio + 1, direitaArr, 0, n2);

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (esquerdaArr[i] <= direitaArr[j]) {
                arr[k++] = esquerdaArr[i++];
            } else {
                arr[k++] = direitaArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = esquerdaArr[i++];
        }
        while (j < n2) {
            arr[k++] = direitaArr[j++];
        }
    }
}
