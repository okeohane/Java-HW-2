/*
Displays a specific patterned triangle
*/

package javaapplication2;
public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 9; i++)    //refers to line #
        {
            for (int j = 10-i; j >= 1; j--) //refers to # of tabs
            {
                System.out.print(" ");
            }
            
            for(int k = i; k >= 1; k--) //count down numbers
            {
                System.out.print(k);
            }
            System.out.println();   //goes to next line
        }
    }
}
