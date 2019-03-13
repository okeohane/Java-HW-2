/*
Prompts the user to enter a string and displays the string in reverse order.
*/

package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String string = input.next();
        
        String reverse = "";    //initialize reverse of string
        for (int i = string.length() - 1; i >= 0; i--)  //start at end of string
        {
            reverse += string.charAt(i);    //add characters to reverse starting at back
        }
        System.out.println("Reverse: " + reverse);
    }
}
