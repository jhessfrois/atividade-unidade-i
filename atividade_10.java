import java.util.*;

class ItemEstoque {
  private String nome;
  private int quantidade;

  public ItemEstoque(String nome, int quantidade) {
    this.nome = nome;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

public class atividade_10 {
  public static void main(String[] args) {
    // Sistema de Gerenciamento de Estoque para uma Loja
    Scanner scanner = new Scanner(System.in);
    Map<String, ItemEstoque> estoque = new HashMap<>();

    boolean continuar = true;

    while (continuar) {
      System.out.println("Escolha uma opção: ");
      System.out.println("1. Adicionar Item ao Estoque");
      System.out.println("2. Remover Item do Estoque");
      System.out.println("3. Atualizar Quantidade de um Item");
      System.out.println("4. Listar Itens do Estoque");
      System.out.println("5. Sair");
      System.out.print("Opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome do item: ");
          String nome = scanner.nextLine();
          System.out.print("Digite a quantidade: ");
          int quantidade = scanner.nextInt();
          scanner.nextLine();

          estoque.put(nome, new ItemEstoque(nome, quantidade));
          System.out.println("Item adicionado com sucesso!");
          break;
        case 2:
          System.out.print("Digite o nome do item a ser removido: ");
          String nomeRemover = scanner.nextLine();
          if (estoque.containsKey(nomeRemover)) {
            estoque.remove(nomeRemover);
            System.out.println("Item removido com sucesso!");
          }
          else {
            System.out.println("Item não encontrado no estoque.");
          }
          break;
        case 3:
          System.out.print("Digite o nome do item a ser atualizado: ");
          String nomeAtualizar = scanner.nextLine();
          if (estoque.containsKey(nomeAtualizar)) {
            System.out.print("Digite a nova quantidade: ");
            int novaQuantidade = scanner.nextInt();
            scanner.nextLine();
            estoque.get(nomeAtualizar).setQuantidade(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
          } else {
            System.out.println("Item não encontrado no estoque.");
          }
          break;
        case 4:
          if (estoque.isEmpty()) {
            System.out.println("Nenhum item no estoque.");
          } else {
            System.out.println("Itens no Estoque:");
            for (ItemEstoque item : estoque.values()) {
              System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
            }
          }
          break;
        case 5:
          continuar = false;
          System.out.println("Saindo do sistema...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    }
    scanner.close();
    System.out.println("Programa encerrado.");
  }
}

}
