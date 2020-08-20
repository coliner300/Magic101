public class Dragon extends Enemy
{
  //instance variables
  boolean hasFire;
  double wingspan;

  //constructors
  public Dragon(String name, int might, boolean isHostile, boolean hasFire, double wingspan)
  {
    super(name, might, isHostile);
    this.hasFire = hasFire;
    this.wingspan = validateWingspan(wingspan);
  }//end full constructor dragon

  public Dragon()
  {
    super();
    hasFire = false;
    this.wingspan = 0;
  }//end dragon

  //getters
  //Brain Methods
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

