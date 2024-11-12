package ArvoreSintatica;

public class Elemento<TIPO> {
    private TIPO elemento;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    Elemento(TIPO elemento) {
        this.elemento = elemento;
        this.esquerda = null;
        this.direita = null;
    }

    public TIPO getElemento() {
        return elemento;
    }

    public void setElemento(TIPO elemento) {
        this.elemento = elemento;
    }

    public Elemento<TIPO> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }

    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    }
}
