

class StudentReport {
    private int id;
    private String name;
    private int age;
    private String course;
    private double cgpa;

    public StudentReport(int id, String name, int age, String course, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.cgpa = cgpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Project_01 {
   public static void main(String[] args) {
       StudentReport s = new StudentReport(101, "Abdullah Shaikh", 20, "B Tech CSE", 8.9);


    }
}







