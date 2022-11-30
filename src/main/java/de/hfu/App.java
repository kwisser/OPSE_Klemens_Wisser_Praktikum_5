package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bitte Zeichenkette eingeben." );
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        eingabe = eingabe.toUpperCase();
        System.out.println(eingabe);
    }
}
