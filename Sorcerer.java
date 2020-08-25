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
  }//end full constructor
  public Sorcerer()
  {
    this.name = null;
    this.pointyHat = true;
    this.health = 20.0;
    this.might = 5;
  }//end sorcerer

  //getters
  public String getName()
  {
    return name;
  }//end getName
  public int getMight()
  {
    return might;
  }//end getMight
  //setters
  public void setName(String name)
  {
    this.name = name;
  } //end setname
  public void setMight(int might)
  {
     this.might = might;
  }//end setMight

  //toString
  public String toString()
  {
    return "\nSorcerer name: " + name + "\nPointy Hat: " + pointyHat + "\nHealth: " + health + "\nMight: " + might;
  }//end toString
}//end sorcerer class