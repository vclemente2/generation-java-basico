package poo.exercicio_um;

import java.util.regex.Pattern;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private final String tipoCliente = "Pessoa Juridica";
	
	public PessoaJuridica(String email, String nome, char sexo, int idade, String cnpj) {
		super(email, nome, sexo, idade);
		PessoaJuridica.verificarCnpjValido(cnpj);
		this.cnpj = PessoaJuridica.sanitizarCnpj(cnpj);
	}
	
	public PessoaJuridica() {};
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cnpj: " + this.getCnpj());
		System.out.println("Tipo cliente: " + this.getTipoCliente());
	}
	
	public static void verificarCnpjValido(String cnpj) {
		if(!Pattern.matches("[0-9]{14}", PessoaJuridica.sanitizarCnpj(cnpj))) 
			throw new RuntimeException("Formato de CNPJ inválido.");
	}
	
	public static String sanitizarCnpj(String cnpj) {
		return cnpj.replaceAll("[-./]", "");
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		PessoaJuridica.verificarCnpjValido(cnpj);
		this.cnpj = PessoaJuridica.sanitizarCnpj(cnpj);
	}
	
	public String getTipoCliente() {
		return this.tipoCliente;
	}
}
