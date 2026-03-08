package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double ans = new Maths().addition();
        System.out.println(ans);
    }
}
class Maths
{
    double addition()
    {
        double a=10.5,b=20,c;
        c=a+b;

        return c;


    }
}