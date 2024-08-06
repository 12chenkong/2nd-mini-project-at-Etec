package oppconcept;

public class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        Student student=new Student(101,"Chan",34);
        student.display();
    }
}
