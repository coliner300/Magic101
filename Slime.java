public class Slime extends Enemy
{
  //instance variables
  boolean isSolid;
  String color;
  static int maxSize = 0;

  //constructors
  public Slime(String name, int might, boolean isHostile, boolean isSolid, String color)
  {
    super(name, might, isHostile);
    this.isSolid = isSolid;
    this.color = color;
    maxSize++;
  }//end full constructor Slime

  public Slime()
  {
    super();
    isSolid = false;
    color = "Green";
    maxSize++;
  }//end Slime

  //brain methods
  //public String 
  public String colorMatters()
  {
    if(color.equalsIgnoreCase("Purple"))
    {
      might = might + 5;
      return "\nThat is the very rare slime color, it gains 5 might." + name + "'s new might is " + might;
    }
    else if(color.equalsIgnoreCase("Blue"))
    {
      might = might + 2;
      return "\nThat is the rare slime color, it gains 2 might." + name + "'s new might is " + might;
    }
    else
    {
      return "\nThis is the common color slime, it gains no might.";
    }
  }

  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nSolid: " + isSolid;
  }//end toString(only one)
}//end dragon class

