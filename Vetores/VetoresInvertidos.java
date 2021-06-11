public class VetoresTrocados {

	public static void main(String[] args) {
		int posicao = 20;
	
		int vetor[] = new int[posicao];
		//Atribuindo valores para o vetor
		for (int i = 0; i < posicao; i++) {
			vetor[i] = i * 5;
			System.out.println("vetor na posição " + i + ": " + vetor[i]);
		}
		int inversor;
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < i; j++) {
				inversor = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = inversor;
			}
			System.out.println("***********Resultado*************");
			for(int j = 0; j < 20; j++) {
				System.out.println("Vetor na posição " + j + ": " + vetor[j]);
			}
		}
		
	}

}

