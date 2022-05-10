package ProjectClasses;

import java.util.Date;

public class Staff extends Person{
    private int personalCode;
    private String phoneNumber;
    private Date hiringDate;
    private int salary;

    public void setPersonalCode(int personalCode){this.personalCode = personalCode;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public void setHiringDate(Date hiringDate){this.hiringDate = hiringDate;}
    public void setSalary(int salary){this.salary = salary;}

    public int getPersonalCode(){return personalCode;}
    public String getPhoneNumber(){return phoneNumber;}
    public Date getHiringDate(){return hiringDate;}
    public int getSalary(){return salary;}

    public Staff(){hiringDate = new Date(System.currentTimeMillis());}
}
