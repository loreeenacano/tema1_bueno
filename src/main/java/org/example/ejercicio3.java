package org.example;

public class ejercicio3 {
    static void prt(String s)
    {
        System.out.println(s);
    }

    /**
     * Esta funcion calcula los multiplos de 5 entre un valor begin y un valor end y los almacena en un array
     * @param begin, end
     * @return multiplos
     */
    public static int [] array_multiplos (int begin, int end)
    {
        int num;
        int contador=0;
        int multiplos[] = new int [100]; //100 es una aproximacion de los espacios que se pueden necesitar
        for (num=begin; num<=end; num++) //recorre los valores de begin a end.
        {
            if (num%5==0)
            {
                multiplos[contador]=num;
                contador++;
            }
        }
        return multiplos;
    }

    /**
     * Esta funcion suma todos los multipos de 5 de entre 1-100
     * @param multiplos
     * @return suma
     */
    public static int sumar (int [] multiplos)
    {
        int suma= 0;
        int num;
        for (num=0; num<multiplos.length ; num++)
        {
            suma= suma + multiplos[num];
        }
        return suma;
    }
    public static void main (String[] args)
    {
        int begin = 1;
        int end = 100;
        int [] multiplos = array_multiplos(begin, end); //creo un array para guardar los numeros
        int suma = sumar(multiplos); //igualos a variables las funciones para unirlas en el main
        prt("Multiplos de 5:");
        for (int i=0; i< multiplos.length; i++)
        {
            prt(multiplos[i] +" ");
        }
        prt("Suma de multipos de 5:"+suma);
    }
}
