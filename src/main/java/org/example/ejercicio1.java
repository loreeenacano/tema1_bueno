package org.example;

public class ejercicio1 {
    public static void main (String[] args)
    {
        int dias_ano = 365;
        int horas_dia = 24;
        int min_hora = 60;
        int seg_min = 60;

        int seg_ano = seg_min * min_hora * horas_dia * dias_ano;
        prt("Segundos en un año:" + seg_ano);

        int segundos = calculo_segundos(2,3,4);
        prt("Segundos en 2 años, 3 meses y 4 dias:"+ segundos);
    }
    static void prt(String s)
    {
        System.out.println(s);
    }
    public static int calculo_segundos(int anos, int meses, int dias)
    {
        int segundos_ano = 365 * 24 * 60 * 60;
        int segundos_meses = 30 * 24 * 60 * 60;
        int segundos_dias = 24 * 60 * 60;

        int segundos = (anos*segundos_ano)+ (meses*segundos_meses) + (dias*segundos_dias);
        return segundos;
    }
}
