package collections.pilha_e_fila.exercicio_um;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ControleFila {
	private Queue<String> fila;
	
	public ControleFila() {
		this.fila = new LinkedList<>();
	}
	
	public void exibirMenu() {
		System.out.println("********************************************************");
		System.out.println("            1 - Adicionar Cliente na Fila");
		System.out.println("            2 - Listar Todos os Clientes");
		System.out.println("            3 - Retirar Cliente da Fila");
		System.out.println("            0 - Sair");
		System.out.println("********************************************************");
		System.out.println("Entre com a opção desejada:");
	}
	
	public void controlarMenu(int opcao, Scanner scanner) {
		switch(opcao) {
			case 1:
				scanner.nextLine();
				System.out.println("\nDigite o nome");
				this.incluirNaFila(scanner.nextLine());
				break;
			case 2:
				this.listarClientesFila();
				break;
			case 3:
				this.retirarDaFila();
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!\n");
				break;
			default:
				System.out.println("\nOpção inválida!\n");
		}
	}	
	
	private void incluirNaFila(String nomeCliente) {
		this.fila.add(nomeCliente);
		
		this.imprimirFila(null);
		System.out.println("\nCliente adicionado!\n");
	}
	
	private void listarClientesFila() {
		this.imprimirFila("\nLista de clientes na fila:\n");
	}
	
	private void retirarDaFila() {
		if(this.verificarFilaVazia()) {
			System.out.println("\nA fila está vazia!\n");
		} else {
			this.fila.poll();
			this.imprimirFila(null);
			System.out.println("\nO cliente foi chamado!\n");
		}
	}
	
	private boolean verificarFilaVazia() {
		return this.fila.isEmpty();
	}
	
	private void imprimirFila(String mensagem) {
		if(mensagem != null) {
			System.out.println(mensagem);
		} else {
			System.out.println("Fila:\n");
		}
		
		for(String cliente: this.fila) {
			System.out.println(cliente);
		}
	}
}
