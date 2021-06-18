public class Main {
    static F1 carro[] = new F1[11];
    static int pontUltimo = -1;
    public static void insere(F1 f){
        if (pontUltimo+1 < carro.length) {
            pontUltimo++;
            carro[pontUltimo] = f;
        }
        }


    public static int buscarEquipe(String nomeEquipe){
        for (int i = 0; i <= pontUltimo; i++){
            if (carro[i].nomeEquipe.equals(nomeEquipe)){
                System.out.println("Posição: "+ i);
                return i;
            }
        }
        System.out.println("Equipe não encontrada");
        return -1;
    }
    public static void imprime(){
        for (int i = 0; i <= pontUltimo; i++){

        }
    }


    public static void main(String[] args){

        int pontUltimo;
        int cont = 11;
        F1 carro1 = new F1();

        carro1.cadastra("Mercedes", "Hamilton", "Bottas", "Mercedes",
                "Pirelli", "Prata", 650);
        insere(carro1);

        F1 carro2 = new F1();
        carro2.cadastra("Aston Martin", "Vettel", "Stroll", "Mercedes",
                "Pirelli", "Verde",655);
        insere(carro2);
        F1 carro3 = new F1();
        carro3.cadastra("Mclaren", "Ricciardo", "Norris", "Mercedes",
                "Pirelli", "Laranja", 650);
        insere(carro3);

        F1 carro4 = new F1();
        carro4.cadastra("Alpine", "Alonso","Ocon", "Renault", "Pirelli",
                "Preto", 645);
        insere(carro4);

        F1 carro5 = new F1();
        carro5.cadastra("Hass", "Schummacher",  "Mazevin", "Ferrari",
                "Pìrelli", "Branco", 660);
        insere(carro5);

        F1 carro6 = new F1();
        carro6.cadastra("Alpha Romeo", "Raikkonen", "Giovinazzi", "Ferrari",
                "Pirelli", "Vermelho", 640);
        insere(carro6);

        F1 carro7 =  new F1();
        carro7.cadastra("Alpha Tauri", "Tsunoda", "Gasly", "Honda",
                "Pirelli", "Branco", 640);
        insere(carro7);

        F1 carro8= new F1();
        carro8.cadastra("Willians", "Russel", "Latifi", "Mercedes",
                "Pirelli", "Azul e Vermelho", 640);
        insere(carro8);

        F1 carro9 = new F1();
        carro9.cadastra("Red Bull", "Verstappen", "Perez", "Honda", "Pirelli",
        "Preto e Vermelho", 630);
        insere(carro9);

        F1 carro10 = new F1();
        carro10.cadastra("Ferrari", "Leclerc","Sainz", "Ferrari",
                "Pirelli", "Vermelho", 630);
        insere(carro10);
        System.out.println("Busca, dados: "+ carro[buscarEquipe("Ferrari")].imprimeDados());
    }

}
