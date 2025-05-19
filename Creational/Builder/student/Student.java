package student;

import java.util.List;

import studentbuilder.AbstractStudentBuilder;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fathersName;
    String mothersName;
    List<String> subjects;

    public Student(AbstractStudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.getRollNumber();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.fathersName = studentBuilder.getFathersName();
        this.mothersName = studentBuilder.getMothersName();
        this.subjects = studentBuilder.getSubjects();
    }

    @Override
    public String toString(){
        String subjectString = "";
        for(String subject : subjects){
            subjectString += subject + ", ";
        }
        int subjectSubstringLength = subjectString.length();
        subjectString = subjectString.substring(0, subjectSubstringLength-2);

        return "Roll Number : " + rollNumber + "\nName : " + 
                name + "\nAge : " + age + "\nFather's Name : " + fathersName +
                "\nMother's Name : " + mothersName + "\nSubjects : " + subjectString + "\n";
    }
}
