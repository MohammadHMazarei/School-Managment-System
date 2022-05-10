package ProjectClasses;

import java.util.Date;

public class Student extends Person{
    private long nationalCode;
    private String parentName;
    private String parentPhoneNumber;
    private StringBuilder birthday;
    private Date dateOfArrivalAtSchool;

    public void setNationalCode(long nationalCode){this.nationalCode = nationalCode;}
    public void setParentName(String parentName){this.parentName = parentName;}
    public void setParentPhoneNumber(String parentPhoneNumber){this.parentPhoneNumber = parentPhoneNumber;}
    public void setBirthday(StringBuilder birthday){this.birthday = birthday;}
    public void setDateOfArrivalAtSchool(Date dateOfArrivalAtSchool){this.dateOfArrivalAtSchool = dateOfArrivalAtSchool;}

    public long getNationalCode(){return nationalCode;}
    public String getParentName(){return parentName;}
    public String getParentPhoneNumber(){return parentPhoneNumber;}
    public StringBuilder getBirthday(){return birthday;}
    public Date getDateOfArrivalAtSchool(){return dateOfArrivalAtSchool;}

    public Student(){
        dateOfArrivalAtSchool = new Date(System.currentTimeMillis());
    }
}
