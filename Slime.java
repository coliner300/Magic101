public class Slime extends Enemy
{
  //instance variables
  boolean isSolid;
  static int maxSize = 0;

  //constructors
  public Slime(String name, int might, boolean isHostile, boolean isSolid)
  {
    super(name, might, isHostile);
    this.isSolid = isSolid;
    maxSize++;
  }//end full constructor Slime

  public Slime()
  {
    super();
    isSolid = false;
    maxSize++;
  }//end Slime

  //brain methods


  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nSolid: " + isSolid;
  }//end toString(only one)
}//end dragon class

