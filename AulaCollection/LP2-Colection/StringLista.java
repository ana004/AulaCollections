import java.util.*; 

public class StringLista {
  
ArrayList<String> lista = new ArrayList<String>();


  // Para string!!
public void adicionarElementoNaPosicao(int posicao, String elemento)
  {
   lista.add(posicao, elemento);
  }

public void adicionarElementoUltimaPosicao(String elemento){
  lista.add(elemento);
}

public void removerElementoNaPosicao(int posicao){
  lista.remove (posicao);
}

public String encontrarElementoNaPosicao (int posicao)
  {
    return lista.get(posicao);
  }


public int encontrarEmQualPosicaoEstaOElemento(String elemento)
  {
int indexOf = lista.indexOf(elemento);

return indexOf;
 }

public int tamanho()  {
  return lista.size();
}
}

