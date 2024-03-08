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
        System.out.println("Introduzca un numero:");
        int num = Input.leerInt();

        int [] array = array_primos(num);
        System.out.print(num+ " = ");
        for (int i=0; i < array.length; i++){
        System.out.print(array[i]+"*"); }
    }

        public static int [] array_primos(int num)
        {
            int[] array = new int [10];
            int indice=0;

            for(int factor=2; factor<=num; factor ++)
            {
                if (num % factor==0)
                {
                    array [indice]= factor;
                    num =num/factor;
                    indice ++;
                    factor --;
                } 
            }
            return array;
        }
}
