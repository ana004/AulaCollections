import java.util.LinkedList;

public class LinkedLista {
    LinkedList<Integer> listaLinked;

    public LinkedLista() {
        this.listaLinked = new LinkedList<Integer>();
    }

    public void adcPrimeiraPosicao(int numero) {
        listaLinked.addFirst(numero);
    }

    public void adcUltimaPosicao(int numero) {
        listaLinked.addLast(numero);
    }

    public void removerPrimeiraPosicao() {
        listaLinked.removeFirst();
    }

    public void removerUltimaPosicao() {
        listaLinked.removeLast();
    }

    public int buscarPosicao(int elemento) {
        return listaLinked.get(elemento);
    }

    public LinkedList<Integer> getLinkedLista() {
        return this.listaLinked;
    }

    public void limpar() {
        listaLinked.clear();
    }

    public int tamanho() {
        return listaLinked.size();
    }
}
