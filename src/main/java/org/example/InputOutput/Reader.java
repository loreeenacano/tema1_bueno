package org.example.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader 
{
     public static void main(String[] args) {
        try {
            System.out.print("Introduce un numero cualquiera: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String string1 = br.readLine();
            int num = Integer.parseInt(string1);

            System.out.println("El numero introducido es: "+num);

            System.out.print("Introduce una frase cualquiera: ");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            String string2 = br2.readLine();

            System.out.println("La frase introducida es: "+string2);

        } catch(IOException ioe)
        {
            System.out.println(ioe);
        }
}
}
