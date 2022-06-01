class Main {
  public static void main(String[] args) {
    IntLista numeroLista = new IntLista();

    numeroLista.adcUltimaPosicao(2);
    numeroLista.adcUltimaPosicao(7);
    numeroLista.adcUltimaPosicao(1);

    System.out.println(numeroLista.buscarPorNumero(1));
    System.out.println(numeroLista.buscarPorPosicao(1));

/*
    System.out.println(numeroLista.getIntLista());
    System.out.println (numeroLista.tamanho());

    System.out.println(numeroLista.buscarPosicao(2));
    System.out.println(numeroLista.buscarNumero(7));
    numeroLista.removerPosicao(2);
    System.out.println(numeroLista.getIntLista());*/
  }
}