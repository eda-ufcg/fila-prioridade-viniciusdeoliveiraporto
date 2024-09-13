import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair newPair = new Pair(elemento, prioridade);

		this.fila.add(newPair);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		if(this.fila.isEmpty()) return "fila vazia";

		Pair bigger = this.fila.get(0);

		for (int i =0; i<this.fila.size(); i++){
			if( this.fila.get(i).getPrioridade() > bigger.getPrioridade() ){
				bigger = this.fila.get(i);
			}
		}

		this.fila.remove(bigger);

		return bigger.getElemento();
	}

}
