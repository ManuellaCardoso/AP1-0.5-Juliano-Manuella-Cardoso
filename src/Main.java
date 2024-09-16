import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);

        System.out.println("Escolha a forma de preencher a matriz:");
        System.out.println("1. Preenchimento Aleatório");
        System.out.println("2. Preenchimento Manual");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            matriz.preencherMatrizAleatoria();
        } else if (escolha == 2) {
            matriz.preencherMatrizManual();
        } else {
            System.out.println("Escolha inválida.");
            return;
        }

        System.out.println("Matriz original:");
        matriz.exibirMatriz();

        System.out.println("Escolha o tipo de ordenação:");
        System.out.println("1. Ordenar por linhas");
        System.out.println("2. Ordenar por colunas");
        System.out.println("3. Ordenar matriz completa");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            matriz.ordenarLinhas();
        } else if (escolha == 2) {
            matriz.ordenarColunas();
        } else if (escolha == 3) {
            matriz.ordenarMatrizCompleta();
        } else {
            System.out.println("Escolha inválida.");
            return;
        }

        System.out.println("Matriz ordenada:");
        matriz.exibirMatriz();
    }
}
