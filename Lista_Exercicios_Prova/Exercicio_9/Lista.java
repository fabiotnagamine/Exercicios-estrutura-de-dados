
package Exercicio_9;
import java.util.Arrays;

public class Lista {
    public static int valor[] = new int[8];
    public static int pos_ultimo = -1;
    public static void insere(int v){
    	for (int i = 0; i < valor.length; i++) {
    		if(valor[i] == 0) {
    			valor[i] = v;
    			break;
    		}
    	}
    }
    public static int busca(int v){
        for(int i = 0; i < valor.length; i++){
            if(valor[i] == v)
                return i;
        }
        return -1;
    }
    
    public static void remove(int v){
        int pos_remover = busca(v);
        if (pos_remover != -1){
            for (int i = pos_remover; i < valor.length -1; i++){
                valor[i] = valor[i+1];
            }
        }
    }
    
    public static void limpaLista(){
        for (int i = 0; i < valor.length; i++){
            valor[i] = 0;
        }
    }
    
    public static void imprime(){
    	Arrays.sort(valor);
        for (int i = 0; i < valor.length; i++){
            System.out.print(valor[i] + "   ");

        }
        System.out.println("");
    }
    
    public static void main(String args[]){
        valor[0] = 2;
        valor[1] = 3;
        valor[2] = 6;
        valor[3] = 7;
        valor[4] = 8;
        imprime();
        insere(1);
        insere(15);
        remove(3);
        imprime();
        insere(4);
        remove(7);
        imprime();
        limpaLista();
        imprime();
        insere(10);
        insere(9);
        insere(5);
        insere(7);
        imprime();
    }
}
