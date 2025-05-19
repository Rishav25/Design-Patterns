package studentbuilder;

import java.util.ArrayList;
import java.util.List;

public class ManagementStudentBuilder extends AbstractStudentBuilder{

    List<String> subjects;

    @Override
    public AbstractStudentBuilder setSubjects(){
        subjects = new ArrayList<>();
        subjects.add("Finance Management");
        subjects.add("Business Studies");
        subjects.add("Economics");
        subjects.add("Accounting");

        return this;
    }

    @Override
    public List<String> getSubjects(){
        return this.subjects;
    }
}
