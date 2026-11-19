package Inheritance.Exercise8;


public class Exercise {

    public static void main() {
        Hero hero = new Hero("Aria", new Sword("IronBlade"));
        System.out.println(hero.describe() + ": attack " + hero.attack());

        hero.equip(new Staff("OakStaff"));
        System.out.println(hero.describe() + ": attack " + hero.attack());
    }
}