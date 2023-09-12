package poo.exercicio_um;

public class TestaCliente{
    public static void main(String[] args){
        PessoaFisica clienteUm = new PessoaFisica("qualquercoisa@email.com", "Vinicius", 'm', 30, "12345678910");

        PessoaFisica clienteDois = new PessoaFisica();
        clienteDois.setEmail("clientedois@email.com");
        clienteDois.setNome("Gabriela");
        clienteDois.setSexo('f');
        clienteDois.setIdade(28);
        clienteDois.isAtivo(false);
        clienteDois.setCpf("10987654321");
        
        
        PessoaJuridica clienteTres = new PessoaJuridica("email@email.com", "joao", 'm', 55, "123.456.789-1012/1");
        PessoaJuridica clienteQuatro = new PessoaJuridica("teste@email.com", "lucia", 'f', 48, "12345678910112");
        
        
        clienteUm.visualizar();
        System.out.println("\n*****************\n");
        clienteDois.visualizar();
        System.out.println("\n*****************\n");    	
        clienteTres.visualizar();
        System.out.println("\n*****************\n");    	
        clienteQuatro.visualizar();
    }
}