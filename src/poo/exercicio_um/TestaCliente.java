package poo.exercicio_um;

public class TestaCliente{
    public static void main(String[] args){
        Cliente clienteUm = new Cliente("qualquercoisa@email.com", "Vinicius", 'm', 30);

        Cliente clienteDois = new Cliente();
        clienteDois.setEmail("clientedois@email.com");
        clienteDois.setNome("Gabriela");
        clienteDois.setSexo('f');
        clienteDois.setIdade(28);
        clienteDois.setAtivo(false);

        clienteUm.visualizar();
        System.out.println("\n*****************\n");
        clienteDois.visualizar();
    }
}