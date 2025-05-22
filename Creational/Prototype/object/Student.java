package object;

import prototype.PrototypeI;

public class Student implements PrototypeI{
    int admissionNumber;
    int rollNumber;
    String yearOfJoining;

    public Student(int admissionNumber, int rollNumber, String yearOfJoining){
        this.admissionNumber = admissionNumber;
        this.rollNumber = rollNumber;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public Student clone(){
        return new Student(admissionNumber+1, rollNumber+1, yearOfJoining);
    }

    public String toString(){
        return "Admission Number : " + admissionNumber + "\nRoll Number : " + rollNumber + "\nYear Of Joining : " + yearOfJoining;
    }
}
