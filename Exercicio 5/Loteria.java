import java.util.Scanner;

public class Main {
  static final int TAM = 13;
  static int resposta[] = new int[TAM];
  static int gabarito[] = new int [TAM];
  static int qtdAcertos = 0;
  static Scanner sc = new Scanner(System.in);

  public static void insere(){
    for(int cont = 0; cont < TAM; cont++){
      System.out.print("Gabarito pos[" + cont + "]:");
      gabarito[cont] = sc.nextInt();
    }
  }

  public static int verificarAcertos(){
    for(int cont = 0; cont < TAM; cont++){
      if(gabarito[cont] == resposta[cont] )
          qtdAcertos++;
    }
    if (qtdAcertos == 13){
        System.out.println("Ganhador Parabens!!!");
    }
        
    return qtdAcertos;
  }
  
  public static void imprimeGabarito(){
      System.out.println("Gabarito:");
      for(int cont = 0; cont < TAM; cont++){
          System.out.print(cont + "   ");
               
      }
      System.out.println("");
      for(int cont = 0; cont < TAM; cont++){
           System.out.print(gabarito[cont] + "   " );    
      }
      
      System.out.print("Acertos: " + verificarAcertos());
  }
  
  public static void imprimeRespostas(){
      System.out.println("Respostas:");
      for(int cont = 0; cont < TAM; cont++){
          System.out.print(cont + "   ");
               
      }
      System.out.println("");
      for(int cont = 0; cont < TAM; cont++){
           System.out.print(resposta[cont] + "   " );    
      }
      System.out.println("");
  }

  public static void main(String[] args) {
    resposta[0]  = 1;
    resposta[1]  = 1;
    resposta[2]  = 1; 
    resposta[3]  = 1;
    resposta[4]  = 1;
    resposta[5]  = 1;
    resposta[6]  = 1;
    resposta[7]  = 1;
    resposta[8]  = 1;
    resposta[9]  = 1;
    resposta[10] = 1;
    resposta[11] = 1;
    resposta[12] = 1;
    insere();
    imprimeRespostas();
    imprimeGabarito();
  }
}
