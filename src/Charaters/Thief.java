package Charaters;
import Weapon.Shield;
public class Thief extends Fighter {
    /**
     * set Thief's name
     * @param name String to set Thief's name
     * effect : set Thief's name to this name
     */
    public Thief(String name){
        super(name);
    }
    /**
     * calculate Thief's stats
     * effect : max HP change by 80 + 10*level
     *          max Mana change by 50 + 2*level
     *          base Speed change by 15 + 3*level
     *          set current HP = max HP
     *          set current Mana = max Mana
     *          set current Speed = base Speed
     *          set current attack = 0
     * then calculate stats while wearing accessories
     */
    @Override
    public void initializeStats(){
        maxHP = 80 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 15 + 3*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
        updateStats();
    }

    /**
     * set Thieves equip shield but Thieves can't equip shield
     * @param newShield Shield to change Thieves equip Shield
     * effect : Thieves equip shield change to newShield
     *          but Thieves can't equip shield
     */
    @Override
    public void setEquipShield(Shield newShield){
        equipShield = null;
        System.out.println("This character can't equip shield");
    }
}
