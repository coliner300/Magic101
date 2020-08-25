public class Sorcerer
{
  //instance variables
  String name;
  boolean pointyHat;
  double health;
  int might;

  //constructors
  public Sorcerer(String name, boolean pointyHat, double health, int might)
  {
    this.name = name;
    this.pointyHat = pointyHat;
    this.health = health;
    this.might = might;
  }//end 
  public 

  //getters

  //setters

  //toString
  public String toString()
  {
    return "\nSorcerer name: " + name + "\nPointy Hat: " + pointyHat + "\nHealth: " + health + "\nMight: " + might;
  }//end toString
}//end sorcerer class