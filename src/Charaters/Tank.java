package Charaters;

public class Tank extends Fighter {
    /**
     * set Tank's name
     * @param name String to set Tank's name
     * effect : set Tank's name to this name
     */
    public Tank(String name){
        super(name);
    }

    /**
     * calculate Tank's stats
     * effect : max HP change by 130 + 10*level
     *          max Mana change by 50 + 2*level
     *          base Speed change by 8 + level
     *          set current HP = max HP
     *          set current Mana = max Mana
     *          set current Speed = base Speed
     *          set current attack = 0
     * then calculate stats while wearing accessories
     */
    @Override
    public void initializeStats(){
        maxHP = 130 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 8 + lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        currentatk = 0;
        updateStats();
    }
}