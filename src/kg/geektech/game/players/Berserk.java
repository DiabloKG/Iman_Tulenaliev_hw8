package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        savedDamage = boss.getDamage() / 5 ;
        boss.setHealth(boss.getHealth() - savedDamage);
        System.out.println("Spider Man inflicted additional damage " + savedDamage);
    }
}
