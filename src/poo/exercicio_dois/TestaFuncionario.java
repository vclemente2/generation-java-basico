package poo.exercicio_dois;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario("Vinicius", "0001", "TI", 31);
        Funcionario funcionarioDois = new Funcionario("Gabi", "0002", "RH", 28);

        funcionarioUm.visualizar();
        System.out.println("**********************");
        funcionarioDois.visualizar();
    }
}
