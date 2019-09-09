package com.stackroute;

public class FactorialLimit {
    public String factorial(int n){
        int f=1;
        if(n>=13){
            return "Factorial out of Range";
        }
        else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            return "Factorial of " + n + " is " + f;
        }
    }

    public String Longfactorial(int n){
        long f=1;
        if(n>=21){
            return "Factorial out of Range";
        }
        else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            return "Factorial of " + n + " is " + f;
        }
    }
}
