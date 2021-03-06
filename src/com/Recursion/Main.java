]package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	print the prime numbers:
	 */
        int n=20;
        for(int i=1;i<n;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
