/*
Prompts the user to enter a string and displays the number of vowels and consonants 
as well as the number of uppercase and lowercase characters in the string.
*/

package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a string: ");
        String phrase = input.nextLine();
        
        int numVowel = 0;
        int numCons = 0;
        int numUpper = 0;
        int numLower = 0;
        
        for(int i = 0; i < phrase.length(); i ++)
        {
            //if the character is not a letter, go to next iteration of loop
            if(!Character.isLetter(phrase.charAt(i)))
                continue;
            
            //checks for upper, if not upper, automatically lower
            if(Character.isUpperCase(phrase.charAt(i)))
                numUpper++;
            else
                numLower++;
            
            char letter = Character.toLowerCase(phrase.charAt(i)); //set letter to lowercase
            //checks for vowels, if not vowel, automatically consonant
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                numVowel++;
            else
                numCons++;
        }
        
        System.out.println("The number of vowels is " + numVowel);
        System.out.println("The number of consonants is " + numCons);
        System.out.println("The number of uppercase characters is " + numUpper);
        System.out.println("The number of lowercase characters is " + numLower);
    }
}
