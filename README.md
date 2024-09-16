-Projeto de Matriz Bidimensional

Este projeto em Java manipula matrizes bidimensionais e utiliza algoritmos de ordenação.

- Estrutura do Projeto

Classe `Matriz`

-Descrição: Gerencia uma matriz bidimensional de inteiros.
- Métodos:
 `preencherMatrizManual(int[][] dados)`: Preenche a matriz com valores fornecidos.
 `preencherMatrizAleatoria(int min, int max)`: Preenche a matriz com valores aleatórios.
 `inserirElemento(int linha, int coluna, int valor)`: Insere um valor na matriz.
 `removerElemento(int linha, int coluna)`: Remove um valor da matriz.
 `exibirMatriz()`: Mostra a matriz no console.
 `ordenarPorLinha()`: Ordena cada linha usando Bubble Sort.
 `ordenarPorColuna()`: Ordena cada coluna usando Bubble Sort.
 `ordenarMatrizCompleta()`: Ordena todos os elementos da matriz usando Merge Sort e reconstrói a matriz.

-Classe `Main`

Descrição: Executa o programa e interage com o usuário.

-Lógica dos Métodos

Preenchimento: Métodos para preencher a matriz manualmente ou com valores aleatórios.
Inserção/Remoção: Adiciona ou remove valores em posições específicas da matriz.
Ordenação: Ordena linhas, colunas ou a matriz completa com algoritmos específicos.

-Algoritmos de Ordenação

Bubble Sort: Simples e fácil de implementar, mas não é eficiente para grandes conjuntos de dados.
Merge Sort: Mais eficiente para grandes conjuntos de dados, ideal para ordenar a matriz completa.
