package ProjectClasses;

import java.util.ArrayList;

public class Class {
    private String className;
    public ArrayList<Lesson>lessonsListOfClass;
    public ArrayList<Student>studentsListOfClass;

    public void setClassName(String className){this.className = className;}

    public String getClassName(){return className;}

    public Class(){
        lessonsListOfClass = new ArrayList<>();
        studentsListOfClass = new ArrayList<>();
    }
}
