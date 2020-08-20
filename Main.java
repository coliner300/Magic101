public class Main {
  public static void main(String[] args) 
  {
    //create an object
    Dragon happy = new Dragon("Happy", 20, false, true, 1.2);
    Dragon nobody = new Dragon();
    Slime hello = new Slime("Goop", 5, false, false);
    Monster ogre = new Monster("Geo", 15, true, "air");
    Monster nothing = new Monster();

    Enemy[] enemyList = {happy, nobody, ogre, nothing};


    // System.out.println(ogre.mightReact());
    // System.out.println(nothing.mightReact());
    // System.out.println(ogre.compareTerrain());
    // System.out.println(nothing.compareTerrain());

    // System.out.println();
    // for (Enemy e: enemyList)
    // {
    //   System.out.println(e.toString());
    //   System.out.println();
    // } //end loop to print out the list of enemies

    //print out the object via toString
    // System.out.println(happy.toString());
     System.out.println(nobody.toString());
    // System.out.println(hello.toString());
    // System.out.println(ogre.toString());

    // //test getters and setters
    // happy.setName("Sad");
    // System.out.println();
    // System.out.println("Happy is now called " + happy.getName());
    // System.out.println(happy.toString());

  }//end main method
}//end driver class