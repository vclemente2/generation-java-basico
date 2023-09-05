package collections.pilha_e_fila.exercicio_dois;

import java.util.Scanner;
import java.util.Stack;

public class ControlePilha {
	private Stack<String> pilha;
	
	public ControlePilha() {
		this.pilha = new Stack<>();
	}
	
	public void exibirMenu() {
		System.out.println("********************************************************");
		System.out.println("            1 - Adicionar Livro na Pilha");
		System.out.println("            2 - Listar Todos os Livros");
		System.out.println("            3 - Retirar Livro da Pilha");
		System.out.println("            0 - Sair");
		System.out.println("********************************************************");
		System.out.println("Entre com a opção desejada:");
	}
	
	public void controlarMenu(int opcao, Scanner scanner) {
		switch(opcao) {
			case 1:
				scanner.nextLine();
				System.out.println("\nDigite o nome");
				this.incluirNapilha(scanner.nextLine());
				break;
			case 2:
				this.listarClientespilha();
				break;
			case 3:
				this.retirarDapilha();
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!\n");
				break;
			default:
				System.out.println("\nOpção inválida!\n");
		}
	}	
	
	private void incluirNapilha(String nomeLivro) {
		this.pilha.push(nomeLivro);
		
		this.imprimirPilhar(null);
		System.out.println("\nLivro adicionado!\n");
	}
	
	private void listarClientespilha() {
		this.imprimirPilhar("\nLista de livros na pilha:\n");
	}
	
	private void retirarDapilha() {
		if(this.verificarPilhaVazia()) {
			System.out.println("\nA pilha está vazia!\n");
		} else {
			this.pilha.pop();
			this.imprimirPilhar(null);
			System.out.println("\nUm livro foi retirado da pilha!\n");
		}
	}
	
	private boolean verificarPilhaVazia() {
		return this.pilha.isEmpty();
	}
	
	private void imprimirPilhar(String mensagem) {
		if(mensagem != null) {
			System.out.println(mensagem);
		} else {
			System.out.println("Pilha:\n");
		}
		
		for(String livro: this.pilha) {
			System.out.println(livro);
		}
	}
}
