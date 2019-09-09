package com.stackroute;

import com.stackroute.Member;
public class MemberVariable {

    Member m=new Member();
   public void set(String n, int a, double s){
       m.name=n;
       m.salary=s;
       m.age=a;
   }
   String s;
   String display(String name,int age,double sal) {
       s="";
       set(name,age,sal);
       s = s + "Name: " + m.name + ", Age: " + m.age + ", Salary: " + m.salary;
       return s;
   }


}
