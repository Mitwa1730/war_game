package Assignment6_000905034;

/**
 * This class represents Humanoid with different attributes and behaviour.
 * It provides attack and defend methods, as well as getters and setters for the attributes
 *
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class Humanoids {
    // Private instance variables of Humanoid
    private String name;
    private int strength;
    private int dexterity;
    private int armour;
    private int moxie;
    private int coins;
    private int healthRating;
    private boolean isActive;

    /**
     * Constructor for Humanoid with attributes
     * @param name             the name of Humanoid
     * @param strength         the strength of Humanoid
     * @param dexterity        the name of Humanoid
     * @param armour           the armour of Humanoid
     * @param moxie            the moxie of Humanoid
     * @param coins            the coins of Humanoid
     * @param healthRating     the healthRating of Humanoid
     */
    public Humanoids(String name, int strength, int dexterity, int armour, int moxie,
                     int coins, int healthRating){
        this.strength = strength;
        this.dexterity = dexterity;
        this.armour = armour;
        this.moxie = moxie;
        this.name = name;
        this.coins = coins;
        this.healthRating = healthRating;

        // It checks whether Humanoid is alive or dead depending on healthRating
        if (healthRating>0){ isActive = true; }
        else { isActive = false; }
    }

    /**
     * Constructor of Humanoid having default values for attributes
     * @param name  name of Humanoid
     */
    public Humanoids(String name){
        this.name = name;
        this.strength = 12;
        this.dexterity = 12;
        this.armour = 14;
        this.moxie = 17;
        this.coins = 19;
        this.healthRating = 17;
        isActive = true;
    }

    // getters and setters for different attributes of Humanoid

    /**
     * it gets the Strength
     * @return the Strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * it gets the Dexterity
     * @return the Dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * it gets the Armour
     * @return the Armour
     */
    public int getArmour() {
        return armour;
    }

    /**
     * it gets the Moxie
     * @return the Moxie
     */
    public int getMoxie() {
        return moxie;
    }

    /**
     * it gets the Name
     * @return the Name
     */
    public String getName(){
        return name;
    }

    /**
     * it gets the Coins
     * @return the Coins
     */
    public int getCoins() {
        return coins;
    }

    /**
     * it gets the healthRating
     * @return the healthRating
     */
    public int getHealthRating() {
        return healthRating;
    }

    /**
     * it gets the status of Humanoid
     * @return true if Humanoid is active/alive, or return false if inactive/dead
     */
    public boolean getIsActive(){
        return isActive;
    }

    /**
     * it sets the healthRating, also checks whether healthRating is within range of 20
     * @param healthRating the healthRating
     */
    public void setHealthRating(int healthRating) {
        if(healthRating<=20){
            this.healthRating = healthRating;
        }
        else {
            this.healthRating = 20;
        }
    }

    /**
     * it sets whether humanoid is active
     * @param isActive the active status
     */
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    /**
     * this method attacks other humanoid, and also decrements their healthRating depending upon attacker
     * @param humanoids  the targeted humanoid
     */
    public void attack(Humanoids humanoids) {
        if (isActive == true) {
            int damageScore = (this.strength + this.dexterity + this.healthRating) / 3;
            humanoids.healthRating = humanoids.healthRating - damageScore;

            if (humanoids.healthRating <= 0){
                humanoids.isActive = false;
            }
        }
        else{
            System.out.println("It's dead and is unable to attack!");
        }
    }

    /**
     * this method defends against another humanoid(attacker), and also decrements defender's healthRating
     * @param attacker the attacker humanoid
     */
    public void defend(Humanoids attacker){
        if (isActive == true) {
            int attackDamage = (attacker.strength + attacker.dexterity + attacker.healthRating) / 3;
            int actualDamage = attackDamage / this.armour;

            if (actualDamage > 1) {
                this.healthRating = this.healthRating - actualDamage;
            } else {
                this.healthRating = this.healthRating - 1;
            }
            if (this.healthRating <= 0) {
                isActive = false;
            }
        }
    }

    /**
     * it returns toString method of humanoid
     * @return the representation of the String of humanoid
     */
    @Override
    public String toString() {
        return "Humanoids: {" + "name='" + name + '\'' + ", strength=" + strength +
                ", dexterity=" + dexterity + ", armour=" + armour + ", moxie=" + moxie +
                ", coins=" + coins + ", healthRating=" + healthRating +
                ", isActive=" + isActive + '}';
    }
}
