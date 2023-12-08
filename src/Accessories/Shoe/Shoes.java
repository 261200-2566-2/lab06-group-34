package Accessories.Shoe;

public class Shoes {
    public int lvl = 1;
    public double basespeed;
    public double Shoesspeed;
    protected double baseATK;
    protected double Shoeatk;
    /**
     * set Shoe's speed
     * @param basespeed  to set Shoe's speed
     * effect : set Shoe's speed to this basespeed and Shoe's basespeed to this basespeed
     */
    public Shoes(double basespeed){
        this.basespeed = basespeed;
        Shoesspeed = basespeed;
    }
    /**
     * Get Shoe's speed
     * @return Shoesspeed is speed of this Shoe
     */
    public int Speed(){
        return (int)(Shoesspeed);
    }
    /**
     * Shoe level UP
     * effect : Sword level + 1
     *         recalculate Shoe's speed
     *         print congratulation for Shoe level up
     */
    public void lvlUP(){
        lvl++;
        Shoesspeed = basespeed * (1 + 0.05 * lvl);
        System.out.println("Congrat! your shoes is level UP!!");
    }
    public int atkShoe(){
        return (int)(Shoeatk);
    }
}

