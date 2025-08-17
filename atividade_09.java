import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
  private String nome;
  private int idade;
  private String endereco;

  public Pessoa(String nome, int idade, String endereco) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getEndereco() {
    return endereco;
  }
}

public class atividade_09 {
  public static void main(String[] args) {
    // Gerenciando um Cadastro de Clientes
    Scanner scanner = new Scanner(System.in);
    List<Pessoa> pessoas = new ArrayList<>();

    boolean continuar = true;

    while (continuar) {
      System.out.println("Escolha uma opção: ");
      System.out.println("1. Adicionar Pessoa");
      System.out.println("2. Listar Pessoas");
      System.out.println("3. Sair");
      System.out.print("Opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome: ");
          String nome = scanner.nextLine();
          System.out.print("Digite a idade: ");
          int idade = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Digite o endereço: ");
          String endereco = scanner.nextLine();

          pessoas.add(new Pessoa(nome, idade, endereco));
          System.out.println("Pessoa adicionada com sucesso!");
          break;
        case 2:
          if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
          } else {
            System.out.println("Lista de Pessoas:");
            for (Pessoa pessoa : pessoas) {
              System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Endereço: " + pessoa.getEndereco());
            }
          }
          break;
        case 3:
          continuar = false;
          System.out.println("Saindo do programa.");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    }
    scanner.close(); // Fecha o scanner ao final do uso
    System.out.println("Programa encerrado.");
  }
}
