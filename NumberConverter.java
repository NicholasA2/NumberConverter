/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //First we'll need to get the user's input
        Scanner myOctal = new Scanner(System.in);
        
        System.out.print("Please enter a 4-digits Octal number:");
        int Octal = myOctal.nextInt();
        
        //Now we will take each digit individually to multiply them by the powers of 8 later on
        int LastDigit = Octal % 10;
        int ThirdDigit = Octal % 100;
        int SecondDigit = Octal % 1000;
        int FirstDigit = Octal % 10000;
        
        //Let's also insert the powers of 8
        int FirstEight = (int) Math.pow(8, 0);
        int SecondEight = (int) Math.pow(8, 1);
        int ThirdEight = (int) Math.pow(8, 2);
        int FourthEight = (int) Math.pow(8, 3);
        
        //Now that we have each digit we can multiply them by 8 and its powers
        int LastDecimal = LastDigit * FirstEight;
        int ThirdDecimal = ThirdDigit / 10 * SecondEight;
        int SecondDecimal = SecondDigit / 100 * ThirdEight;
        int FirstDecimal = FirstDigit /1000 * FourthEight;
        //Also, I divided them by 10,100 and 1000 to get the core number instead of the full number(2 instead of 20 for example)
        
        //Now to print the answer
        int CompleteDecimal = LastDecimal + ThirdDecimal + SecondDecimal + FirstDecimal;
        System.out.printf("%nOctal Number \t:%s\n", Octal);
        System.out.printf("Decimal Number \t:%s\n", CompleteDecimal);
        
        
    }
    
}
