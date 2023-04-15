package com.driver;

public class Main {

    static class A {//task 1
        public String meth(){
            return "Invoking method from class A";

        }
    }
    static class B extends A {//task 2
        @Override
        public String meth(){// task 4
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B obj1 = new B();//task 3
        System.out.println(obj1.meth());

        B obj2 = new B();
        System.out.println(obj2.meth());// task 5

    }
}
