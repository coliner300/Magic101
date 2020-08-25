public class Sorcerer
{
  //instance variables
  String name;
  boolean pointyHat;
  double health;
  int might;
  boolean wand;

  //constructors
  public Sorcerer(String name, boolean pointyHat, double health, int might, boolean wand)
  {
    this.name = name;
    this.pointyHat = pointyHat;
    this.health = health;
    this.might = might;
    this.wand = wand;
  }//end full constructor
  public Sorcerer()
  {
    this.name = null;
    this.pointyHat = false;
    this.health = 20.0;
    this.might = 5;
    this.wand = false;
  }//end sorcerer

  //brain methods
  public String stylish()
  {
    if(pointyHat == true)
    {
      return "You are now stylish and some monsters may not attack because of your hat.";
    }//end if
    else
    {
      return "Monsters are more likely to attack because you don't have a stylish hat.";
    }//end else
  }//end stylish

  public String wandDamage()
  {
    if(wand == true)
    {
      might++;
      return "You have gained might because of your wand.\nYour might is now: " + might;
    }//end if
    else
    {
      return "You don't have a wand, so you stay at your might.";
    }//end else
  }//end wandDamage

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