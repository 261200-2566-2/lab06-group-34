package Weapon;

public class Sword {
    /**
     * set Sword level = 1
     */
    public int lvl = 1;
    /**
     * Sword's base damage
     */
    public double baseATK;
    /**
     * Sword current damage
     */
    public double swordATK;
    /**
     * create a Sword with base attack
     * @param baseATK double to set Sword base attack
     * effect : set Sword base attack to this base attack
     *          set Sword attack to base attack
     */
    public Sword(double baseATK){
        this.baseATK = baseATK;
        swordATK = baseATK;
    }
    /**
     * decrease speed while equipping Sword
     * @return decreased Speed
     */
    public int SpeedDecrease(){
        return (int)(10 * (0.1 + 0.04 * lvl));
    }
    /**
     * Sword level up
     * effect : Sword level + 1
     *          recalculate Sword attack
     *          print congratulation for Sword level up
     */
    public void lvlUP(){
        lvl++;
        swordATK = baseATK*(1 + 0.1*lvl);
        System.out.println("Congrats! your Sword is level UP!!");
    }
}