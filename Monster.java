public class Monster extends Enemy
{
  //instance variables
  String terrain;
  static int armorCount = 0;

  //constructors
  public Monster(String name, int might, boolean isHostile, String terrain)
  {
    super(name, might, isHostile);
    this.terrain = terrain;
    armorCount++;
  }//end full constructor Monster

  public Monster()
  {
    super();
    terrain = "land";
    armorCount++;
  }//end Monster

  //brain methods
  public String mightReact()
  {
    if(might < 10)
    {
      return "\nThe monster is Weak!";
    }//end if
    else if(might >= 10 && might < 20)
    {
      return "\nThe monster is average in strength, Careful";
    }//end else if
    else //(might > 20)
    {
      return "\nThe monster is very strong, you better not fight it!";
    }//end else
  }//end mightReact

  public String compareTerrain()
  {
    if(terrain.equalsIgnoreCase("land"))
    {
      return "\nThe monster is on land, You can run away";
    }//end if
    else if(terrain.equalsIgnoreCase("Water"))
    {
      return "\nThe monster is in the water, You can swim away";
    }//end else if
    else //air animal
    {
      return "\nThe monster is in the air, Bummer for you!";
    }//end else
  }//end compareTerrain

  //getters


  //toString this is test output method
  public String toString()
  {
    return super.toString() + "\nTerrain: " + terrain;
  }//end toString(only one)
}//end dragon class

