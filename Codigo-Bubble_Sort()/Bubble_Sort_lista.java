public void ordena_bubble() {
  Msg.msg_central("Bubble Sort.");
  boolean trocou; // pra ver se houve troca
  do {
    trocou = false; // inicializa sem troca

    NohNumeros atual = this.primeiro; // a variavel auxiliar começa pelo primeiro nó da lista

    while (atual != null && atual.getProximo() != null) // loop enquanto nao chegar no final
    {
      if (atual.getNumero() > atual.getProximo().getNumero()) // ve se os elementos estao fora de ordem
      {
        int aux = atual.getNumero(); // guarda o valor atual
        atual.setNumero(atual.getProximo().getNumero()); // o  atual recebe o valor do proximo
        atual.getProximo().setNumero(aux); // o proximo recebe o valor guardado
        trocou = true;
      }
      atual = atual.getProximo(); // passa pro proximo da lista
    }
  } while (trocou);
}
