package loja;

public class Eletro extends Produto {
	public int voltagem;

	public Eletro(String nome, int cod, double preco, int voltagem) {
		super(nome, cod, preco);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("A voltagem é: " + this.voltagem) ;
	}

}
