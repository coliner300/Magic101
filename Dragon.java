public class Dragon extends Enemy
{
  //instance variables
  boolean hasFire;
  int speed;
  double wingspan;
  boolean spikes;
  static int dragonPower = 0;

  //constructors
  public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan, boolean spikes, int speed)
  {
    super(name, might, isHostile);
    this.hasFire = hasFire;
    this.wingspan = validateWingspan(wingspan);
    this.spikes = spikes;
    this.speed = speed;
    dragonPower++;
  }//end full constructor dragon

  public Dragon()
  {
    super();
    hasFire = false;
    spikes = false;
    speed = 10;
    this.wingspan = 0;
    dragonPower++;
  }//end dragon

  //getters
  //Brain Methods

  public String fireStrengthen()
  {
    if(hasFire == true)
    {
      might = might +5;
      return "\nThe strength of the dragon " + name + " has increased due to fire. His new might is " + might;
    }
    else
    {
      return "The dragon has not been strengthened because he doesn't have fire.";
    }
  }

  public String spikes()

  public 

  //Data Validation

  public double validateWingspan(double wingspan)
  {
    while (wingspan < 0)
    {
      System.out.println("You can't have negative wings");
      wingspan++; //cheater until Scanner is used
    }

    return wingspan;
  }//end method validateWingspan

  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nFire: " + hasFire + "\nWingspan: " + wingspan;
  }//end toString(only one)
}//end dragon class

