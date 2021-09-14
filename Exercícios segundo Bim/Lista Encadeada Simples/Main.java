
package estrutura.de.dados.exercicios;


public class Main {

	public static void main(String[] args) {
		ListaEncadeada listaAtletas = new ListaEncadeada();
		Atleta a1 = new Atleta("X", 1.88, 98.8,"Futebol","Lg");
		Atleta a2 = new Atleta("XX", 1.88, 79.6,"Volei","Lg");
		Atleta a3 = new Atleta("XA", 1.88, 45.9,"Golfe","Lg");
		Atleta a4 = new Atleta("XYZ", 1.88, 63.5,"Skate ","Lg");
		Atleta a5 = new Atleta("XY", 1.88, 54.5,"Hipismo","Lg");
		listaAtletas.insereFim(new No(a1));
		listaAtletas.insereFim(new No(a2));
		listaAtletas.insereFim(new No(a3));
		listaAtletas.insereFim(new No(a4));
		listaAtletas.insereFim(new No(a5));
		
		listaAtletas.imprimeLista();
                
                listaAtletas.remove("XYZ");
                listaAtletas.imprimeLista();
                listaAtletas.buscar("XY");
	}

}
