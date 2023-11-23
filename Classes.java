class PedraElemento{
  public int Forca; 
  public String Tipo; 
  

  public PedraElemento(String Tipo, int Forca){
    this.Tipo = Tipo;
    this.Forca = Forca;
  }
}

class PedraFogo extends PedraElemento{
  public PedraFogo(){
    super("Fogo", 1);
  }
}

class PedraAgua extends PedraElemento{
  public PedraAgua(){
    super("Água", 2);
  }
}

class PedraAr extends PedraElemento{
  public PedraAr(){
    super("Ar", 3);
  }
}

class PedraTerra extends PedraElemento{
  public PedraTerra(){
    super("Terra", 4);
  }
}

class Cajado {
  public void executarPoderElemental(PedraElemento pedra1, PedraElemento pedra2) {
  if (pedra1.Tipo.equals(pedra2.Tipo)) {
    System.out.println("Poder: " + pedra1.Tipo); }
    
  if ((pedra1.Tipo.equals("Fogo") && pedra2.Tipo.equals("Ar")) || (pedra1.Tipo.equals("Ar") && pedra2.Tipo.equals("Fogo"))) {
    System.out.println("Fogo + Ar - Poder: Combustão"); }
    
  if ((pedra1.Tipo.equals("Fogo") && pedra2.Tipo.equals("Terra")) || (pedra1.Tipo.equals("Terra") && pedra2.Tipo.equals("Fogo"))) {
    System.out.println("Fogo + Terra - Poder: Lava"); }
    
  if ((pedra1.Tipo.equals("Terra") && pedra2.Tipo.equals("Água")) || (pedra1.Tipo.equals("Água") && pedra2.Tipo.equals("Terra"))) {
    System.out.println("Terra + Água - Poder: Planta"); }
    
  if ((pedra1.Tipo.equals("Água") && pedra2.Tipo.equals("Ar")) || (pedra1.Tipo.equals("Ar") && pedra2.Tipo.equals("Água"))) {
    System.out.println("Água + Ar - Poder: Neve"); }
    
    }
  }
