public class Besitzer{
  private double geld;
  private String name;
  private Roller roller;
  
  public Besitzer(double geld, String name, Roller roller){
    this.geld = geld;
    this.name = name;
    this.roller = roller;
  }
  public double getGeld(){
    return geld;
  }
  public void FahreDeinenRoller(int strecke){
    roller.fahre(strecke);
  }
  public boolean tankeDeinenRoller(double menge){
    if (roller.passtInTank(menge)){
      roller.tanke(menge);
      return true;
    }
    return false;
  }
  public void erhalteTaschenGeld(double summe){
    geld = geld + summe;
  }
  public void prostitution(double summe){
    geld = geld + summe; 
  }
}
