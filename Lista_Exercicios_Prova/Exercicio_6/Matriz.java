
public class Main
{
    static final int TAM = 5;
    static int matriz[][] = new int[TAM][TAM];
    static int soma_Dpri;
    static int soma_Dsec;
    static int soma;
	public static void main(String[] args) {
	    for(int i = 0 ; i < TAM; i++){
	        for(int j = 0; j < TAM; j++){
	            matriz[i][j] = i * j;
	        }
	    }
	    System.out.println("------------------Soma da linha 4 ----------------");
	      
	    for(int i = 0; i < matriz.length; i++){
	        for(int j = 0; j < matriz[i].length; j++){
	            System.out.print(matriz[i][j] + "   ");
	        }
	        System.out.println("");
	    }
	    for(int cont = 0 ; cont < TAM; cont++){
	        soma += matriz[3][cont];
	    }
	    System.out.println("Soma da linha 4: " + soma);
	    
	    System.out.println("------------------Soma da coluna 2 ----------------");
	    soma = 0;
	    
	     for(int i = 0; i < matriz.length; i++){
	        for(int j = 0; j < matriz[i].length; j++){
	            System.out.print(matriz[i][j] + "   ");
	        }
	        System.out.println("");
	    }
	    
	    for(int cont = 0; cont < TAM; cont++){
	        soma += matriz[cont][1];
	    }
	    System.out.println("Soma da coluna 2: " + soma);
	    System.out.println("------------------Soma da diagonal princpal ----------------");
	    soma = 0;
	    for(int i = 0; i < matriz.length; i++){
	        for(int j = 0; j < matriz[i].length; j++){
	            System.out.print(matriz[i][j] + "   ");
	        }
	        System.out.println("");
	    }
	    for(int cont = 0; cont < TAM; cont ++){
	        if(cont == cont)
	        soma += matriz[cont][cont];
	    }
	    System.out.println("Soma da diagonal principal: "+ soma);
	    System.out.println("------------------Soma da diagonal secundaria ----------------");
	     soma = 0;
	     for(int i = 0; i < matriz.length; i++){
	        for(int j = 0; j < matriz[i].length; j++){
	            System.out.print(matriz[i][j] + "   ");
	        }
	        System.out.println("");
	    }
	    
	    int tam = 5;
	    for(int i = 0; i < matriz.length; i++){
	        soma += matriz[i][tam-1];
	        tam--;
	    }
	    System.out.println("Soma da diagonal secundaria: " + soma);
	    
	     System.out.println("------------------Soma de todos elementos ----------------");
	     soma = 0;
	     for(int i = 0; i < matriz.length; i++){
	        for(int j = 0; j < matriz[i].length; j++){
	            System.out.print(matriz[i][j] + "   ");
	        }
	        System.out.println("");
	    }
	    
	     for (int i = 0; i < matriz.length; i++){
	         for (int j = 0; j < matriz.length; j++){
	             soma += matriz[i][j];
	         }
	     }
	     System.out.println("Soma de todos elementos: " + soma);
	}
}

