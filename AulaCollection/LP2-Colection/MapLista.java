import java.util.*;

public class MapLista {
    Map<Integer, Integer> map;

    public MapLista() {
        this.map = new HashMap<>();
    }

    public void adcUltimaPosicao(int chave, int numero) {
        this.map.put(chave, numero);
    }

    public void removerElemento(int chave) {
        this.map.remove(chave);
    }

    public Map<Integer,Integer> getMap() {
        Map novoMap = map;
        return novoMap;
    }

    public int tamanho() {
        return map.size();
    }

    public void ordernarAsc() {
        Map novoMap = map;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(novoMap.entrySet());
        list.sort(Map.Entry.comparingByKey());
        list.forEach(System.out::println);
    }

}