package exemploLinkedList;

import exemploLinkedList.Node;

public class LinkedList {

	private Node primeiro;
	private Node ultimo;
	
	public LinkedList () {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void push (Node nodulo) {
		if (primeiro == null) {
			primeiro = nodulo;
			ultimo = nodulo;
			nodulo.setAnterior(null);
			nodulo.setProximo(null);
		}
		else {
			ultimo.setProximo(nodulo);
			nodulo.setAnterior(ultimo);
			nodulo.setProximo(null);
		}
	}
	
	public void pop () {
		if (ultimo == null) {
			System.out.println("A lista está vazia!");
		}
		else if (ultimo.getAnterior() == null){
			primeiro = null;
			ultimo = null;
		}
		else {
			ultimo = ultimo.getAnterior();
			ultimo.getProximo().setAnterior(null);
			ultimo.setProximo(null);
		}		
	}
	
	public Node getPrimeiro () {
		if (primeiro == null){
			return null;
		}
		else return primeiro;
	}
	
	public Node getUltimo () {
		if (ultimo == null){
			return null;
		}
		else return ultimo;
	}
	
	public void removerPrimeiro(){
		if (primeiro == null){
			System.out.println("A lista está vazia!");
		}
		else if (primeiro == ultimo){
			primeiro = null;
			ultimo = null;
		}
		else {
			primeiro = primeiro.getProximo();
			primeiro.getAnterior().setProximo(null);
			primeiro.setAnterior(null);
		}
	}
	
	public void removerUltimo() {
		if (ultimo == null){
			System.out.println("A lista está vazia!");
		}
		else if (primeiro == ultimo){
			primeiro = null;
			ultimo = null;
		}
		else {
			ultimo = ultimo.getAnterior();
			ultimo.getProximo().setAnterior(null);
			ultimo.setProximo(null);			
		}		
	}
	
	public void removerTodos () {
		if (primeiro == null){
			System.out.println("A lista já está vazia!");
		}
		else {
			primeiro = null;
			ultimo = null;
		}
	}
	
	public void removerTodosIterativamente(){
		if (primeiro == null){
			System.out.println("A lista já está vazia!");
		}
		else {
			Node nodulo = primeiro;
			while (nodulo.getProximo() != null){
				nodulo.setAnterior(null);
				nodulo = nodulo.getProximo();
				nodulo.getAnterior().setProximo(null);
			}
			nodulo.setAnterior(null);
			primeiro = null;
			ultimo = null;
		}
	}
		
	public Node buscar (Object valor){
		
		if (primeiro == null){
			return null;
		}
		else {
			if (primeiro.getValor() == valor){
				return primeiro;
			}
			else if (ultimo.getValor() == valor){
				return ultimo;
			}
			else if (primeiro.getProximo() == null){
				return null;
			}
			else {
				Node nodulo = primeiro.getProximo();
				
				while (nodulo != null){
					if (nodulo.getValor() == valor){
						return nodulo;
					}
					else nodulo = nodulo.getProximo();
				}	
				return null;
			}
		}
	}
}
