package Charaters;

import Accessories.Ring.Ring;
import Accessories.Shoe.Shoes;
import Weapon.Sword;
import Weapon.Shield;

public class Fighter {
    /**
     * set Fighter's name
     */
    String name;
    /**
     * set Fighter's level = 1
     */
    protected int lvl = 1;
    /**
     * set Fighter's MaxHP = 100
     */
    protected double maxHP = 100;
    /**
     * Fighter's current HP
     */
    protected double currentHP;
    /**
     * Fighter's current attack
     */
    protected double currentatk;
    /**
     * set Fighter's MaxMana = 50
     */
    protected double maxMana = 50;
    /**
     * Fighter's current Mana
     */
    protected double currentMana;
    /**
     * set Fighter's base speed = 20
     */
    protected double baseSpeed = 20;
    /**
     * Fighter's current speed;
     */
    protected double currentSpeed;
    /**
     *  Sword that Fighter equip
     */
    public Sword equipSword;
    /**
     *  Shield that Fighter equip
     */
    public Shield equipShield;
    /**
     *  Shoes that Fighter equip
     */
    public Shoes equipShoes;
    /**
     *  Ring that Fighter equip
     */
    public Ring equipRing;

    /**
     * set Fighter's name
     * @param name String to set Fighter's name
     * effect : set Fighter's name to this name
     * then calculate Fighter's stats
     */
    public Fighter(String name){
        this.name = name;
        initializeStats();
    }

    /**
     * calculate Fighter's stats
     * effect : max HP change by 100 + 10*level
     *          max Mana change by 50 + 2*level
     *          base Speed change by 10 + 3*level
     *          set current HP = max HP
     *          set current Mana = max Mana
     *          set current Speed = base Speed
     *          set current attack = 0
     * then calculate stats while wearing accessories
     */
    public void initializeStats(){
        maxHP = 100 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 10 + 3*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
        updateStats();
    }

    /**
     * calculate damage that Fighter take and decrease Fighter's current HP
     * @param damage int to change Fighter's current HP
     * effect : if damage > defense that Fighter's equip shield
     *          then current HP - (damage - defense)
     *          if damage < defense that Fighter's equip shield
     *          then current HP doesn't change
     *          if current HP < 0 set current HP = 0
     */
    public void takeDMG(int damage){
        int reducedDMG = (int) (damage - equipShield.shieldDEF);
        reducedDMG = Math.max(reducedDMG, 0);
        currentHP -= reducedDMG;
        currentHP = Math.max(currentHP, 0); // check if HP < 0 to set HP = 0
    }
    /**
     * Fighter's level + 1
     * effect : Fighter's level change by +1
     * then calculate Fighter's new stats
     */
    public void lvlUP(){
        lvl++;
        initializeStats();
    }

    /**
     * set Fighter's new equip sword
     * @param newSword Sword to change Fighter's equip Sword
     * effect : Fighter's equip sword change to newSword
     * then calculate Fighter's new stats
     */
    public void setEquipSword(Sword newSword){
        equipSword = newSword;
        updateStats();
    }

    /**
     * set Fighter's new equip shield
     * @param newShield Shield to change Fighter's equip Shield
     * effect : Fighter's equip shield change to newShield
     * then calculate Fighter's new stats
     */
    public void setEquipShield(Shield newShield){
        equipShield = newShield;
        updateStats();
    }

    /**
     * set Fighter's new equip shoes
     * @param newShoes Shoes to change Fighter's equip Shoes
     * effect : Fighter's equip shoes change to newShoes
     * then calculate Fighter's new stats
     */
    public void setEquipShoes(Shoes newShoes){
        equipShoes = newShoes;
        updateStats();
    }

    /**
     * set Fighter's new equip ring
     * @param newRing Ring to change Fighter's equip Ring
     * effect : Fighter's equip ring change to newRing
     * then calculate Fighter's new stats
     */
    public void  setEquipRing(Ring newRing){
        equipRing = newRing;
        updateStats();
    }

    /**
     * update Fighter's stats
     * effect : if Fighter's equipping shoes
     *          calculate Fighter's current speed and current attack
     * effect : if Fighter's equipping shield
     *          calculate Fighter's current speed
     * effect : if Fighter's equipping sword
     *          calculate Fighter's current speed and current attack
     * effect : if Fighter's equipping ring
     *          calculate Fighter's current attack
     */
    public void updateStats(){
        currentSpeed = baseSpeed;
        currentatk = 0;
        if (equipShoes != null){
            currentSpeed += equipShoes.Speed();
            currentatk += equipShoes.atkShoe();
        }
        if (equipShield != null){
            currentSpeed -= equipShield.SpeedDecrease();
        }
        if (equipSword != null){
            currentSpeed -= equipSword.SpeedDecrease();
            currentatk += equipSword.swordATK;
        }
        if (equipRing != null){
            currentatk += equipRing.atkring();
        }
    }

    /**
     * Return max HP
     * @return Fighter's max HP
     */
    public double getMaxHP(){
        return maxHP;
    }

    /**
     * Return
     * @return Fighter's max Mana
     */
    public double getMaxMana(){
        return maxMana;
    }

    /**
     * Return current HP
     * @return Fighter's current HP
     */
    public double getCurrentHP(){
        return currentHP;
    }

    /**
     * Return current Mana
     * @return Fighter's current Mana
     */
    public double getCurrentMana(){
        return currentMana;
    }

    /**
     * Return current speed
     * @return Fighter's current speed
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * Return current attack
     * @return Fighter's current attack
     */
    public double getCurrentatk(){
        return currentatk;
    }
}

