public class WarriorCharacter implements Warrior, Character {

    private String name;
    private int level;
    public int hp;
    private int baseAttackDamage;
    private int defense;
    private Weapon weapon;
    private Armor armor;

    //Warrior have them-self defense up to level
    public WarriorCharacter(String name, int level, Weapon weapon, Armor armor) {
        this.name = name;
        this.level = level;
        this.hp = 100 + level * 10;
        this.baseAttackDamage = 10 + level * 5;
        this.defense = 5 + level * 2;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public void attack(Character target) {

        int totalAttackDamage = baseAttackDamage;
        if (weapon != null) {
            totalAttackDamage += weapon.getAttackDamage();
        }

        target.getAttack(totalAttackDamage);
    }

    @Override
    public void levelUp() {
        this.level++;
        baseAttackDamage = 10 + level * 5;
        defense = 5 + level * 2;
        System.out.println(name + " leveled up to level " + this.level);
    }

    @Override
    public void checkStats() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + hp);
        System.out.println("Attack Damage: " + baseAttackDamage);
        System.out.println("Defense: " + defense);

        if (weapon != null) {
            System.out.println("Equipped Weapon: " + weapon.getClass().getSimpleName());
        }

        if (armor != null) {
            System.out.println("Equipped Armor: " + armor.getClass().getSimpleName());
        }
    }

    @Override
    public void getAttack(int damage) {
        int actualDamage;
        if(damage-defense<0){
            actualDamage = 0;
        }else{
            actualDamage = damage - defense;
        }


        if (armor != null) {
            actualDamage -= armor.getDefenseBonus();
        }

        hp -= actualDamage;

        if (hp <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " takes " + actualDamage + " damage. Hp : " + hp);
        }
    }
}