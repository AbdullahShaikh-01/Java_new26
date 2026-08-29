package calc;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Calculate{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class SubCalc{
    public void sub(int a, int b){
        System.out.println(a-b);
    }
}

class HybridCalc{
    public void Square(int a){
        System.out.println(a*a*a);
    }
}

class Display {
    Scanner sc = new Scanner(System.in);
    String greet;
    public void display(){
        System.out.println(sc.nextLine());
    }

}

public class Problem1 {
    public static void main() {
        System.out.println("I am main method!");
        Display d = new Display();
        d.display();
    }
}