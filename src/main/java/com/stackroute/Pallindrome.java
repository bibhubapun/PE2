package com.stackroute;
class Pallindrome{
    public String checkP(String pstring){
        String s="", s1="Yes";
        for(int i=pstring.length()-1;i>=0;i--){
            s=s+pstring.charAt(i);
        }
        if(s.equals(pstring)){
            return s1;
        }
        else{
            return null;
        }
    }
}