package metodos;

public class Calculadora {
	private int soma;
	
	public Calculadora() {
		this.soma = 0;
	}
	
	
	 public static void main(String[] args) {
		Calculadora calculadora = Calculadora.instanciar();
		
		calculadora.soma(2, 4);
		calculadora.soma(1, 1);
	 }
	 
	 public static Calculadora instanciar() {
		 return new Calculadora();
	 }
	 
	 
	 public void soma(int num01, int num02) {
		 this.soma = num01 + num02;
		 System.out.println(this.getSoma());
	 }
	 
	 public int getSoma() {
		 return this.soma;
	 }
	
}
