package com.driver;

public class Main {

   public static class A {//task 1
        public String meth(){
            return "Invoking method from class A";

        }
    }
    public static class B extends A {//task 2
        @Override
        public String meth(){// task 4
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B obj1 = new B();//task 3
        //System.out.println();
        obj1.meth();

        B obj2 = new B();
        //System.out.println();// task 5
        obj2.meth();

    }
}
