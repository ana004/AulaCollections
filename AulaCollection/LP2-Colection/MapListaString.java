import java.util.*;

public class MapListaString {
    Map<Integer, String> map;

    public MapListaString() {
        this.map = new HashMap<>();
    }

    public void adcPosicao(int chave, String elemento) {
        this.map.put(chave, elemento);
    }

    public void removerElemento(int chave) {
        this.map.remove(chave);
    }

    public Map<Integer, String> getMap() {
        Map novoMap = map;
        return novoMap;
    }

    public int tamanho() {
        return map.size();
    }

    public void ordernarAsc() {
        Map novoMap = map;
        List<Map.Entry<String, String>> list = new ArrayList<>(novoMap.entrySet());
        list.sort(Map.Entry.comparingByKey());
        list.forEach(System.out::println);
    }

}