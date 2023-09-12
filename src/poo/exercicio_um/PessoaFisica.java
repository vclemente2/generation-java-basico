package poo.exercicio_um;

import java.util.regex.Pattern;

public class PessoaFisica extends Cliente{
	private String cpf;
	private final String tipoCliente = "Pessoa Física";
	
	public PessoaFisica(String email, String nome, char sexo, int idade, String cpf) {
		super(email, nome, sexo, idade);
		PessoaFisica.verificarCpfValido(cpf);
		this.cpf = PessoaFisica.sanitizarCpf(cpf);
	}
	
	public PessoaFisica() {};
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("cpf: " + this.getCpf());
		System.out.println("Tipo cliente: " + this.getTipoCliente());
	}
	
	public static void verificarCpfValido(String cpf) {
		if(!Pattern.matches("[0-9]{11}", PessoaFisica.sanitizarCpf(cpf))) 
			throw new RuntimeException("Formato de CPF inválido.");
	}
	
	public static String sanitizarCpf(String cpf) {
		return cpf.replaceAll("[.-]", "");
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		PessoaFisica.verificarCpfValido(cpf);
		this.cpf = PessoaFisica.sanitizarCpf(cpf);
	}
	
	public String getTipoCliente() {
		return this.tipoCliente;
	}
}
