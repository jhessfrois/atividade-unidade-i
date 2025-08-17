import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class atividade_08 {
  public static void main(String[] args) {
    // try-with-resources: o Scanner fecha sozinho no final
    try (Scanner scanner = new Scanner(System.in)) {
      // Análise de Frequência de Pedidos no Delivery
      System.out.println("Digite uma lista de números inteiros separados por espaços: ");
      String input = scanner.nextLine();

      String[] numeros = input.split(" ");
      int[] pedidos = new int[numeros.length];

      for (int i = 0; i < numeros.length; i++) {
        try {
          pedidos[i] = Integer.parseInt(numeros[i]);
        } catch (NumberFormatException e) {
          System.out.println("Entrada inválida: " + numeros[i] + ". Por favor, insira apenas números inteiros.");
          return; // encerra o programa se encontrar entrada inválida
        }
      }

      Map<Integer, Integer> frequencia = new HashMap<>();
      int itemMaisFrequente = pedidos[0];
      int maxFrequencia = 0;

      for (int pedido : pedidos) {
        frequencia.put(pedido, frequencia.getOrDefault(pedido, 0) + 1);

        if (frequencia.get(pedido) > maxFrequencia) {
          maxFrequencia = frequencia.get(pedido);
          itemMaisFrequente = pedido;
        }
      }

      System.out.println("Item mais frequente: " + itemMaisFrequente + " (Frequência: " + maxFrequencia + ")");
    }
  }
}
