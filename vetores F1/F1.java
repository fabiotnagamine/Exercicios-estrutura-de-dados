public class F1 {
    String nomeEquipe, piloto1, piloto2, fabricanteMotor, pneus, corPredominante;
    float peso;
    int cont = 10;

    //Método que imprime os dados da equipe;
    String imprimeDados(){
        return "Nome da equipe: " + this.nomeEquipe + "\n" + "Piloto principal: " + this.piloto1 + "\n" +
                "Piloto secundário: " + this.piloto2 + "\n" + "Fabricante do motor: " + this.fabricanteMotor +
                "\n" +  "Pneus: " + this.pneus + "\n" + "Cor predominante: " + this.corPredominante + "\n";

    }

    void cadastra(String nomeEquipe, String piloto1, String piloto2, String fabricanteMotor, String pneus, String
                  corPredominante){
        this.nomeEquipe =nomeEquipe;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.fabricanteMotor = fabricanteMotor;
        this.pneus = pneus;
        this.corPredominante = corPredominante;
    }
}
