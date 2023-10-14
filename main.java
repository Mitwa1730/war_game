package Assignment6_000905034;

/**
 * This class represents main method of the program.
 * It creates new objects for humanoid subclasses and tests different methods
 * @author: Mitwa Patel, 000905034
 * Date: July 21, 2023
 */

public class main {
    /**
     * this is the main method where it executes the program
     * @param args
     */
    public static void main(String[] args) {

        // it creates two new Hobbits
        System.out.println("\n----- Two new Hobbits created ----- ");
        Hobbits hobbitA = new Hobbits("Hannah");
        Hobbits hobbitB = new Hobbits("Eva", 12,15,17,12,
                18,19,13);
        System.out.println(hobbitA);
        System.out.println(hobbitB);

        // it creates two new Elves
        System.out.println("\n----- Two new Elves created ----- ");
        Elves elfA = new Elves("Ben");
        Elves elfB = new Elves("Leo", 12,13,14,15,16,
                17, "Forest", hobbitA);
        elfA.setBestFriend(hobbitB);
        System.out.println(elfA);
        System.out.println(elfB);

        // it creates two new Humans
        System.out.println("\n----- Two new Humans created -----");
        Humans humanA = new Humans("Alex");
        Humans humanB = new Humans("Leo", 12,13,14,15,16,
                17, elfA);
        System.out.println(humanA);
        System.out.println(humanB);

        // an Elf attacking a Human
        System.out.println( "\n----- "+elfA.getName() + " attacks " + humanA.getName() +"-----");
        elfA.attack(humanA);
        System.out.println(humanA);

        // a Human defending from an Elf
        System.out.println( "\n----- "+ humanB.getName() + " defends " + elfA.getName()+"-----");
        humanB.defend(elfA);
        System.out.println(humanB);

        // it creates two new Wizards
        System.out.println("\n----- Two new Wizards created ----- ");
        Wizards wizardA = new Wizards("Wiz");
        Wizards wizardB = new Wizards("Wuzz", 13,16,17,12,17,
                18,elfB,15);
        System.out.println(wizardA);
        System.out.println(wizardB);

        // Wizard that performs a healing spell
        System.out.printf("\n----- %s performed healingSpell ----- \n", wizardB.getName());
        wizardB.healingSpell();
        System.out.println(wizardB);

        // it creates two new Fighters
        System.out.println("\n----- Two new Fighters created ----- ");
        Fighter fighterA = new Fighter("Furr");
        Fighter fighterB = new Fighter("Figh", 14,16,19,14,15,
                18,elfA);
        System.out.println(fighterA);
        System.out.println(fighterB);

        // a Fighter attacking a Hobbit
        System.out.printf("\n----- %s attacks %s ----- \n", fighterA.getName(), hobbitA.getName());
        fighterA.attack(hobbitA);
        System.out.println(hobbitA);
    }
}
