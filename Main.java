class Main {
  public static void main(String[] args) {
    Cajado cajado = new Cajado();

    PedraElemento pedra1 = new PedraFogo();
    PedraElemento pedra2 = new PedraFogo();
    cajado.executarPoderElemental(pedra1, pedra2);

    pedra1 = new PedraFogo();
    pedra2 = new PedraAr();
    cajado.executarPoderElemental(pedra1, pedra2);

    pedra1 = new PedraFogo();
    pedra2 = new PedraTerra();
    cajado.executarPoderElemental(pedra1, pedra2);

    pedra1 = new PedraTerra();
    pedra2 = new PedraAgua();
    cajado.executarPoderElemental(pedra1, pedra2);

    pedra1 = new PedraAgua();
    pedra2 = new PedraAr();
    cajado.executarPoderElemental(pedra1, pedra2);
  }
}
