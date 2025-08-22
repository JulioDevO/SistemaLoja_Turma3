package loja;

public class Movel extends Produto {
	private String material;
	
	public Movel(String nome, int cod, double preco, String material) {
		super(nome, cod, preco);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("O material é: " + this.material) ;
	}
}
