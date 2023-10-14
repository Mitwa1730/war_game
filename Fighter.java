package Assignment6_000905034;

/**
 * This class represents a Fighter.
 * It is inherited from Humans class.
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Fighter extends Humans{

    /**
     * Constructor representing Fighter
     * @param name           the name of the Fighter
     * @param strength       the strength of the Fighter
     * @param dexterity      the dexterity of the Fighter
     * @param armour         the armour of the Fighter
     * @param moxie          the moxie of the Fighter
     * @param coins          the coins of the Fighter
     * @param healthRating   the healthRating of the Fighter
     * @param swornEnemy     the swornEnemy of the Fighter
     */
    public Fighter(String name, int strength, int dexterity, int armour, int moxie, int coins,
                   int healthRating, Elves swornEnemy) {
        super(name, strength, dexterity, armour, moxie, coins, healthRating, swornEnemy);
    }

    /**
     * Constructor for Fighter
     * @param name the name of the Fighter
     */
    public Fighter(String name){
        super(name);
    }

    /**
     * this method overrides the attack method from the Humans class (super class)
     * @param humanoids  the targeted humanoid
     */
    @Override
    public void attack(Humanoids humanoids){
        int damageScore = (humanoids.getStrength() + humanoids.getDexterity() + humanoids.getHealthRating())/3;
        humanoids.setHealthRating(getHealthRating() - damageScore * 2);

        if (humanoids.getHealthRating() <= 0){
            humanoids.setIsActive(false);
        }
    }

    /**
     * it returns toString method of Fighter
     * @return the representation of the String of Fighter
     */
    public String toString() {
        return "Fighter: {" + "name='" + getName() + '\'' + ", strength=" + getStrength() +
                ", dexterity=" + getDexterity() + ", armour=" + getArmour() + ", moxie=" + getMoxie() +
                ", coins=" + getCoins() + ", healthRating=" + getHealthRating() + ", isActive=" + getIsActive() + "}";
    }
}

