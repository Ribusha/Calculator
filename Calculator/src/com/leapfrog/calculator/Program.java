/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;
import java.util.Scanner;
/**
 *
 * @author MUKESH
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorHelper cal = new CalculatorHelper();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dai k chahiyo: ");
        int firstNum = input.nextInt();
        System.out.println("Didi k chahiyo: ");
        int secondNum = input.nextInt();
        
        cal.Add(firstNum, secondNum);
        
        System.out.println(cal.result);
        
        
    }
    
}
