public abstract class Enemy
{
    String name;
    int might;
    boolean isHostile;
    static int countEnemies = 0;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
        countEnemies++;
    }// end full constructor Enemy

    public Enemy()
    {
        this.name = null;
        this.might = 0;
        this.isHostile = true;
        countEnemies++;
    }// end Enemy


    //getters
    public String getName()
    {
        return name;
    }//end getname

    public int getMight()
    {
        return might;
    }// end getMight

    //setters
    public void setName(String name)
    {
        this.name = name;
    } //end setname

    public void setMight(int might)
    {
        this.might = might;
    }


    public String toString()
    {
        return "\nEnemy: " + name + "\nMight: " + might + "\nHostile: " + isHostile;
    } // end toString (there is only one!)
}//end class Enemy