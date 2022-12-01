/**
 * @author Klemens
 * @version 1.0
 */

package de.hfu;

import java.util.Scanner;

/**
* This is my solution for Open Source based Software Development - Task 5
*/
public class App 
{
	/**
	 * 
	 * @param args The Parameter which is given by the user executing the application in Terminal.
	 */
	
    public static void main( String[] args )
    {
        System.out.println( "Bitte Zeichenkette eingeben." );
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        sc.close();
        eingabe = eingabe.toUpperCase();
        System.out.println(eingabe);
    }
}
