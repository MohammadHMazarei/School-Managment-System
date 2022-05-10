package ProjectClasses;

import java.util.ArrayList;

public class Lesson {
    private String lessonName;
    private int numberOfUnits;
    private String days;
    private String hours;
    private Teacher teacher;
    public ArrayList<Student> studentsOfLesson;
    public ArrayList<Student> nationalCodes;
    public ArrayList<Double> scores;

    public void setLessonName(String lessonName){this.lessonName = lessonName;}
    public void setNumberOfUnits(int numberOfUnits){this.numberOfUnits = numberOfUnits;}
    public void setDays(String days){this.days = days;}
    public void setHours(String hours){this.hours = hours;}
    public void setTeacher(Teacher teacher){this.teacher = teacher;}

    public String getLessonName(){return lessonName;}
    public int getNumberOfUnits(){return numberOfUnits;}
    public String getDays(){return days;}
    public String getHours(){return hours;}
    public Teacher getTeacher(){return teacher;}

    public Lesson(){
        teacher = new Teacher();
        studentsOfLesson = new ArrayList<>();
        nationalCodes = new ArrayList<>();
        scores = new ArrayList<>();
    }
}
