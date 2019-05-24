/*
Reads integers, finds the largest of them, and counts its occurrences. Assumes the input ends with number 0.
*/

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a list of numbers (separated by spaces): ");
        
        int max = input.nextInt();  //initialize max as first number
        int num = max; //= input.nextInt();  //initialize comparing number as second num
        int count = 1;  //start count at 1 because max appears once
        
        while(num != 0) //0 represents the end of the numbers
        {
            num = input.nextInt();  //number being compared to max
            
            if(num > max)
            {
                max = num;  //reset max
                count = 1;  //reinitialize count
            }
            else if (num == max)
            {
                count++;    //if current max appears again, increment count
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurence count of the largest number is " + count);
    }
}
