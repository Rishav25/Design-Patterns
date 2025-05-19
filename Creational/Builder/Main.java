import student.Student;
import studentbuilder.EngineeringStudentBuilder;
import studentbuilder.ManagementStudentBuilder;

public class Main {
    public static void main(String[] args) {
        Director dir1 = new Director(new EngineeringStudentBuilder());
        Director dir2 = new Director(new ManagementStudentBuilder());

        Student student1 = dir1.addStudent();
        Student student2 = dir2.addStudent();

        System.out.println(student1);
        System.out.println(student2);
    }    
}
