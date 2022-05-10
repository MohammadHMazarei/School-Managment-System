package ProjectClasses;

import java.util.ArrayList;

public class School {
    private int schoolId;
    private String schoolName;
    private String provinceName;
    private String cityName;
    private String schoolAddress;
    private String section;
    public ArrayList<Class>classesList;
    public ArrayList<Student>studentsList;
    public ArrayList<Teacher>teachersList;
    public ArrayList<Lesson>lessonsList;
    private Teacher manager;

    public void setSchoolId(int schoolId){this.schoolId = schoolId;}
    public void setSchoolName(String schoolName){this.schoolName = schoolName;}
    public void setProvinceName(String provinceName){this.provinceName = provinceName;}
    public void setCityName(String cityName){this.cityName = cityName;}
    public void setSchoolAddress(String schoolAddress){this.schoolAddress = schoolAddress;}
    public void setSection(String section){this.section = section;}
    public void setManager(Teacher manager){this.manager = manager;}

    public int getSchoolId(){return schoolId;}
    public String getSchoolName(){return schoolName;}
    public String getProvinceName(){return provinceName;}
    public String getCityName(){return cityName;}
    public String getSchoolAddress(){return schoolAddress;}
    public String getSection(){return section;}
    public Teacher getManager(){return manager;}

    public School(){
        classesList = new ArrayList<>();
        studentsList = new ArrayList<>();
        teachersList = new ArrayList<>();
        lessonsList = new ArrayList<>();
    }
}
