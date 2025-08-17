import java.util.Scanner;

public class atividade_07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Jogo da Velha Interativo
    char[][] tabuleiro = new char[3][3];
    iniciarTabuleiro(tabuleiro);
    boolean jogoAtivo = true;
    char jogadorAtual = 'X';

    while (jogoAtivo) {
      exibirTabuleiro(tabuleiro);
      realizarJogada(tabuleiro, jogadorAtual, scanner);
      if (verificarVitoria(tabuleiro, jogadorAtual)) {
          exibirTabuleiro(tabuleiro);
          System.out.println("Jogador " + jogadorAtual + " venceu!");
          jogoAtivo = false;
      } else if (verificarEmpate(tabuleiro)) {
          exibirTabuleiro(tabuleiro);
          System.out.println("O jogo terminou em empate!");
          jogoAtivo = false;
      } else {
          jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // Alterna entre os jogadores
      }
    }
    scanner.close();
  }

  public static void iniciarTabuleiro(char[][] tabuleiro) {
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        tabuleiro[i][j] = ' '; // Preenche o tabuleiro com espaços vazios
      }
    }
  }

  public static void exibirTabuleiro(char[][] tabuleiro) {
    System.out.println("Tabuleiro:");
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        System.out.print("[" + tabuleiro[i][j] + "]");
      }
      System.out.println();
    }
  }

  public static void realizarJogada(char[][] tabuleiro, char jogador, Scanner scanner) {
    boolean jogadaValida = false;

    while (!jogadaValida) {
      System.out.print("Jogador " + jogador + ", escolha sua jogada (linha e coluna): ");
      int linha = scanner.nextInt() - 1;
      int coluna = scanner.nextInt() - 1;

      if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
        tabuleiro[linha][coluna] = jogador;
        jogadaValida = true;
      } else {
        System.out.println("Jogada inválida. Tente novamente.");
      }
    }
  }

  public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
    // Verifica linhas, colunas e diagonais
    for (int i = 0; i < 3; i++) {
      if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
          (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
        return true;
      }
    }
    return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
           (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
  }

  public static boolean verificarEmpate(char[][] tabuleiro) {
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        if (tabuleiro[i][j] == ' ') {
          return false; // Se houver pelo menos uma célula vazia, não é empate
        }
      }
    }
    return true; // Se não houver células vazias, é empate
  }
}
