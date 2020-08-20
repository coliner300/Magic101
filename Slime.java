public class Slime extends Enemy
{
  //instance variables
  boolean isSolid;

  //constructors
  public Slime(String name, int might, boolean isHostile, boolean isSolid)
  {
    super(name, might, isHostile);
    this.isSolid = isSolid;
  }//end full constructor

  public Slime()
  {
    super();
    isSolid = false;
  }

  //getters


  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nSolid: " + isSolid;
  }//end toString(only one)
}//end dragon class

