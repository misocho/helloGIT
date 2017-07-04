/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forLoop;

import java.util.Scanner;
/**
 *
 * @author student
 */
public class factors {
    public static void main(String[] args){
        int number;
        int factor;
        Scanner read = new Scanner (System.in);
        System.out.print("Input number: ");
        number = read.nextInt();
        
        for (factor=1; factor<=number; factor++){
            if((number%factor)==0){
                System.out.println(factor);
            }
        }
    }
}
