import student.Student;
import studentbuilder.AbstractStudentBuilder;
import studentbuilder.EngineeringStudentBuilder;



public class Director {

    AbstractStudentBuilder studentBuilder;

    public Director(AbstractStudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student addStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder)
            return createEngineeringStudent();
        else
            return createManagementStudent();
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setName("Rishav Panda").setFathersName("Haladhar Panda").setAge(25).setSubjects().build();
    }

    private Student createManagementStudent(){
        return studentBuilder.setRollNumber(2).setName("Taniya Panda").setMothersName("Maya Panda").setAge(27).setSubjects().build();
    }
    
}
