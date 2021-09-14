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
public class Aluno {
     String nome;
     int matricula;
     double nota;
     String nomeCurso;
    
    
    public Aluno(){
        nome =  null;
        matricula = 0;
        nota = 0.0;
        nomeCurso = null;
    }
    public Aluno(String nome, String curso, int matricula, double nota){
        this.nome = nome;
        this.nomeCurso = curso;
        this.matricula = matricula;
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + ", nomeCurso=" + nomeCurso + '}';
    }
    
    
    
}
