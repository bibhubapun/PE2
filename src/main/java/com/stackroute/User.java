package com.stackroute;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int Salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    User(String f, String l, int a, int s){
        this.firstName=f;
        this.lastName=l;
        this.age=a;
        this.Salary=s;
    }
    public String isValidAge(){
        if(this.age>=18&&this.age<=60){
            return "Age is valid";
        }
        else{
            return "Age is invalid";
        }
    }
    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }
}
