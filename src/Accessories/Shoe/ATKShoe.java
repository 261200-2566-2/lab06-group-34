package Accessories.Shoe;

import Accessories.Shoe.Shoes;

public class ATKShoe extends Shoes {

    /**
     * set Shoe's speed and attack
     * @param speed  to set Shoe's speed
     * @param atk    to set Shoe's attack
     * effect : set Shoe's speed to this speed and Shoe's attack to this atk
     */
    public ATKShoe(double speed ,double atk){
        super(speed);
        this.baseATK = atk;

    }
    /**
     * Shoe level up
     * effect : Shoe level + 1
     *          recalculate Shoe attack
     */
    @Override
    public void lvlUP(){
        Shoeatk = baseATK * (1 + 0.1 * lvl);
    }


}
