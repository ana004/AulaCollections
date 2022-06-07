class Main {
    public static void main(String[] args) {
        //TESTANDO A CLASSE MAPLISTA
        MapLista numeroMap = new MapLista();

        numeroMap.adcUltimaPosicao(1, 1);
        numeroMap.adcUltimaPosicao(10, 3);
        numeroMap.adcUltimaPosicao(6, 7);

        System.out.println(numeroMap.getMap());
        System.out.println("Tamanho: " + numeroMap.tamanho());

        numeroMap.removerElemento(6);
        System.out.println(numeroMap.getMap());
        System.out.println("Tamanho: " + numeroMap.tamanho());

        numeroMap.ordernarAsc();
        System.out.println("\n\n");


//        // TESTANDO LINKED LIST
//        LinkedLista numeroLinked = new LinkedLista();
//
//        numeroLinked.adcPrimeiraPosicao(1);
//        numeroLinked.adcUltimaPosicao(2);
//        numeroLinked.adcUltimaPosicao(3);
//        numeroLinked.adcUltimaPosicao(4);
//        numeroLinked.adcUltimaPosicao(5);
//
//        System.out.println(numeroLinked.getLinkedLista());
//
//        numeroLinked.removerPrimeiraPosicao();
//
//        System.out.println(numeroLinked.getLinkedLista());
//
//        numeroLinked.removerUltimaPosicao();
//
//        System.out.println(numeroLinked.getLinkedLista());
//
//        System.out.println(numeroLinked.tamanho());
//
//        System.out.println(numeroLinked.buscarPosicao(1));
//
//        numeroLinked.limpar();
//
//        System.out.println(numeroLinked.getLinkedLista());
//
//        // TESTANTO INT LISTA
//        IntLista numeroLista = new IntLista();
//
//        numeroLista.adcUltimaPosicao(10);
//        numeroLista.adcUltimaPosicao(9);
//        numeroLista.adcUltimaPosicao(8);
//        numeroLista.adcPosicaoEscolhida(99, 0);
//        System.out.println("Tamanho da lista " + numeroLista.tamanho());
//        numeroLista.getLista();
//        System.out.println("********");
//        numeroLista.ordernarAsc();
//        numeroLista.getLista();
//        System.out.println("********");
//        numeroLista.ordernarDesc();
//        numeroLista.getLista();
//
//        System.out.println("Buscando por número: " + numeroLista.buscarElemento(1));
//        System.out.println("Buscando por posição: " + numeroLista.buscarPosicao(1));
//
//
//        System.out.println("Tamanho da lista " + numeroLista.tamanho());
//        numeroLista.adcUltimaPosicao(1);
//
//        numeroLista.getLista();
//
//
//        System.out.println("Tamanho da lista " + numeroLista.tamanho());
//
//        numeroLista.ordernarAsc();
//
//        System.out.println(numeroLista.buscarPosicao(2));
//        System.out.println(numeroLista.buscarElemento(7));
//        numeroLista.removerElemento(2);
//        numeroLista.getLista();
    }
}