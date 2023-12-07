package Weapon;

public class Shield {
    /**
     * set Shield level = 1
     */
    public int lvl = 1;
    /**
     * Shield's base defense
     */
    public double baseDEF;
    /**
     * Shield current defense
     */
    public double shieldDEF;
    /**
     * create a Shield with base defense
     * @param baseDEF double to set Shield base defense
     * effect : set Shield base defense to this base defense
     *          set Shield defense to base defense
     */
    public Shield(double baseDEF){
        this.baseDEF = baseDEF;
        shieldDEF = baseDEF;
    }
    /**
     * decrease speed while equipping Shield
     * @return decreased Speed
     */
    public int SpeedDecrease(){
        return (int)(10 * (0.1 + 0.08 * lvl));
    }
    /**
     * Shield level up
     * effect : Shield level + 1
     *          recalculate Shield defense
     *          print congratulation for Shield level up
     */
    public void lvlUP(){
        lvl++;
        shieldDEF = baseDEF*(1 + 0.05*lvl);
        System.out.println("Congrats! your shield is level UP!!");
    }
}