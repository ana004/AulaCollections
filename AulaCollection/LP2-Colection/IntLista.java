import java.util.*;


public class IntLista<T> {
    List<Integer> lista = new ArrayList<Integer>(); //arraylist criado
    Vector<Integer> vectStr = new Vector<Integer>(lista); //classe Vector contém mais funções que List, e a lista está dentro de Vector
    Collection<Integer> collection = Collections.synchronizedList(vectStr); // Collection permite organizar essas listas
    Iterator<Integer> iterator = collection.iterator();
    Map<Integer, Integer> map = new HashMap<>();

    
    public IntLista() {
      
    }

    // public void adcEscolhida(int numero, int posicao) {
    //   collection.(posicao, numero);
    // }

    public void adcUltimaPosicao(int numero) {
      this.vectStr.add(numero);
    }

    public void removerNumero(int posicao) {
      this.vectStr.remove(posicao);
    }

    public int buscarPorNumero(int numero) { 
       
    for (int i = 0; i < vectStr.size(); i++) {
      if (vectStr.elementAt(i) == numero)
      return i;
    }
      return -1;
    }

     public int buscarPorPosicao(int posicao) {
       return this.vectStr.get(posicao);
    }

    public List<T> ordernarAsc(Collection<Integer> list) {
      return list.sort(Comparator.naturalOrder());
      }
      
    }

    public int tamanho() {
        return lista.size();
    }
}
