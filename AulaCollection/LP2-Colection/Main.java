import java.util.Collection;

/**
 * Ana Paula - SP3044505
 * Cauã Santos - SP3048918
 * Gustavo Santos - SP3044491
 * Isabella Valerio - SP3045463
 */

class Main {
    public static void main(String[] args) {

        //TESTANDO A CLASSE MAPLISTASTRING
        MapListaString numeroMap = new MapListaString();

        numeroMap.adcPosicao(1, "Isa");
        numeroMap.adcPosicao(10, "Flor");
        numeroMap.adcPosicao(6, "palavra");
        numeroMap.getMap();
        numeroMap.tamanho();
        numeroMap.removerElemento(6);
        numeroMap.getMap();
        numeroMap.tamanho();
        numeroMap.ordernarAsc();


       // TESTANDO LINKED LIST
        LinkedLista numeroLinked = new LinkedLista();
        numeroLinked.adcPrimeiraPosicao(1);
        numeroLinked.adcUltimaPosicao(2);
        numeroLinked.adcUltimaPosicao(3);
        numeroLinked.adcUltimaPosicao(4);
        numeroLinked.adcUltimaPosicao(5);
        numeroLinked.getLinkedLista();
        numeroLinked.removerPrimeiraPosicao();
        numeroLinked.getLinkedLista();
        numeroLinked.removerUltimaPosicao();
        numeroLinked.getLinkedLista();
        numeroLinked.tamanho();
        numeroLinked.buscarPosicao(1);
        numeroLinked.limpar();
        numeroLinked.getLinkedLista();

        //TESTANTO INT LISTA
        IntLista numeroLista = new IntLista();

        numeroLista.adcUltimaPosicao(10);
        numeroLista.adcUltimaPosicao(9);
        numeroLista.adcUltimaPosicao(8);
        numeroLista.adcPosicaoEscolhida(1, 0);
        numeroLista.tamanho();
        numeroLista.getLista();
        numeroLista.ordernarAsc();
        numeroLista.getLista();
        numeroLista.ordernarDesc();
        numeroLista.getLista();
        numeroLista.buscarElemento(1);
        numeroLista.buscarPosicao(1);
        numeroLista.tamanho();
        numeroLista.adcUltimaPosicao(1);
        numeroLista.getLista();
        numeroLista.tamanho();
        numeroLista.ordernarAsc();
        numeroLista.buscarPosicao(2);
        numeroLista.buscarElemento(0);
        numeroLista.removerElemento(10);
        numeroLista.getLista();


        //TESTANDO STRINGLISTA
        StringLista stringElemento = new StringLista();
        stringElemento.adcUltimaPosicao("Abacaxi");
        stringElemento.adcUltimaPosicao("Kiwi");
        stringElemento.adcUltimaPosicao("Melão");
        stringElemento.adcUltimaPosicao("Cereja");
        stringElemento.adcUltimaPosicao("Banana");
        stringElemento.adcUltimaPosicao("Melancia");
        stringElemento.adcPosicaoEscolhida(3, "Tomate");
        stringElemento.getStringLista();
        stringElemento.tamanho();
        stringElemento.ordernarAsc();
        stringElemento.getStringLista();
        stringElemento.ordernarDesc();
        stringElemento.getStringLista();
        stringElemento.removerElemento("Cereja");
        stringElemento.getStringLista();
        stringElemento.tamanho();
        stringElemento.buscarPosicao("Abacaxi");
        stringElemento.buscarElemento(3);
    }
}