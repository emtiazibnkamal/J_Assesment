package com.company;

class A{
    public void A(){
        System.out.println("Parent class A");
    }
}
class B extends A{
    public void B(){
        System.out.println("class B child class of A");
    }
}

class C extends A{
    public void C(){
        System.out.println("class C child class of A");
    }
}

public class Main {



    public static void main(String[] args) {
	// write your code here
        A a = new A();
        a.A();
        B b = new B();
        b.B();
        C c=new C();
        c.C();
// calling A() by object of B and C class
        b.A();
        c.A();

    }
}
