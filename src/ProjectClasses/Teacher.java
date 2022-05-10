package ProjectClasses;

public class Teacher extends Staff{
    private int rank;
    private String education;

    public void setRank(int rank){this.rank = rank;}
    public void setEducation(String education){this.education = education;}

    public int getRank(){return rank;}
    public String getEducation(){return education;}
}
