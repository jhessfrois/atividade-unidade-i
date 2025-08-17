public class atividade_05 {
  public static void main(String[] args) {
    // Avaliação de Notas dos Alunos
    int[][] matrizNotas = {
      {5, 7, 2,},
      {1, 14, 8},
      {8, 10, 23},
    };

    int maiorNota = matrizNotas[0][0];

    for (int i = 0; i < matrizNotas.length; i++) {
      for (int j = 0; j < matrizNotas[i].length; j++) {
        if (matrizNotas[i][j] > maiorNota) {
          maiorNota = matrizNotas[i][j];
        }
      }
    }

    System.out.println("A maior nota é: " + maiorNota);
  }
}
