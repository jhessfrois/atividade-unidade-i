import java.util.ArrayList;
import java.util.Scanner;

public class atividade_04 {
  public static void main(String[] args) {
    // Organizando uma Lista de Espera Dinâmica
    ArrayList<String> listaDeEspera = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("Menu:");
      System.out.println("1. Adicionar cliente à lista de espera");
      System.out.println("2. Remover cliente da lista de espera");
      System.out.println("3. Exibir lista de espera");
      System.out.println("4. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome do cliente a ser adicionado: ");
          String cliente = scanner.nextLine();
          listaDeEspera.add(cliente);
          System.out.println("Cliente " + cliente + " adicionado à lista de espera.");
          break;
        case 2:
          if (listaDeEspera.isEmpty()) {
            System.out.println("A lista de espera está vazia.");
          } else {
            System.out.print("Digite o nome do cliente a ser removido: ");
            String clienteRemover = scanner.nextLine();
            if (listaDeEspera.remove(clienteRemover)) {
              System.out.println("Cliente " + clienteRemover + " removido da lista de espera.");
            } else {
              System.out.println("Cliente " + clienteRemover + " não encontrado na lista de espera.");
            }
          }
          break;
        case 3:
          if (listaDeEspera.isEmpty()) {
            System.out.println("A lista de espera está vazia.");
          } else {
            System.out.println("Lista de espera: " + listaDeEspera);
            for (int i = 0; i < listaDeEspera.size(); i++) {
              System.out.println("Posição " + (i + 1) + ": Cliente " + listaDeEspera.get(i));
            }
          }
          break;
        case 4:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
}
    } while (opcao != 4);
    scanner.close();
  }
}
  
