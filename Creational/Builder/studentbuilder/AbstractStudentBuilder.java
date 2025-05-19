package studentbuilder;

import java.util.List;

import student.Student;

public abstract class AbstractStudentBuilder {
    int rollNumber;
    int age;
    String name;
    String fathersName;
    String mothersName;
    List<String> subjects;

    //StudentBuilder sb;
    // sb.setAge(25).setName("Rishav Panda").

    public AbstractStudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public AbstractStudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AbstractStudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public AbstractStudentBuilder setFathersName(String fathersName){
        this.fathersName = fathersName;
        return this;
    }

    public AbstractStudentBuilder setMothersName(String mothersName){
        this.mothersName = mothersName;
        return this;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getFathersName(){
        return this.fathersName;
    }

    public String getMothersName(){
        return this.mothersName;
    }

    // implementation done by the concrete classes
    public abstract AbstractStudentBuilder setSubjects();
    public abstract List<String> getSubjects();

    public Student build(){
        return new Student(this);
    }

}
