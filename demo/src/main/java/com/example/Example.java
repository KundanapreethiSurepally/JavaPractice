package com.example;

// class Shape{
//     String color;
// }
// class Triangle extends Shape{
    
// }
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world!");
//     }
// }
class A{

    public  void show(){
        System.out.println("in show");
    }


    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}




public class Example {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();
    }
}
