
package estrutura.de.dados.exercicios;


    
public class Atleta{
	private String nome;
	private double altura;
	private double peso;
	private String esporte;
	private String patrocinadores;
	
	public Atleta() {
		nome = "";
		altura = 0.0;
		peso  = 0.0;
		esporte = "";
		patrocinadores = "";
	
	}
	
	public Atleta(String nom, double alt, double peso, String esporte,
			String patrocinador) {
		this.nome = nom;
		this.altura = alt;
		this.peso = peso;
		this.esporte = esporte;
		this.patrocinadores = patrocinador;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(String patrocinadores) {
		this.patrocinadores = patrocinadores;
	}


        @Override
	public String toString() {
		return "Atleta [nome=" + nome + ", altura=" + altura + 
				", peso=" + peso + ", esporte=" + esporte
				+ ", patrocinadores=" + patrocinadores + "]";
	
	}
	
	
}


