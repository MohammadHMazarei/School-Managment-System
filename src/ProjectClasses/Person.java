package ProjectClasses;

public class Person {
    private String name;
    private String lastName;
    private String personAddress;
    private String gender;
    private String userName;
    private String password;

    public void setName(String name){this.name = name;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setPersonAddress(String personAddress){this.personAddress = personAddress;}
    public void setGender(String gender){this.gender = gender;}
    public void setUserName(String userName){this.userName = userName;}
    public void setPassword(String password){this.password = password;}

    public String getName(){return name;}
    public String getLastName(){return lastName;}
    public String getPersonAddress(){return personAddress;}
    public String getGender(){return gender;}
    public String getUserName(){return userName;}
    public String getPassword(){return password;}
}
