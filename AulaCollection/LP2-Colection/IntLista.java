import java.util.*;

public class IntLista {
    List<Integer> lista; // arraylist criado
    Vector<Integer> vectStr; // classe Vector contém mais funções que List, e a lista está dentro de Vector

    public IntLista() {
        this.lista = new ArrayList<Integer>();
        this.vectStr = new Vector<Integer>(lista);
    }

    public void adcPosicaoEscolhida(int posicao, int elemento) {
        vectStr.add(posicao, elemento);
    }

    public void adcUltimaPosicao(int elemento) {
        this.vectStr.add(elemento);
    }

    public void removerElemento(int elemento) { // passa o elemento, e por meio do buscarPosição ele remove o elemento na posição do elemento
        vectStr.remove(buscarPosicao(elemento));
    }

    public int buscarPosicao(int elemento) {
        for (int i = 0; i < vectStr.size(); i++) {
            if (vectStr.elementAt(i) == elemento)
                return i;
        }
        return -1;
    }

    public int buscarElemento(int posicao) {
        return this.vectStr.get(posicao);
    }

    public List ordernarAsc() {
        Vector novoVectStr = new Vector();
        novoVectStr = (Vector) vectStr.clone();

        Collections.sort(novoVectStr);
        return novoVectStr;
    }

    public List ordernarDesc() {
        Vector novoVectStr = new Vector();
        novoVectStr = (Vector) vectStr.clone();

        Collections.reverse(novoVectStr);
        return novoVectStr;
    }

    public int tamanho() {
        return vectStr.size();
    }

    public void getLista() {
        Iterator<Integer> lista = vectStr.iterator();

        while (lista.hasNext()) {
            Integer novaLista = lista.next();
            System.out.println(novaLista);
        }
    }
}
