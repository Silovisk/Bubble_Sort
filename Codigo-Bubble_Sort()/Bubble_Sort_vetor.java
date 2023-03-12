public void ordena_BubbleSort() {
  MsgVetor.msg_central("BubbleSort");

  int tamanho_vetor = this.getTamanho();

  boolean trocou = true;

  while (trocou) {
    trocou = false;
    for (int i = 1; i < tamanho_vetor; i++) // percorre vetor
    {
      if (this.vetor[i - 1] > this.vetor[i]) // se o atual for maior que proximo
      {
        int aux = this.vetor[i]; // guarda o valor atual
        this.vetor[i] = this.vetor[i - 1]; // move o proximo para o atual
        this.vetor[i - 1] = aux; // o anterior recebe o valor guardado

        trocou = true;
      }
    }
    tamanho_vetor--; //reduz tamanho do vetor
  }
}
