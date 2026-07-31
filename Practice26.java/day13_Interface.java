//////interface Animal{
//////    void sound();
//////
//////}
//////interface Human{
//////    void HumanSound();
//////}
//////class Sound implements Animal, Human{
//////    public void HumanSound(){
//////        System.out.println("human sound----- oyyyeeeeee");
//////    }
//////
//////    public void sound() {
//////        System.out.println("Animal sound------- howwwwwwwwww");
////////    }
////////
////////    }
////////
////////    public class day13_Interface {
////////       public static void main(String[] args) {
////////           Animal a = new Sound();
////////           Sound s = (Sound) a;
////////           Human h = s;
////////
////////           h.HumanSound();
////////           a.sound();
////////
////////        }
////////}
////////
//////
//////interface Vehicle{
//////    void start();
//////    void stop();
//////}
//////class Car implements Vehicle{
//////    @Override
//////   public void start(){
//////        System.out.println("Car started!");
//////    }
//////
//////    public void stop(){
//////        System.out.println("Car stopped!");
//////    }
//////
//////}
//////class Bike implements Vehicle{
//////    @Override
//////    public void start(){
//////        System.out.println("Bike started!");
//////    }
//////
//////    public void stop(){
//////        System.out.println("Bike stopped!");
//////    }
//////}
//////
//////
//////public class day13_Interface {
//////    public static void main(String[] args) {
//////
//////        Vehicle v = new Car();
//////        Vehicle v1 = new Bike();
//////        v.start();
//////        v.stop();
//////
//////        System.out.println();
//////
//////        v1.start();
//////        v1.stop();
//////
//////    }
//////}
////
////interface Animal{
////    void sound();
////}
////
////class Dog implements Animal{
////    @Override
////    public void sound(){
////        System.out.println("Dog -> Bark");
////    }
////}
////class  Cat implements Animal{
////    @Override
////    public void sound(){
////        System.out.println("Cat -> Meow");
////    }
////}
////
////class Lion implements Animal{
////    @Override
////    public void sound(){
////        System.out.println("Lion -> Roar");
////    }
////}
////
////public class day13_Interface {
////   public static void main(String[] args) {
////       Animal a1 = new Dog();
////       Animal a2 = new Cat();
////       Animal a3 = new Lion();
////
////       a1.sound();
////       a2.sound();
////       a3.sound();
////
////    }
////}
////
////
//
////interface Flyable{
////    void fly();
////}
////interface Swimmable{
////    void swim();
////}
////class Duck implements Flyable, Swimmable{
////    @Override
////    public void fly(){
////        System.out.println("Duck are Flying!");
////    }
////    @Override
////    public void swim(){
////        System.out.println("Duck are Swimming");
////    }
////}
////
////public class day13_Interface {
////    public static void main(String[] args) {
////        Flyable f = new Duck();
////        Swimmable s = new Duck();
////        f.fly();
////        s.swim();
////
////
////    }
////}
//
////interface Vehicle{
////    void start();
////
////    default void stop(){
////        System.out.println("Vehicle stopped----");
////    }
////}
////
////class Car implements Vehicle{
////    @Override
////    public void start(){
////        System.out.println("Vehicle starting----");
////    }
////
////
////}
////
////public class day13_Interface {
////    public static void main(String[] args) {
////        Vehicle v1 = new Car();
////        v1.start();
////        v1.stop();
////
////    }
////}
////
////interface Vehicle{
////    void start();
////
////    default void stop(){
////        System.out.println("Stopped!");
////    }
////
////
////}
////
////class Car implements Vehicle{
////    @Override
////    public void start(){
////        System.out.println("Vehicle Starting -----");
////    }
////}
////
////public  class day13_Interface {
////   public static void main() {
////        Vehicle v = new Car();
////
////        v.start();
////        v.stop();
////    }
////}
//
//
//interface SampleClass{
//    void meth1();
//    void meth2();
//}
//
//interface MySampleClass extends SampleClass{
//    void meth3();
//    void meth4();
//}
//
//class ChildMySampleClass implements MySampleClass{
//    public void meth1(){
//        System.out.println("Printing Meth1-----");
//    }
//    public void meth2(){
//        System.out.println("Printing Meth2-----");
//    }
//    public void meth3(){
//        System.out.println("Printing Meth3-----");
//    }
//    public void meth4(){
//        System.out.println("Printing Meth4-----");
//    }
//}
//
//
//public class day13_Interface {
//    public static void main(String[] args) {
//        ChildMySampleClass cs = new ChildMySampleClass();
//
//        cs.meth1();
//        cs.meth2();
//        cs.meth3();
//        cs.meth4();
//
//    }
//}


//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//
//
//
//}
//
//class FountainPen extends Pen{
//    void write(){
//        System.out.println("Writing----");
//    }
//    void refill(){
//        System.out.println("Refilling----");
//    }
//    void changeNib(){
//        System.out.println("Changing Nib----");
//    }
////}
////
////public class day13_Interface {
////    public static void main(String[] args) {
////        Pen p = new FountainPen();
////        p.write();
////        p.refill();
////
////        FountainPen fp = (FountainPen) p;
////        fp.changeNib();
////
////
////
////    }
////}
//
//

//class Monkey{
//    void jump(){
//        System.out.println("Monkey Jumped");
//    }
//    void bite(){
//        System.out.println("Monkey Take Some Bite");
//    }
//
//}
//
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//
//class Human extends Monkey implements BasicAnimal{
//    @Override
//    public void eat(){
//        System.out.println("Eating");
//    }
//    @Override
//    public void sleep(){
//        System.out.println("Sleeping");
//    }
//}
//
//
//public class day13_Interface {
//    public static void main(String[] args) {
//        Monkey m = new Human();
////        Human h = (Human) m;
//
//        m.jump();
//        m.bite();
//
//
//    }
//}

//abstract class TelePhone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disConnect();
//
//}
//class SmartPhone extends TelePhone{
//    void camera(){
//        System.out.println("Phone Suiting----");
//    }
//    @Override
//    public void ring(){
//        System.out.println("Phone Ringing-----");
//    }
//    @Override
//    public void lift(){
//        System.out.println("Lifting----");
//    }
//    @Override
//    public void disConnect(){
//        System.out.println("Phone Disconnecting-----");
//    }
//
//
//}
//
//public class day13_Interface {
//   public static void main(String[] args) {
//        TelePhone tp = new SmartPhone ();
//        SmartPhone sp = (SmartPhone) tp;
//
//        tp.ring();
//        tp.lift();
//        tp.disConnect();
//
//        sp.camera();
//    }
//}

interface TvRemote{
    void button();
}

interface SmartTvRemote extends TvRemote{
    void smartButton();

}

class Tv implements SmartTvRemote{
    public void button(){
        System.out.println("Button");
    }
    public void smartButton(){
        System.out.println("SmartButton");
    }

}

public class day13_Interface {
   public static void main(String[] args) {

       Tv t = new Tv();

       t.button();
       t.smartButton();
    }
}
