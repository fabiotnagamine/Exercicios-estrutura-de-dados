/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author fabio
 */
public class Carros {

    String nomeMarca, nomeModelo;
    int fabricacao, qtdPortas;
        public void cadastro(String marca, String modelo, int fabricacao, int qtdPortas){
            this.nomeMarca = marca;
            this.nomeModelo = modelo;
            this.fabricacao = fabricacao;
            this.qtdPortas = qtdPortas;
             
     
 }
        public String mostrar(){
            return "\nMarca: "+this.nomeMarca+"\n Modelo: "+this.nomeModelo+"\n Ano de Fabricação: "
                    +this.fabricacao+"\nQuantidades de Portas: "+this.qtdPortas;
        }
}
