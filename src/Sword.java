class Sword implements Weapon {
    private int attackDamage;


    public Sword(int attackDamage) {
        this.attackDamage = attackDamage;

    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }


}