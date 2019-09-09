package com.stackroute;

public class StudentMarks {
    public double Average(int[] mark){
        int sum=0;
        for(int i=0;i<mark.length;i++){
            sum=sum+mark[i];
        }
       return (double)sum / mark.length;
    }

    public int Max(int[] mark){
        int max;
        max=mark[0];
        for(int i=1;i<mark.length;i++){
            if(max<mark[i])
                max=mark[i];
        }
        return max;
     }

     public int Min(int[] mark){
        int min;
        min=mark[0];
        for(int i=1;i<mark.length;i++){
            if(min>mark[i])
                min=mark[i];
        }
         return min;
     }

     public void getMarks(){
        int n;
     }
}
