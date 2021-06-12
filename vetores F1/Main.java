public class Main {
    public static void main(String[] args) {
        F1 f[] = new F1[10];
        for(int i = 0; i < f.length; i++){
            f[i] = new F1();
        }
        f[0].cadastra("Red Bull", "Verstappen", "Perez", "Honda",
                "Macio", "Preto");
        f[1].cadastra("Ferrari", "Leclerc", "Sainz", "Ferrari",
                "Macio", "Vermelho");
        f[2].cadastra("Mercedes", "Hamilton", "Botas", "Mercedes",
                "Macio", "Prata");
        f[3].cadastra("Alpha Tauri", "Gasly", "Tsunoda", "Honda",
                "Macio", "Branca");
        for (int i = 0; i < f.length; i++){
            System.out.println(f[i].imprimeDados());
        }

    }
}
