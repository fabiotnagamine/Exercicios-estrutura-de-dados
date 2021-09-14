/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplamenteEncadeada;

/**
 *
 * @author fabio
 */
public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada listaNome = new ListaDuplamenteEncadeada();
        Aluno a1 = new Aluno("Tucano", "Botânica", 2002, 9.4);
        Aluno a2 = new Aluno("Fulano", "Matemática ", 2003, 9.0);
        Aluno a3 = new Aluno("Ciclano", "Sociologia", 2004, 7.4);
        Aluno a4 = new Aluno("Tucano", "Filosofia", 2005, 4.1);
        listaNome.insereFim(new No(a1));
        listaNome.insereFim(new No(a2));
        listaNome.insereFim(new No(a3));
        listaNome.insereFim(new No(a4));
        
        
        listaNome.imprimeLista();
        
        listaNome.remove("Tucano");
        listaNome.remove("Ciclano");
        
        listaNome.imprimeLista();
    }
}
 