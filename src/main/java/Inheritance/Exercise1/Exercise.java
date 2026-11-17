package Inheritance.Exercise1;



public class Exercise
{
    static void main()
    {
        System.out.println("PLAYER is-a ENTITY");
        System.out.println("CUSTOMER has a ORDER");
        System.out.println("SWORD is a WEAPON");
        System.out.println("PLAYER has a TEAM");
        System.out.println("ADMIN-USER is a USER");

        Weapon gun = new Weapon("Shooty shooty bang bang");
        Sword slicer = new Sword("Slicey sword", 4);

        System.out.println(gun.describe());
        System.out.println(slicer.describe());
    }
}
