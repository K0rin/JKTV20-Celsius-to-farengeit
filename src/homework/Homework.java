/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;


/**
 *
 * @author Владимир
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter celsius gradus: ");
        int celsius;
        celsius = scanner.nextInt();
        System.out.printf("Celsius gradus is %d%n", celsius);
        
        double f;
        f = (9.0 / 5.0)*celsius + 32;
        System.out.format("farengeit gradus is %.3f%n", f);
        
    }
    
}
