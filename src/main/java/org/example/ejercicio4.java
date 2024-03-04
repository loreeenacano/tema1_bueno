/*Escribe un programa que calcule el mínimo y el máximo de
una lista de números enteros positivos introducidos por el usuario. La lista
finalizará cuando se introduzca un número negativo. Realice el ejercicio en
dos pasos. El primer paso será introducir el número de valores y guardarlos
en un array. Se recomienda utilizar un array de valor grande y
posteriormente hacer una copia al valor real. Una vez tenemos los números introducidos en un array,
se realizan dos funciones independientes. Unacalcula el máximo, otra calcula el mínimo*/
package org.example;
import org.example.InputOutput.Input;

public class ejercicio4 {
   
    public static int[] array_numeros()
    {
        int i= 0;
        int j;
        int []array1 = new int [100];

        //crea el array con los numeros hasta que introduzca el negativo
        do 
        {
        System.out.println("Introduzca una lista de números (para finalizar el programa introduzca uno negativo):");
        array1[i]= Input.leerInt();
        System.out.println(array1[i]);
        i ++;
        }
        while (array1[i-1]>=0);

        //guarda en un array del tamaño necesario
        int [] array2 = new  int[i-1];
        for(j=0; j<=(i-1); j++)
        {
            array2[j]=array1 [i];
        }
        return array2;
    }

    public static int min( int[] numeros)
    {
        int min =numeros[0];
        int i;

        for (i=0; i<numeros.length; i++)
        {
        if(numeros[i]<min)
        {
         min= numeros[i];
        }
        }
        return min;
    }

    public static int max( int[]numeros){
        int max =numeros[0];
        int i;

        for (i=0; i<numeros.length; i++){
        if(numeros[i]>max)
        {
             max= numeros[i];
        }
        }
        return max;
        }

    public static void main (String[] args)
    {
        int []numeros = array_numeros(); 
        System.out.println("El mayor numero es:" + max(numeros) + " y el menor es:" + min(numeros));
    }
    
}
