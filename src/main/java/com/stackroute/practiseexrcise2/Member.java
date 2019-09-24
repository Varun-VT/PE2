package com.stackroute.practiseexrcise2;

public class Member {
    String name;
    int age;
    double salary;
}
class MemberVariable{
    Member member= new Member();
    MemberVariable(String name, int age, double salary){
        member.name= name;
        member.age= age;
        member.salary= salary;
    }
    public void display(){
        System.out.println("Member Name:"+ member.name);
        System.out.println("Member Age:"+ member.age);
        System.out.println("Member Salary:"+ member.salary);
    }
}
class Test{
    public static void main(String[] args) {
        MemberVariable m= new MemberVariable("Varun",20,55000);
        m.display();
    }
}
