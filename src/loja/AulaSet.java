package loja;

import java.util.HashSet;
import java.util.Set;

public class AulaSet {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("cama", 1, 800);
		Produto produto2 = new Produto("cama", 1, 500);

		Set<Produto> produtos = new HashSet<Produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
	}

}
