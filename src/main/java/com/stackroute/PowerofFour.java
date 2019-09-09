package com.stackroute;
class PowerofFour{
    public int checkPower(int n){
        int flag=1;
        while(n>1){
            if(n%4!=0){
             flag=0;
             break;
            }
            n=n/4;
        }
        return flag;
    }
}