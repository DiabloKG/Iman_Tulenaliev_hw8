package kg.geektech.game.players;

public class Magic extends Hero {
    int boostDamage = 2;
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + boostDamage);
        }
        System.out.println("Medivh used BOOST! + " + boostDamage + " Damage! " );
    }
}
