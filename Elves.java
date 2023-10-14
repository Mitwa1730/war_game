package Assignment6_000905034;

/**
 * This class represents an Elf.
 * It is inherited from Humanoids class
 * This class have extra attributes such as Habitat and bestFriend (as Hobbit)
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Elves extends Humanoids{
    private String habitat;
    private Hobbits bestFriend;

    /**
     * Constructor representing an Elf
     * @param name               the name of an elf
     * @param strength           the strength of an elf
     * @param dexterity          the dexterity of an elf
     * @param armour             the armour of an elf
     * @param moxie              the moxie of an elf
     * @param coins              the coins of an elf
     * @param healthRating       the healthRating of an elf
     * @param habitat            the habitat of an elf
     * @param bestFriend         the bestFriend of an elf
     */
    public Elves(String name, int strength, int dexterity, int armour, int moxie,
                 int coins, int healthRating, String habitat, Hobbits bestFriend){
        super(name, strength, dexterity, armour, moxie, coins, healthRating);
        this.habitat = habitat;
        this.bestFriend = bestFriend;
    }

    /**
     * Constructor having a default value for habitat - "City"
     * @param name  the name of an elf
     */
    public Elves(String name){
        super(name);
        this.habitat = "City";
    }

    /**
     * it gets the habitat of Elf
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * it gets the bestFriend of Elf
     * @return the bestFriend
     */
    public Hobbits getBestFriend() {
        return bestFriend;
    }

    /**
     * it sets bestFriend of an Elf
     * @param bestFriend the bestFriend
     */
    public void setBestFriend(Hobbits bestFriend) {
        this.bestFriend = bestFriend;
    }

    /**
     * it returns toString method of Elves
     * @return the representation of the String of Elves
     */
    @Override
    public String toString() {
        return "Elf: {" + "name='" + getName() + '\'' + ", strength=" + getStrength() +
                ", dexterity=" + getDexterity() + ", armour=" + getArmour() + ", moxie=" + getMoxie() +
                ", coins=" + getCoins() + ", healthRating=" + getHealthRating() +
                ", isActive=" + getIsActive() + ", habitant=" + this.habitat + ", best friend=" + this.bestFriend + "}";
    }
}
