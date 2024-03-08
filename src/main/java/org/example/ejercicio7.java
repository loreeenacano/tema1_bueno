package org.example;
import org.example.InputOutput.Input;
/*Escribe un programa que lea un número entero de teclado, lo
guarde en una variable, lo envíe a una función que lo descomponga en
factores primos, y dicha función devuelva un array que contenga los factores
primos. Posteriormente imprima el array en el main. ; por ejemplo 40 = 2 * 2
* 2 *  */
public class ejercicio7 {
    public static void main(String[] args) 
    {
      int numero = pedirnum();
      int [] array = array_primos(numero);
      System.out.println("Numero factorizado:" + array);
    }

    public static pedirnum ()
        {
            System.out.println("Introduzca un numero:");
            int num = Input.leerInt();
            System.out.println(" "+ num);
            return num;
        }

        public static int [] array_primos(int num)
        {
            num = pedirnum();
            for(int i=2; i<=num;i ++)
            {
                while (num % i==0)
                {
                    int array = new int [i];
                    num =num/i;
                } 
            }
            return array;
        }
}
