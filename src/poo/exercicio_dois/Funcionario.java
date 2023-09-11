package poo.exercicio_dois;

public class Funcionario {
    private String nome;
    private String matricula;
    private String setor;
    private int idade;
    private boolean ativo;

    public Funcionario(String nome, String matricula, String setor, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.idade = idade;
        this.ativo = true;
    }

    public void visualizar(){
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Ativo: " + this.isAtivo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
