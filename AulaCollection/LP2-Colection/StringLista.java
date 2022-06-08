import java.util.*;

public class StringLista {
    //falta criar o Arraylist e o VectStr
    //o código abaixo fica dentro das chaves dps de criar Array e Vect
    List<String> lista; // arraylist criado
    Vector<String> vectStr;

    public StringLista() {
        this.lista = new ArrayList<String>();
        this.vectStr = new Vector<String>(lista);
    }

    public void adcPosicaoEscolhida(int posicao, String elemento) {
        vectStr.add(posicao, elemento);
    }

    public void adcUltimaPosicao(String elemento) {
        this.vectStr.add(elemento);
    }

    public void removerElemento(String elemento) {
        vectStr.remove(buscarPosicao(elemento));
    }

    public int buscarPosicao(String elemento) {

        for (int i = 0; i < vectStr.size(); i++) {
            if (vectStr.elementAt(i).equals(elemento))
                return i;
        }
        return -1;
    }

    public String buscarElemento(int posicao) {
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

    public void getStringLista() {
        Iterator<String> lista = vectStr.iterator();

        while (lista.hasNext()) {
            String novaLista = lista.next();
            System.out.println(novaLista);
        }
    }

}

