package org.example;

public class ejercicio2 {
    public static void main (String[] args) {
        char char_max = Character.MAX_VALUE;
        short short_max = Short.MAX_VALUE;
        int int_max = Integer.MAX_VALUE;

        prt("Mayor char:"+char_max);
        prt("Mayor short:"+short_max);
        prt("Mayor int:"+int_max);
    }
    static void prt(String s)
    {
        System.out.println(s);
    }
}
