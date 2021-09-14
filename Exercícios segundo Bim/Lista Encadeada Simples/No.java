
package estrutura.de.dados.exercicios;


public class No {
	Object objeto;
	No proximo;

	public No(Object objeto) {
		this.objeto = objeto;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

    @Override
    public String toString() {
        return objeto.toString();
    }
	
	
}
