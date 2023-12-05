public class Main {
    public static void main(String[] args) {
        //buy weapon
        Weapon sword = new Sword(23);
        Armor shield = new Shield(5);
        Weapon staff = new Staff(30);

        //Create p1("James the knight") && p2("Maron high wizard")
        WarriorCharacter p1 = new WarriorCharacter("James the knight", 3, sword, shield);
        WizardCharacter p2 = new WizardCharacter("Maron high wizard", 4, staff, null);

        //show info
        System.out.println("__________________________________");
        System.out.println("Battle Info:");
        p1.checkStats();
        System.out.println();
        p2.checkStats();
        System.out.println("__________________________________");

        //warrior use attack && wizard use spell
        p1.attack(p2);
        p2.castSpell(p1);
        p1.levelUp();
        p1.attack(p2);
        p2.castSpell(p1);
        }
    }




