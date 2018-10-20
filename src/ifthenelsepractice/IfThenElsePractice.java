/*
Mouner Dabjan
October 20 2018
Factor a quadratic expression 
 */
package ifthenelsepractice;
import java.util.Scanner; 

/**
 *
 * @author canada
 */
public class IfThenElsePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // variable 
        
        String response1;
        String response2;
        String response3; 
        
        
        Scanner keyedInput = new Scanner (System.in); 
        
        // output 
        
        System.out.println("You are given a math expression to factor"); 
        System.out.println("");
        System.out.println("Can you common factor or use the difference of two sqaures method?");
        response1 = keyedInput.nextLine(); 
        
        // if statements
        
        if (response1.equals("yes"))
        {
            System.out.println("Nice! That's the method that you should use to factor");
        }
        else
        {
            System.out.println("Can you use the simple trinomial method?");
            response2 = keyedInput.nextLine();
            if (response2.equals("yes"))
            {
                System.out.println("Nice! That's the method that you should use to factor");
            }
            else
            {
                System.out.println("Can you common factor the Complex Trinomial?");
                response3 = keyedInput.nextLine();
                if (response3.equals("yes"))
                {
                    System.out.println("Nice! Facotr it then use the simple trinomial method if possible");
                }
                else
                {
                    System.out.println("The expression can't be factored");
                }
            }
        }
    }
    
}
