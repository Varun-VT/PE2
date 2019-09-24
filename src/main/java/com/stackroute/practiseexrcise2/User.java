package com.stackroute.practiseexrcise2;

public class User {
    String firstName, lastName;
    private int age;
    private int salary;

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
        if(age >0 && age<100) {
            this.age = age;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isValidAge(){
        if (age>=18 && age<60){
            return true;
        }
        else
            return false;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
}
