package poo.exercicio_dois;

public class Gerente extends Funcionario {
	private int quantidadeLiderados;
	
	public Gerente(String nome, String matricula, String setor, int idade, int quantidadeLiderados) {
		super(nome, matricula, setor, idade);
		this.quantidadeLiderados = quantidadeLiderados;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Pessoas no time: " + this.getQuantidadeLiderados());
	}
	
	public int getQuantidadeLiderados() {
		return quantidadeLiderados;
	}

	public void setQuantidadeLiderados(int quantidadeLiderados) {
		this.quantidadeLiderados = quantidadeLiderados;
	}
}
