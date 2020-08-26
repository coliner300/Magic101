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
      return "\nThat is the very rare slime color, it gains 5 might. " + name + "'s new might is " + might;
    }//end else
    else if(color.equalsIgnoreCase("Blue"))
    {
      might = might + 2;
      return "\nThat is the rare slime color, it gains 2 might. " + name + "'s new might is " + might;
    }//end else if
    else
    {
      return "\nThis is the common color slime, it gains no might.";
    }//end else
  }//end colorMatters

  public String solidOrNot()
  {
    if(isSolid == true)
    {
      return "\nYou are lucky, the slime cannot go into a liquid state, and hide.";
    }//end if
    else
    {
      return "\nThe slime can go into liquid form and wrap around you, if you don't run, you cannot beat it.";
    }//end else
  }//end solidOrNot

  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nSolid: " + isSolid;
  }//end toString(only one)
}//end dragon class

