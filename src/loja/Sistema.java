package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
	
	private ArrayList<Produto> produtos;

	public Sistema() {
		this.produtos = new ArrayList<Produto>();
	}
	 
	public void cadastrarProduto(Scanner scanner) {
		try {
			System.out.println("Cadastrando produto!");
			System.out.println("Digite o nome do produto:");
			String nome = scanner.nextLine();

			System.out.println("Digite o código do produto:");
			int codigo = scanner.nextInt();

			System.out.println("Digite o preço do produto:");
			double preco = scanner.nextDouble();

			System.out.println("Digite a opção que você quer cadastrar");
			System.out.println("1- Móvel");
			System.out.println("2- Eletrodoméstico");
			int opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
				case 1:
					cadastrarMovel(scanner, nome, codigo, preco);
					break;
				case 2:
					cadastrarEletro(scanner, nome, codigo, preco);
					break;
				default:
					System.out.println("Opção inválida! O produto não foi cadastrado.");
					break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Erro: A entrada de dados está incorreta. Por favor, insira um número inteiro.");
			scanner.nextLine();
		}
	}
	
	private void cadastrarMovel(Scanner scanner, String nome, int codigo, double preco) {
		System.out.println("Digite o material do móvel:");
		String material = scanner.nextLine().trim();
		
		Movel movel = new Movel(nome, codigo, preco, material);
		
		produtos.add(movel);
		
		System.out.println("Móvel cadastrado com sucesso!");
	}
	
	private void cadastrarEletro(Scanner scanner, String nome, int codigo, double preco) {
		try {
			System.out.println("Digite a voltagem:");
			int voltagem = scanner.nextInt();
			Eletro eletro = new Eletro(nome, codigo, preco, voltagem);
			produtos.add(eletro);
		} catch (InputMismatchException e) {
			System.out.println("Erro: A entrada de dados está incorreta. Por favor, insira um número inteiro.");
			scanner.nextLine();
		}
	}
	
	public void listar() {
		if (produtos.size() == 0) {
			System.out.println("Nenhum produto cadastrado!");
		} else {
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
	}
	
	public Produto buscar(Scanner scanner) {
		try {
			System.out.println("Digite um código:");
			int codigoProcurado = scanner.nextInt();
			scanner.nextLine();

			for (Produto produto : produtos) {
				if (produto != null && produto.getCod() == codigoProcurado) {
					System.out.println("Produto cadastrado!");
					System.out.println(produto);
					return produto;
				}
			}

			System.out.println("Produto não encontrado!");
			return null;

		} catch (java.util.InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
			scanner.nextLine(); 
			return null;
		} catch (NullPointerException e) {
			System.out.println("Erro interno: Um produto na lista é nulo.");
			return null;
		}
	}
	
	public void remover(Scanner scanner) {
        try {
            System.out.println("Digite o código do produto que deseja remover:");
            int codigoProcurado = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            Produto produtoParaRemover = null;
            for (Produto produto : produtos) {
                if (produto != null && produto.getCod() == codigoProcurado) {
                    produtoParaRemover = produto;
                    break;
                }
            }

            if (produtoParaRemover != null) {
                produtos.remove(produtoParaRemover);
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Produto não encontrado!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            scanner.nextLine();
        }
    }
}