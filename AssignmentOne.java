/*
 * Calvin McCoy
 * CPT-163-27-a01
 * 08/28/2015
 */
package assignmentone;


public class AssignmentOne {
    /*
    *This program is designed to combine ascii characters to create
    * a word display the word. 
    *Then find and display the sum of the chacters
   */
    public static void main(String[] args) {
        //assign characters
        char ch1,ch2,ch3,ch4,ch5;
        
        ch1 = 'r';
        ch2 = 'é';
        ch3 = 's';
        ch4 = 'u';
        ch5 = 'm';
        
        //print word
        System.out.println("My Word is...");
        System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4
        + "" + ch5 + "" + ch2 + "" + ch3);
         
        //convert characters to integers and find the sum
        int chValue;
        chValue = ch1 + ch2 + ch3 + ch4 + ch5 + ch2 + ch3;
        System.out.println("My word's value is...");
        System.out.println(chValue);
    }
    
}

