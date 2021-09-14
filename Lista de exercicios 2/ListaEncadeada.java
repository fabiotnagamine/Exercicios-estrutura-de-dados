package estrutura.de.dados.exercicios;


public class ListaEncadeada {
	No inicio;
	No fim;
	
	public void insereFim(No n) {
		if (inicio == null) {
			inicio = n;
			fim = n;
		}
		else {
			fim.setProximo(n);
			fim = n;
		}
		System.out.println("Inserido com sucesso" + n.toString());
	}
	public void imprimeLista() {
		No auxiliar = inicio;
		System.out.println("Impressão da lista");	
	while(auxiliar != null) {
			System.out.println(auxiliar.toString());
			auxiliar = auxiliar.getProximo();
		}
	}
	public No remove(String chave) {
		No ant = null;
		No remover = inicio;
		
		while(remover != null) {
			if (remover.toString().contains(chave)) {
				if (ant != null) {
					if (remover == fim) {
						fim = ant;
					}
					remover.setProximo(null);
					System.out.println("Removido com sucesso!");
					return remover;
				}
				else {
					inicio = remover.getProximo();
					remover.getProximo();
					if (fim == remover) {
						fim = remover.getProximo();
					}
					System.out.println("Removico com sucesso!");
					return remover;
				}
			}
			ant = remover;
			remover = remover.getProximo();
		}
		System.out.println("Elemento não foi encontrado para a remoção");
		return null;
	}
	public No buscar(String buscar) {
		No auxiliar = inicio;
		while (auxiliar != null) {
			if (auxiliar.toString().contains(buscar)) {
				return auxiliar;
			}
			auxiliar = auxiliar.getProximo();
		}
		return null;
	}
}
