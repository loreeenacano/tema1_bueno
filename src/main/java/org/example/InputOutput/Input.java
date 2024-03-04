package org.example.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input
{
    public static void main(String[] args) {
        String question =leerString("Hi, can you introduce some input? ");
        System.out.println(question);

        int[] lista = introduceNumeros("Introduce a list of numbers (0 to finish) " );
        System.out.println(lista);

        System.out.println("Enter any number:");
        int numero = leerInt();
        System.out.println(numero);
    }

    /**
     * This function reads any String
     * @param question
     * @return
     */
    public static String leerString(String question) {
        String cadena;
        while(true){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(question); //Imprime la pregunta o frase

                cadena = br.readLine();
                return cadena;
            } catch (IOException ioe) {
                System.out.println("Sorry, there has been an error, please introduce your input again.");
            }
        }
    }

    /**
     * This functions reads an integrer number
     * @return number introduced
     */
    public static int leerInt() {
        String cadena;
        while(true){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                cadena = br.readLine();
                int num = Integer.parseInt(cadena);
                return num;
            } catch (IOException ioe) {
                System.out.println("Sorry, there has been an error, please introduce your input again.");
            }
        }
    }



    /**
     * This function returns an array containing the introduced numbers by the user until the user introduces a 0
     * @param question
     * @return
     */
    public static int[] introduceNumeros(String question){
        System.out.print(question);
        int[] arrayints = new int[1000];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int intLeido = 1;
            int index=0;
            while (intLeido != 0) {
                    String intLeidoString = br.readLine();
                    intLeido = Integer.parseInt(intLeidoString);
                    arrayints[index]= intLeido;
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
        return arrayints;
    }


}
