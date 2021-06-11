

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		for (int i = 0; i <10; i++) {
			vetor1[i] = i;
		}
		for (int j = 0; j < 10; j++ ) {
			vetor2[j] = vetor1[j];
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor1 ["+ i +"]: " + vetor1[i]);
			System.out.println("Vetor2:["+ i +"]: " + vetor2[i]);
		}
	}

}
