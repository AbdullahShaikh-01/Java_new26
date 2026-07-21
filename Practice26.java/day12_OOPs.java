//class Student {
//    String name;
//    int age;
//    int salary;
//
//    public void study() {
//        System.out.println(name + " this is my name");
//        System.out.println("my age is " +age);
//    }
//    public void printSalary(){
//        System.out.println("my salary is " +salary);
//    }
//
//}
//public class day12_OOPs{
//    public static void main(String[] args){
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        s1.name = "Abdullah";
//        s1.age = 20;
//        s1.salary = 23;
//
//        s2.name = "Babu";
//        s2.age = 19;
//        s2.salary = 34;
//
//        s1.study();
//        s1.printSalary();
//        System.out.println();
//        s2.study();
//        s2.printSalary();
//
//    }
//}

//class Square{
//    int side;
//
//    public void setside(int n){
//        side=n;
//
//    }
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//    public static void main(String[] args){
//
//    Square s1 = new Square();
//    s1.setside(8);
//        System.out.println("Area = "+s1.area());
//        System.out.println("Perimeter = "+s1.perimeter());
//
//    }
//}

//class Cellphone{
//    public void printRinging(){
//        System.out.println("ringing");
//    }
//    public void printVibrating(){
//        System.out.println("vibrating");
//    }
//
//    public static void main(String[] args){
//        Cellphone s1 = new Cellphone();
//        s1.printRinging();
//        s1.printVibrating();
//    }
//}



//class Rectangle{
//   int length;
//   int breadth;
//
//
//    public void setSides(int a, int b){
//        length=a;
//        breadth=b;
//
//    }
//    public int area(){
//        return length*breadth;
//    }
//    public int perimeter(){
//        return 2*(length+breadth);
//    }
//    public static void main(String[] args){
//
//    Rectangle s1 = new Rectangle();
//    s1.setSides(8, 6);
//        System.out.println("Area = "+s1.area());
//        System.out.println("Perimeter = "+s1.perimeter());
//
//    }
//}


//class MyEmployee{
//    private int id;
//    private String name;
//    private int salary;
//
//    public void setId(int n){
//        this.id=n;
//
//    }
//    public int  getId(){
//
//        return id;
//    }
//
//    public void setName(String  i){
//        this.name=i;
//
//    }
//    public String  getName(){
//
//        return name;
//    }
//    public void setSalary(int j){
//        salary=j;
//
//    }
//    public int  getSalary(){
//
//        return salary;
//    }
//
//
//    public static void main(String[] args){
//        MyEmployee s1 = new MyEmployee();
//        s1.setId(12);
//        System.out.println(s1.getId());
//
//        s1.setName("Abdullah");
//        System.out.println(s1.getName());
//
//        s1.setSalary(15000);
//        System.out.println(s1.getSalary());
//
//
//    }
//
//
//}

//
//class Circle{
//    private int radius;
//    private double area;
//    private double parimeter;
//
//    public void setRadius(int n){
//        if(n>=0){
//
//        this.radius=n;
//        }else{
//            System.out.println("Radius cannot be negative.");
//        }
//    }
//    public int getRadius(){
//        return radius;
//    }
//
//    public void setArea(double area){
//        double actualArea = Math.PI*radius*radius;
//        if(Math.abs(area-actualArea)<0.01){
//            this.area=area;
//        }else{
//            System.out.println("Wrong Area");
//        }
//
//
//    }
//
//
//    public double getArea(){
//        return area;
//    }
//
//    public void setParimeter(double perimeter){
//        double actualPerimeter = 2*Math.PI*radius;
//        if(Math.abs(perimeter - actualPerimeter) < 0.01){
//            this.parimeter=perimeter;
//        }else{
//            System.out.println("Wrong Perimeter");
//        }
//    }
//
//    public double getParimeter(){
//        return parimeter;
//    }
//
//
//
//
//
//    public static void main(String[] args){
//        Circle a1 = new Circle();
//
//        a1.setRadius(7);
//
//        a1.setArea(153.93804002589985);
//        System.out.println(a1.getArea());
//
//
//    }
//
//}

//class Employee{
//    String name;
//    int salary;
//
//    Employee(String n, int a){
//        name=n;
//        salary=a;
//    }
//    public static void main(String[] args){
//
//    Employee s1= new Employee("ABDULLAH", 20000);
//
//        System.out.println(s1.name);
//        System.out.println(s1.salary);
//    }
//}

//class Student{
//    String name;
//    int age;
//    String course;
//
//    Student(String name, int age, String course){
//        this.name=name;
//        this.age=age;
//        this.course=course;
//
//
//    }
//
//    public void display(){
//        System.out.println("Name: "+name);
//        System.out.println("Age: "+age);
//        System.out.println("Course: "+course);
//    }
//
//    public static void main(String[] args){
//        Student s2 = new Student("Abdullah", 20, "B Tech CSE");
//        Student s3 = new Student("Saziya", 19, "M Tech");
//
//        s2.display();
//        System.out.println();
//        s3.display();
//    }
//
//}
//
//class MainEmpoyee{
//    int salary;
//
//    public MainEmpoyee(int salary){
//        this.salary = salary;
//    }
//
//    public MainEmpoyee(){
//        this.salary=25000;
//    }
//
//    public static void main(String[] args){
//        MainEmpoyee d1 = new MainEmpoyee(10000);
//        MainEmpoyee d2 = new MainEmpoyee();
//        System.out.println(d1.salary);
//        System.out.println(d2.salary);
//    }
//}

//import java.util.Scanner;
//
//public class day12_OOPs {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Guess the number: ");
//        int target = 50;
//        int num=sc.nextInt();
//
//        while (num!=target){
//            if (num<target){
//                System.out.println("Too Low");
//            } else{
//                System.out.println("Too High");
//
//            }
//            System.out.println("Sorry Bro, Guess Again");
//            num = sc.nextInt();
//        }
//        System.out.println("Congratulation Bro, You Are Guess Right Number");
//
//
//
//
//
//        }
//
//    }

//import java.util.Scanner;
//
//class GuessGame {
//    int target;
//
//    GuessGame(int target) {
//        this.target = target;
//    }
//
//    void playGame() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Guess a number: ");
//        int num = sc.nextInt();
//
//        while (num != target) {
//            if (Math.abs(target - num)<=5){
//                System.out.println("Very Close!");
//            } else if (num<target){
//                System.out.println("Too Low!");
//            }else{
//                System.out.println("Too High!");
//            }
//
//            System.out.println("Oops Guess Again !");
//            num = sc.nextInt();
//
//        }
//        System.out.println("Congratulations Bro !");
//        sc.close();
//
//
//    }
//
//    public static void main(String[] args) {
//        GuessGame game = new GuessGame(50);
//        game.playGame();
//
//    }
//
//}


//class Cylinder{
//    private double radius;
//    private double height;
//
//    public void setRadius(double radius){
//        if(radius>0){
//        this.radius=radius;
//
//        }else {
//            System.out.println("Invalid Radius!");
//        }
//    }
//    public double getRadius(){
//        return radius;
//    }
//
//    public void setHeight(double height){
//        this.height=height;
//    }
//    public double getHeight(){
//        return height;
//    }
//
//    public double getSurfaceArea(){
//        return 2 * Math.PI *radius*(radius+height);
//    }
//    public double getVolume(){
//        return Math.PI * radius*radius*height;
//    }
//    public static void main(String[] args){
//        Cylinder f1 = new Cylinder();
//        f1.setRadius(7);
//        f1.setHeight(6);
//        System.out.printf("Surface Area: %.2f%n",f1.getSurfaceArea());
//        System.out.printf("Volume: %.2f%n",f1.getVolume());
//    }
//}

//class Rectangle{
//    private double length;
//    private double breadth;
//
//    Rectangle(){
//        this.length=4;
//        this.breadth=5;
//    }
//
//    Rectangle(double length, double breadth){
//        this.length=length;
//        this.breadth=breadth;
//    }
//
//
//
//    double getArea(){
//        return length*breadth;
//
//    }
//    double getPerimeter(){
//        return 2*(length+breadth);
//
//
//    }
//
//
//    public static void main(String[] args){
//        Rectangle g1 = new Rectangle();
//        Rectangle g2 = new Rectangle(12, 9);
//
//        System.out.println("Rectangle 1");
//
//        System.out.printf("Area: %.2f%n",g1.getArea());
//        System.out.printf("Perimeter: %.2f%n",g1.getPerimeter());
//
//        System.out.println();
//
//        System.out.println("Rectangle 2");
//
//        System.out.printf("Area: %.2f%n",g2.getArea());
//        System.out.printf("Perimeter: %.2f%n",g2.getPerimeter());
//    }
//
//
//}


//class Base {
//    int x;
//
//    public int getX() {
//        System.out.println("This Function is from getX!");
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//
//    static class  Derived extends Base{
//        int y;
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//    }
//
//    public static void main(String[] args){
//        Base b = new Base();
//        Derived d = new Derived();
//        b.setX(4);
//        System.out.println(b.getX());
//
//        d.setX(6);
//        System.out.println(d.getX());
//    }
//
//
//}
//

//    class Animal{
//        void eat(){
//            System.out.println("Animal is eating!");
//        }
//
//    }
//    class Dog extends Animal{
//        void bark(){
//            System.out.println("Dog are Bark!");
//        }
//    }
//public class day12_OOPs{
//
//  public static void main(String[] args){
//    Dog d = new Dog();
//    d.eat();
//    d.bark();
//  }
//}

//class Vehicle{
//    String brand;
//    int speed;
//
//    void display(){
//        System.out.println("Brand: "+brand);
//        System.out.println("Speed: "+ speed + "KMH");
//    }
//}
//class Car extends Vehicle{
//    String fuelType;
//
//    void showFuelType(){
//        System.out.println("Fuel Type: "+fuelType);
//    }
//}
//
//public class day12_OOPs{
//    public static void main(String[] args){
//        Car c = new Car();
//        c.brand="Mahindra";
//        c.speed= 100;
//        c.fuelType="Diesel";
//        c.display();
//        c.showFuelType();
//    }
//}

//class Person{
//    void walk(){
//        System.out.println("Person is walking!");
//    }
//}
//class Employee extends Person{
//    void work(){
//        System.out.println("Employee is working!");
//    }
//}
//
//class Manager extends Employee{
//    void manage(){
//        System.out.println("Manager is managing!");
//    }
//}
//
//public class day12_OOPs{
//    public static void main(String[] args){
//        Manager m = new Manager();
//        m.walk();
//        m.work();
//        m.manage();
//    }
//}

//class Base1{
//    Base1(){
//        System.out.println("I am a Base1 Constructor!");
//    }
//}
//class Derived extends Base1{
//    Derived(){
//        System.out.println("I am a Derived Constructor!");
//    }
//    Derived(int x){
//        System.out.println("I am a Derived class constructor: "+x);
//    }
//}
//class ChildOfDerived extends Derived{
//    ChildOfDerived(){
//        System.out.println("I am a ChildOfDerived Constructor!");
//    }
//    ChildOfDerived(int x, int y){
//        super(x);
//        System.out.println("I am a ChildOfDerived class constructor: "+y);
//    }
//}
//
//class ChildWoodDerived extends ChildOfDerived{
//    ChildWoodDerived(){
//        System.out.println("I am a ChildWoodDerived Constructor!");
//    }
//    ChildWoodDerived(int x, int y, int z){
//        super(x,y);
//        System.out.println("I am a ChildWoodDerived class constructor: "+z);
//    }
//}
//
//public class day12_OOPs{
//    public static void main(String[] args){
//        Base1 b1 = new Base1();
//       ChildOfDerived c = new ChildOfDerived(12, 45);
//        ChildWoodDerived ch = new ChildWoodDerived(12,54,78);
//    }
//}


//class LivingBeing {
//    LivingBeing(){
//        System.out.println("LivingBeing Constructor!");
//    }
//}
//class Animal extends LivingBeing{
//
//    Animal(String type){
//        System.out.println("Animal Type: "+type);
//
//    }
//
//}
//
//class Dog extends Animal{
//    Dog(String type, String breed){
//        super(type);
//        System.out.println("Breed: "+breed);
//    }
//}
//
//public class day12_OOPs {
//    public static void main(String[] args){
//        Dog b1 = new Dog("Dog", "Labrador");
//
//    }
//}
//

//
//class Bird{
//    void fly(){
//        System.out.println("Bird is flying!");
//    }
//}
//class Eagle extends Bird{
//    @Override
//    void fly(){
//        System.out.println("Eagle flies very high as compare Bird!");
//    }
//}
//
//public class day12_OOPs {
//   public static void main(String[] args) {
//       Eagle e = new Eagle();
//
//       e.fly();
//
//    }
//}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void displayPerson(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }

}
class Employee extends Person{
    private int employeeId;
    private double salary;

   public Employee(String name, int age, int employeeId, double salary){
        super(name, age);
        this.employeeId= employeeId;
        this.salary=salary;
    }
    public void setEmployeeId(int employeeId){
       this.employeeId=employeeId;
    }
    public int getEmployeeId(){
       return employeeId;
    }

    public void setSalary(double salary){
       this.salary=salary;
    }
    public double getSalary(){
       return salary;
    }

    public void displayEmployee(){
        System.out.println("Employee ID: "+getEmployeeId());
        System.out.printf("Salary: %.2f%n",getSalary());
    }
}
class Manager extends Employee {
    private String department;

    public Manager(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Department: " + getDepartment());
    }
}
public class day12_OOPs {
     public static void main(String[] args) {
         Manager m = new Manager("Abdullah Shaikh", 20, 101, 500000, "IT Sector");
         m.displayPerson();
         System.out.println();
         m.displayEmployee();

    }
}










