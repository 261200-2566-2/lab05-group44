class Shield implements Armor {
    //Armor setting
    private int defenseBonus;

    public Shield(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    @Override
    public int getDefenseBonus() {
        return defenseBonus;
    }
}