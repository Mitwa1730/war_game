package Assignment6_000905034;

/**
 * This class represents a Wizard.
 * It is inherited from Humans class
 * This class have an extra attribute such as magicRating
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Wizards extends Humans{
    private int magicRating;

    /**
     * Constructor representing Wizard
     * @param name            the name of the Wizard
     * @param strength        the strength of the Wizard
     * @param dexterity       the dexterity of the Wizard
     * @param armour          the armour of the Wizard
     * @param moxie           the moxie of the Wizard
     * @param coins           the coins of the Wizard
     * @param healthRating    the healthRating of the Wizard
     * @param swornEnemy      the swornEnemy of the Wizard
     * @param magicRating     the magicRating of the Wizard
     */
    public Wizards(String name, int strength, int dexterity, int armour, int moxie,
                   int coins, int healthRating, Elves swornEnemy, int magicRating){
        super(name, strength, dexterity, armour, moxie, coins, healthRating, swornEnemy);
        this.magicRating = magicRating;
    }

    /**
     * Constructor having a default value for magicRating: 15
     * @param name the name of the Wizard
     */
    public Wizards(String name){
        super(name);
        this.magicRating = 15;
    }

    /**
     * it gets the magicRating
     * @return the magicRating
     */
    public int getMagicRating() {
        return magicRating;
    }

    /**
     * this method performs the healingSpell and boosts the wizard's healthRating
     */
    public void healingSpell(){
        if(this.magicRating > 0 && this.getIsActive() == true) {
            int healthBoostScore = this.getHealthRating() + (this.magicRating / 2);
            this.setHealthRating(healthBoostScore);
            this.magicRating -= 3;
        }
    }

    /**
     * it returns toString method of Wizards
     * @return the representation of the String of Wizards
     */
    @Override
    public String toString() {
        return "Wizard: {" + "name='" + getName() + '\'' + ", strength=" + getStrength() +
                ", dexterity=" + getDexterity() + ", armour=" + getArmour() + ", moxie=" + getMoxie() +
                ", coins=" + getCoins() + ", healthRating=" + getHealthRating() +
                ", isActive=" + getIsActive() + ", magic rating=" + this.magicRating + "}";
    }
}

