package Equality.Exercise5;

public class Exercise
{
    static void main()
    {
        int h = 66486;

        int m16 = 16;
        int m32 = 32;

        int idx16_mod = h % m16;
        int idx16_mask = h & (m16 - 1);
        int idx32_mod = h % m32;
        int idx32_mask = h & (m32 - 1);
        int idxSafe = Math.floorMod(h, m16);


        System.out.println("The values: ");
        System.out.println("m16 = " + m16);
        System.out.println("m32 = " + m32);
        System.out.println("idx16_mod = " + idx16_mod );
        System.out.println("idx16_mask = " + idx16_mask);
        System.out.println("idx32_mod = " + idx32_mod);
        System.out.println("idx32_mask = " + idx32_mask);
        System.out.println("idxSafe = " + idxSafe);

    }

}
