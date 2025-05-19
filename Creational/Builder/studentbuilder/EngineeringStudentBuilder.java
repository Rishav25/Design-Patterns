package studentbuilder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends AbstractStudentBuilder{

    List<String> subjects;

    @Override
    public AbstractStudentBuilder setSubjects(){
        subjects = new ArrayList<>();
        subjects.add("Data Structures and Algorithms");
        subjects.add("Thermodynamics");
        subjects.add("Digital Electronics");
        subjects.add("Strength of Materials");

        return this;
    }

    @Override
    public List<String> getSubjects(){
        return this.subjects;
    }
}
