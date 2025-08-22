package loja;

import java.util.Objects;

public class Produto {

	private String nome;
	private int cod;
	private double preco;
	
	public Produto(String nome, int cod, double preco) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void exibirInfo() {
		System.out.println("Nome do produto: " + nome + "- Código: " + cod + "- Preço: "+ preco);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod && Objects.equals(nome, other.nome);
				
	}
	
	
	
}
