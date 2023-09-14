package poo.exercicio_dois;

public class TestaFuncionario {
    public static void main(String[] args) {
        try {
        Gerente funcionarioUm = new Gerente("Vinicius", "0001", "TI", 31, 10);
        Gerente funcionarioDois = new Gerente("Gabi", "0002", "RH", 28, 2);
        
        Vendedor funcionarioTres = new Vendedor("Fulano", "0003", "TI", 25, 0.01f);
        Vendedor funcionarioQuatro = new Vendedor("Fulana", "0004", "TI", 19, 0.02f);

  
        funcionarioUm.visualizar();
        System.out.println("**********************");
        funcionarioDois.visualizar();
        System.out.println("**********************");
        funcionarioTres.visualizar();
        System.out.println("**********************");
        funcionarioQuatro.visualizar();
        } catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
