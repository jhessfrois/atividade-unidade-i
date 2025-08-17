import java.util.Scanner;

public class atividade_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Verificador de Características de Um Produto
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    // Verifica se o número é par ou ímpar
    if (numero % 2 == 0) {
      System.out.println("O número " + numero + " é par.");
    } else {
      System.out.println("O número " + numero + " é ímpar.");
    }
    scanner.close();
  }
}
