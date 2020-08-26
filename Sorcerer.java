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
      return "\nYou are now stylish and some monsters may not attack because of your hat.";
    }//end if
    else
    {
      return "\nMonsters are more likely to attack because you don't have a stylish hat.";
    }//end else
  }//end stylish

  public String wandDamage()
  {
    if(wand == true)
    {
      might++;
      return "\nYou have gained might because of your wand.\nYour might is now: " + might;
    }//end if
    else
    { 
      return "\nYou don't have a wand, so you stay at your might.";
    }//end else
  }//end wandDamage

  //getters
  public String getSorcererName()
  {
    return name;
  }//end getName
  public int getSorcererMight()
  {
    return might;
  }//end getMight
  public double getSorcererHealth()
  {
    return health;
  }//end getHealth
  //setters
  public void setSorcererName(String name)
  {
    this.name = name;
  } //end setname
  public void setSorcererMight(int might)
  {
     this.might = might;
  }//end setMight
  public void setSorcererHealth(double health)
  {
    this.health = health;
  }//end getHealth

  //toString
  public String toString()
  {
    return "\nSorcerer name: " + name + "\nPointy Hat: " + pointyHat + "\nHealth: " + health + "\nMight: " + might;
  }//end toString
}//end sorcerer class