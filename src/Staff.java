class Staff implements Weapon {
    private int magicDamage;

    public Staff(int magicDamage) {
        this.magicDamage = magicDamage;

    }

    @Override
    public int getAttackDamage() {
        return magicDamage;
    }


}