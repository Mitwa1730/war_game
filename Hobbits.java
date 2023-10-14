package Assignment6_000905034;

/**
 * This class represents a Hobbit.
 * It is inherited from Humanoids class
 * This class have an extra attribute such as stealScore
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Hobbits extends Humanoids{
    private int stealScore;

    /**
     * Constructor representing Hobbit
     * @param name           the name of the Hobbit
     * @param strength       the strength of the Hobbit
     * @param dexterity      the dexterity of the Hobbit
     * @param armour         the armour of the Hobbit
     * @param moxie          the moxie of the Hobbit
     * @param coins          the coins of the Hobbit
     * @param healthRating   the healthRating of the Hobbit
     * @param stealScore     the stealScore of the Hobbit
     */
    public Hobbits(String name, int strength, int dexterity, int armour, int moxie,
                   int coins, int healthRating, int stealScore){
        super(name, strength, dexterity, armour, moxie, coins, healthRating);
        this.stealScore = stealScore;
    }

    /**
     * Constructor having a default value for stealScore: 10
     * @param name  the name of the Hobbit
     */
    public Hobbits(String name){
        super(name);
        this.stealScore = 10;
    }

    /**
     * this method increments the stealScore of the Hobbit, if the Hobbit is active/alive
     */
    public void stealMoney() {
        if (this.getIsActive() == true) {
            this.stealScore = this.stealScore + (this.getDexterity() / 2);
        }
    }

    /**
     * it gets the stealScore
     * @return  the stealScore
     */
    public int getStealScore(){
        return stealScore;
    }

    /**
     * it returns toString method of Hobbits
     * @return the representation of the String of Hobbits
     */
    public String toString() {
        return "Hobbits: {" + "name='" + getName() + '\'' + ", strength=" + getStrength() +
                ", dexterity=" + getDexterity() + ", armour=" + getArmour() + ", moxie=" + getMoxie() +
                ", coins=" + getCoins() + ", healthRating=" + getHealthRating() +
                ", isActive=" + getIsActive() + ", steal score=" + this.stealScore + "}";
    }
}


