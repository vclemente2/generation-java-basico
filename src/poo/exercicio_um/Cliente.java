package poo.exercicio_um;

import java.util.regex.Pattern;

public abstract class Cliente{
    private String email;
    private String nome;
    private char sexo;
    private int idade;
    private boolean ativo;

    public Cliente(String email, String nome, char sexo, int idade){
        Cliente.verificarSexoValido(sexo);
        Cliente.verificarFormatoEmail(email);

        this.email = email;
        this.nome = nome;
        this.sexo = Character.toUpperCase(sexo);
        this.idade = idade;
        this.ativo = true;
    }

    public Cliente(){}

    public void visualizar(){
        System.out.println("Dados do cliente:");
        System.out.println("email: " + this.getEmail());
        System.out.println("nome: " + this.getNome());
        System.out.println("sexo: " + this.getSexo());
        System.out.println("idade: " + this.getIdade());
        System.out.println("status: " + this.getAtivo());
    }
    private static void verificarFormatoEmail(String email) {
        if(!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email))
            throw new RuntimeException("Formato de email inválido.");
    }

    private static void verificarSexoValido(char sexo){
        sexo = Character.toUpperCase(sexo);
        if (!(sexo == 'M' || sexo == 'F'))
            throw new RuntimeException("Sexo inválido.");
    }

    public String getEmail(){
        return this.email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSexo(){
        String sexo = this.sexo == 'M' ? "Masculino" : "Feminino";
        return sexo;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getAtivo(){
         if(this.ativo)
             return "Cliente ativo";
         else
             return "Cliente inativo";
    }

    public void setEmail(String email){
        Cliente.verificarFormatoEmail(email);
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(char sexo){
        Cliente.verificarSexoValido(sexo);
        this.sexo = Character.toUpperCase(sexo);
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void isAtivo(boolean ativo){
        this.ativo = ativo;
    }
}