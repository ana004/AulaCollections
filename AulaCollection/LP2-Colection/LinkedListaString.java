import java.util.LinkedList;

public class LinkedListaString {
    LinkedList<String> listaLinked;

    public LinkedListaString() {
        this.listaLinked = new LinkedList<String>();
    }

    public void adcPrimeiraPosicao(String elemento) {
        listaLinked.addFirst(elemento);
    }

    public void adcUltimaPosicao(String elemento) {
        listaLinked.addLast(elemento);
    }

    public void removerPrimeiraPosicao() {
        listaLinked.removeFirst();
    }

    public void removerUltimaPosicao() {
        listaLinked.removeLast();
    }

    public String buscarPosicao(int posicao) {
        return listaLinked.get(posicao);
    }

    public LinkedList<String> getLinkedLista() {
        return this.listaLinked;
    }

    public void limpar() {
        listaLinked.clear();
    }

    public int tamanho() {
        return listaLinked.size();
    }
}
