package org.example;

import org.example.InputOutput.Input;

public class ejercicio6
{
    public static int []array_primos(int n)
    {
        int numeros_primos_encontrados=0;
        int divisor=0;
        int numero=1;
        int divisores_encontrados=0;
        int array[]= new int[n];

        while(numeros_primos_encontrados<n)
        {
            for(divisor=2; divisor<numero; divisor++)
            {
                if(numero%divisor == 0)
                {
                    divisores_encontrados++;
                }
            }
            if(divisores_encontrados==0)
            {
            System.out.println(numero+" es primo.");
            numeros_primos_encontrados++;
            }
            numero++;
            divisores_encontrados=0;
        }
        array[0]=numero;
        return array;
        }

    public static void main(String[] args) 
    {
        System.out.print("Indique la cantidad de numeros primos que quiere recibir:");
         int n= Input.leerInt();
         int[] numeros = array_primos(n); 
    }
}