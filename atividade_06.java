public class atividade_06 {
  public static void main(String[] args) {
    // Seleção de Números Primos para Criptografia
    int limite = 100;
    boolean[] isPrimo = new boolean[limite + 1];
    for (int i = 2; i <= limite; i++) {
      isPrimo[i] = true; // Assume que todos os números são primos inicialmente
    }
    for (int i = 2; i * i <= limite; i++) {
      if (isPrimo[i]) {
        for (int j = i * i; j <= limite; j += i) {
          isPrimo[j] = false; // Marca múltiplos de i como não primos
        }
      }
    }
    System.out.println("Números primos até " + limite + ":");
    for (int i = 2; i <= limite; i++) {
      if (isPrimo[i]) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
