package Inheritance.Exercise8;

import Inheritance.Exercise4.Weapon;

public class Hero
{
    private final String name;
    private Weapon weapon;

    public Hero(String name, Sword startingWeapon)
    {
        if(name.equals(null) || name.isEmpty())
        {
            throw new IllegalArgumentException("The weapon has to have a name!");
        }
        this.name = name;
        this.weapon = requireWeapon(startingWeapon);
    }

    public void equip(Weapon newWeapon)
    {
        weapon = requireWeapon(newWeapon);
    }

    public int attack()
    {
        return weapon.damage();
    }

    public Weapon weapon()
    {
        return weapon;
    }
    public String describe()
    {
        return name + " wielding " + weapon.describe();
    }

    private static Weapon requireWeapon(Weapon w) {
        if (w == null)
            throw new IllegalArgumentException("weapon is required");
        return w;
    }
}
