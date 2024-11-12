package ArvoreSintatica;

public class Arvore<TIPO> {
    private Elemento<TIPO> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionar (TIPO elemento) {
        Elemento<TIPO> novoElemento = new Elemento<>(elemento);
        if (raiz == null) {
            this.raiz = novoElemento;
        } else {

        }
    }
}
