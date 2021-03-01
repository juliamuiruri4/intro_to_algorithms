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
/*Logic: The gcd cannot be greater than the smallest of the given numbers */
public class consecutive_integer_checking_gcd {
    
    public static int get_gcd(int m,int n){
        int t = Math.min(m, n);
        int r_m = m % t;
        if (r_m == 0) {
            int r_n = n % t;
            if (r_n == 0) {
                return t;
            }
        } else {
            t-=1;
             if (r_m == 0) {
            int r_n = n % t;
            if (r_n == 0) {
                return t;
            }
        } 
        }
        return t;
    }
    public static void main(String[] args) {
        
        int m,n = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        m = scan.nextInt();
        
        System.out.println("Enter second number: ");
        n = scan.nextInt();
        
        System.out.println(get_gcd(m,n));
    }
}
