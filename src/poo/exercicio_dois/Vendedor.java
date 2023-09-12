package poo.exercicio_dois;

public class Vendedor extends Funcionario{
	private float comissao;
	
	public Vendedor(String nome, String matricula, String setor, int idade, float comissao) {
		super(nome, matricula, setor, idade);
		this.comissao = comissao;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Percentual Comissão: " + (this.getComissao() * 100) + "%");
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
}
