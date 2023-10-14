package Assignment6_000905034;

/**
 * This class represents a Human.
 * It is inherited from Humanoids class
 * This class have an extra attribute such as swornEnemy
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Humans extends Humanoids{
    private Elves swornEnemy;

    /**
     * Constructor representing Human
     * @param name            the name of the Human
     * @param strength        the strength of the Human
     * @param dexterity       the dexterity of the Human
     * @param armour          the armour of the Human
     * @param moxie           the moxie of the Human
     * @param coins           the coins of the Human
     * @param healthRating    the healthRating of the Human
     * @param swornEnemy      the swornEnemy of the Human
     */
    public Humans(String name, int strength, int dexterity, int armour, int moxie,
                  int coins, int healthRating, Elves swornEnemy){
        super(name, strength, dexterity, armour, moxie, coins, healthRating);
        this.swornEnemy = swornEnemy;
    }

    /**
     * Constructor representing Human
     * @param name the name of the Human
     */
    public Humans(String name){
        super(name);
    }

    /**
     * it gets the swornEnemy
     * @return the swornEnemy
     */
    public Elves getSwornEnemy() {
        return swornEnemy;
    }

    /**
     * it returns toString method of Humans
     * @return the representation of the String of Humans
     */
    @Override
    public String toString() {
        return "Human: {" + "name='" + getName() + '\'' + ", strength=" + getStrength() +
                ", dexterity=" + getDexterity() + ", armour=" + getArmour() + ", moxie=" + getMoxie() +
                ", coins=" + getCoins() + ", healthRating=" + getHealthRating() +
                ", isActive=" + getIsActive() + ", sworn enemy=" + this.swornEnemy + "}";
    }
}

