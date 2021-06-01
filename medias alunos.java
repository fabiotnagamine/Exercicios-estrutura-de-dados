
package notas;

import java.util.Scanner;

public class Notas {
    
    public static float media(float n1, float n2, float n3){
        
        float media;
        media = (n1+ n2+ n3)/3;
        return media;       
        
    }    
  
    public static void main(String[] args) {
       
        float n1, n2, n3, media;
        
        Scanner nx = new Scanner(System.in);
        
        System.out.println("digite a primeira nota: ");
        n1 = nx.nextFloat();
        
        System.out.println("digite a segunda nota: ");
        n2 = nx.nextFloat();
        
        System.out.println("digite a terceira nota: ");
        n3 = nx.nextFloat();
        
        media = media(n1, n2, n3);
        
        System.out.println("a media do aluno é: "+media);
        
    }
    
}
