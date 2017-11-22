package exemploLinkedList;

//Bean class
public class Node {
	
	private Object valor;
	private Node proximo;
	private Node anterior;
	
	public Node (Object valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}
	
	//---------------------------------------------------------//

	public Object getValor () {
		return this.valor;
	}
	
	public void setValor (Object valor) {
		this.valor = valor;
	}
	
	public Node getProximo () {
		return this.proximo;
	}
	
	public void setProximo (Node proximo) {
		this.proximo = proximo;
	}
	
	public Node getAnterior () {
		return this.anterior;
	}
	
	public void setAnterior (Node anterior) {
		this.anterior = anterior;
	}
}

