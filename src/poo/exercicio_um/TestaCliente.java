package poo.exercicio_um;

import java.util.Optional;

public class TestaCliente{
    public static void main(String[] args){
    	try {
        PessoaFisica clienteUm = new PessoaFisica("qualquercoisa@email.com", "Vinicius", 'm', 30, "12345678910");

        PessoaFisica clienteDois = new PessoaFisica();
        
        String email = null;
        Optional<String> emailExistente = Optional.ofNullable(email); 
        email = emailExistente.orElse("emailpadrao@email.com");
        
        clienteDois.setEmail(email);
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
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}