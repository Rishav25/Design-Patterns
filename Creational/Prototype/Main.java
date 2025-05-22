import object.Student;

public class Main{
    public static void main(String[] args) {
        Student student1 = new Student(100, 1, "2025");
        Student student2 = (Student)student1.clone();
        Student student3 = (Student)student2.clone();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}