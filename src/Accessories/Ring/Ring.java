package Accessories.Ring;

public class Ring {
    double Ringatk;
    double baseatk;
    int lvl = 1;
    /**
     * set Ring's attack
     * @param atk  to set Ring's attack
     * effect : set Ring's atk to this atk and Ring's baseatk to this atk
     */
    public Ring(double atk){
        Ringatk = atk;
        baseatk = atk;
    }
    /**
     * Get Ring's attack
     * @return Ringatk is attack of the ring
     */
    public int atkring(){
        return (int)(Ringatk);
    }
    /**
     * Ring level UP
     * effect : Ring level + 1
     *         recalculate Ring's atk
     *         print congratulation for Ring level up
     */
    public void lvlUP(){
        lvl++;
        Ringatk = baseatk * (1 + 0.05 * lvl);
        System.out.println("Congrat! your ring is level UP!!");
    }
}
