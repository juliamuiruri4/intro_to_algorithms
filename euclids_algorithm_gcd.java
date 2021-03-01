/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class euclids_algorithm_gcd {
    
    static int ans = 0; //declare a static variable to store the answer
    
     //function that returns the gcd o0f 2 numbers
    public static int get_gcd(int m,int n){
        
            /*if (n != 0) {
               int r = n % m;
               m = n;
               n = r;
                } else 
                return m;*/
            
            for(int i = 1; i < 3; i ++) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
}
    public static void main (String[] args) {
        int m,n = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's find the gratest common divisor of your 2 elements");
        System.out.println("Enter first number: ");
        m = scan.nextInt();
        
        System.out.println("Enter second number: ");
        n = scan.nextInt();
        
        
        ans = get_gcd(m,n);
        System.out.println(ans);
        
    }
    
}
