package loja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        int opcao = 0; 

        do {
            try {
                System.out.println("\n=== Menu Principal ===");
                System.out.println("1 - Adicionar Produto");
                System.out.println("2 - Listar Produtos");
                System.out.println("3 - Buscar Produto");
                System.out.println("4 - Remover Produto");
                System.out.println("5 - Sair");
                System.out.print("Digite a opção desejada: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        sistema.cadastrarProduto(scanner);
                        break;
                    case 2:
                        sistema.listar();
                        break;
                    case 3:
                        sistema.buscar(scanner);
                        break;
                    case 4:
                        sistema.remover(scanner);
                        break;
                    case 5:
                        System.out.println("Saindo do sistema!");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, digite um número entre 1 e 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); 
                opcao = 0; 
            }
        } while (opcao != 5);

        scanner.close();
    }
}
