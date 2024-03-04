package org.example;
/*Escribe un programa que visualice por pantalla la tabla demultiplicar de los 10 primeros números naturales. Utilizar una 
función quereciba un número N y devuelva un array de arrays con las tablas demultiplicar de 0 a 9 de los N números. */

public class ejercicio5 
{
 
    
    public static void main(String[] args) 
    {
        int n;
        for (n = 1; n <= 10; n++) 
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(n + "x" + i + "=" + n * i);
            }
            System.out.println("--------------------------------");
        }
    }
    
}
