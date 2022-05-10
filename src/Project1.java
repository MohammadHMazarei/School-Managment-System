import ProjectClasses.*;
import ProjectClasses.Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Project1 {
    static ArrayList<School> schools = new ArrayList<>();
    static ArrayList<Teacher> schoolTeachers = new ArrayList<>();
    static ArrayList<Student> schoolStudents = new ArrayList<>();

    static int thisSchool = 0 , thisClass = 0 , thisTeacher , thisClassGrade , thisLesson , thisStudentGrade , thisStudent , thisClass1 ;




    static void schoolInfo(int i){ // showing school Information in a Table
        String leftAlignFormat = "| %-35s | %-9d | %-14s | %-35s | %-30s | %-25s | %-50s |%n";
        System.out.format("+-------------------------------------+-----------+----------------+-------------------------------------+--------------------------------+---------------------------+----------------------------------------------------+%n");
        System.out.format("|              School name            |     ID    |    Section     |                Manager              |             Province           |            City           |                     Address                        |%n");
        System.out.format("+-------------------------------------+-----------+----------------+-------------------------------------+--------------------------------+---------------------------+----------------------------------------------------+%n");
        System.out.format(leftAlignFormat , schools.get(i).getSchoolName() , schools.get(i).getSchoolId() , schools.get(i).getSection() ,schools.get(i).getManager().getName() + " " + schools.get(i).getManager().getLastName()  , schools.get(i).getProvinceName() , schools.get(i).getCityName() , schools.get(i).getSchoolAddress());
        System.out.format("+-------------------------------------+-----------+----------------+-------------------------------------+--------------------------------+---------------------------+----------------------------------------------------+%n");
    }




    static void teacherTable(){ // showing school teachers in a table
        String leftAlignFormat = "| %-35s | %-9d |%n";
        System.out.format("+-------------------------------------+-----------+%n");
        System.out.format("|              Teacher name           |     ID    |%n");
        System.out.format("+-------------------------------------+-----------+%n");
        for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
            System.out.format(leftAlignFormat, schools.get(thisSchool).teachersList.get(i).getName() + " " + schools.get(thisSchool).teachersList.get(i).getLastName(), schools.get(thisSchool).teachersList.get(i).getPersonalCode());
            System.out.format("+-------------------------------------+-----------+%n");
        }
    }


    static void showTeacherInfo(int i){   // showing school teachers information in a table
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(schools.get(thisSchool).teachersList.get(i).getHiringDate());
        String leftAlignFormat = "| %-35s | %-9d | %-14s | %-5d | %-11s | %-6s | %-9d | %-9s |%n";
        System.out.format("+-------------------------------------+-----------+----------------+-------+-------------+--------+-----------+---------------------+%n");
        System.out.format("|              Teacher name           |     ID    |  Phone Number  | Rank  | Education   | Gender |  Salary   |      Hiring Date    |%n");
        System.out.format("+-------------------------------------+-----------+----------------+-------+-------------+--------+-----------+---------------------+%n");
        System.out.format(leftAlignFormat,schools.get(thisSchool).teachersList.get(i).getName() + " " + schools.get(thisSchool).teachersList.get(i).getLastName() , schools.get(thisSchool).teachersList.get(i).getPersonalCode() , schools.get(thisSchool).teachersList.get(i).getPhoneNumber() , schools.get(thisSchool).teachersList.get(i).getRank() , schools.get(thisSchool).teachersList.get(i).getEducation() , schools.get(thisSchool).teachersList.get(i).getGender() , schools.get(thisSchool).teachersList.get(i).getSalary() , strDate);
        System.out.format("+-------------------------------------+-----------+----------------+-------+-------------+--------+-----------+---------------------+%n");
    }



    static void studentTable(){ // showing student information in a table
        String leftAlignFormat = "| %-35s | %-35s | %-11d |%n";
        System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        System.out.format("|                 Student             |              Parent name            |      ID     |%n");
        System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++) {
            System.out.format(leftAlignFormat, schools.get(thisSchool).studentsList.get(i).getName() + " " + schools.get(thisSchool).studentsList.get(i).getLastName(), schools.get(thisSchool).studentsList.get(i).getParentName() ,schools.get(thisSchool).studentsList.get(i).getNationalCode());
            System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        }
    }



    static void studentOfLessonOfClass(int i , int k){ // showing student of a lesson in a table
        String leftAlignFormat = "| %-35s | %-35s | %-11d |%n";
        System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        System.out.format("|                 Student             |              Parent name            |      ID     |%n");
        System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).studentsOfLesson.size(); j++) {
            System.out.format(leftAlignFormat, schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).studentsOfLesson.get(j).getName() + " " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).studentsOfLesson.get(j).getLastName(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).studentsOfLesson.get(j).getParentName() ,schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).studentsOfLesson.get(j).getNationalCode());
            System.out.format("+-------------------------------------+-------------------------------------+-------------+%n");
        }
    }



    static void showStudentInfo(int i){ // showing student information in a table
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(schools.get(thisSchool).studentsList.get(i).getDateOfArrivalAtSchool());
        String leftAlignFormat = "| %-35s | %-35s | %-11d | %-13s | %-10s | %-6s | %-9s |%n";
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        System.out.format("|                 Student             |              Parent name            |      ID     | P.Phone Number|  Birthday  | Gender |   Date of Arrival   |%n");
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        System.out.format(leftAlignFormat, schools.get(thisSchool).studentsList.get(i).getName() + " " + schools.get(thisSchool).studentsList.get(i).getLastName(), schools.get(thisSchool).studentsList.get(i).getParentName() ,schools.get(thisSchool).studentsList.get(i).getNationalCode() , schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber() , schools.get(thisSchool).studentsList.get(i).getBirthday() , schools.get(thisSchool).studentsList.get(i).getGender() , strDate);
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
    }



    static void lessonTable(){ // showing lessons in a table
        String leftAlignFormat = "| %-25s |%n";
        System.out.format("+---------------------------+%n");
        System.out.format("|           Lessons         |%n");
        System.out.format("+---------------------------+%n");
        for (int i = 0; i < schools.get(thisSchool).lessonsList.size(); i++) {
            System.out.format(leftAlignFormat, schools.get(thisSchool).lessonsList.get(i).getLessonName());
            System.out.format("+---------------------------+%n");
        }
    }



    static void showLessonInfo(int i) { // showing lessons information
        String leftAlignFormat = "| %-25s | %-1d | %-9s | %-5s | %-30s |%n";
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        System.out.format("|            Lesson         |NOU|    Days   | Hours |            Teacher             |%n");
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        if (schools.get(thisSchool).lessonsList.get(i).getTeacher() == null) {
            System.out.format(leftAlignFormat, schools.get(thisSchool).lessonsList.get(i).getLessonName(), schools.get(thisSchool).lessonsList.get(i).getNumberOfUnits(), schools.get(thisSchool).lessonsList.get(i).getDays(), schools.get(thisSchool).lessonsList.get(i).getHours(), "No Teacher Found");
            System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        }
        else {
            System.out.format(leftAlignFormat, schools.get(thisSchool).lessonsList.get(i).getLessonName(), schools.get(thisSchool).lessonsList.get(i).getNumberOfUnits(), schools.get(thisSchool).lessonsList.get(i).getDays(), schools.get(thisSchool).lessonsList.get(i).getHours(), schools.get(thisSchool).lessonsList.get(i).getTeacher().getName() + " " + schools.get(thisSchool).lessonsList.get(i).getTeacher().getLastName());
            System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        }
    }





    static void classTable(){ // showing classes in a table
        String leftAlignFormat = "| %-17s |%n";
        System.out.format("+-------------------+%n");
        System.out.format("|       Classes     |%n");
        System.out.format("+-------------------+%n");
        for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
            System.out.format(leftAlignFormat,schools.get(thisSchool).classesList.get(i).getClassName());
            System.out.format("+-------------------+%n");
        }
    }



    static void showClassInfo(int i){ // showing class information that Included class name and lesson information and student information of a class
        String leftAlignFormat1 = "| %-17s |%n";
        System.out.format("+-------------------+%n");
        System.out.format("|       Classes     |%n");
        System.out.format("+-------------------+%n");
        System.out.format(leftAlignFormat1,schools.get(thisSchool).classesList.get(i).getClassName());
        System.out.format("+-------------------+%n");

        System.out.println("===========================================================================================================================================================");

        String leftAlignFormat2 = "| %-25s | %-1d | %-9s | %-5s | %-30s |%n";
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        System.out.format("|            Lesson         |NOU|    Days   | Hours |            Teacher             |%n");
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size();k++) {
            System.out.format(leftAlignFormat2, schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getLessonName(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getNumberOfUnits(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getDays(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getHours(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getTeacher().getName() + " " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getTeacher().getLastName());
            System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        }

        System.out.println("===========================================================================================================================================================");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(schools.get(thisSchool).studentsList.get(i).getDateOfArrivalAtSchool());
        String leftAlignFormat3 = "| %-35s | %-35s | %-11d | %-13s | %-10s | %-6s | %-9s |%n";
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        System.out.format("|                 Student             |              Parent name            |      ID     | P.Phone Number|  Birthday  | Gender |   Date of Arrival   |%n");
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();k++) {
            System.out.format(leftAlignFormat3, schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getName() + " " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getLastName(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getParentName(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getNationalCode(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getParentPhoneNumber(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getBirthday(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getGender(), strDate);
            System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        }
    }




    static void showClassLessons(int i){ // showing class lessons
        String leftAlignFormat1 = "| %-17s |%n";
        System.out.format("+-------------------+%n");
        System.out.format("|       Classes     |%n");
        System.out.format("+-------------------+%n");
        System.out.format(leftAlignFormat1,schools.get(thisSchool).classesList.get(i).getClassName());
        System.out.format("+-------------------+%n");

        System.out.println("===========================================================================================================================================================");

        String leftAlignFormat2 = "| %-25s | %-1d | %-9s | %-5s | %-30s |%n";
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        System.out.format("|            Lesson         |NOU|    Days   | Hours |            Teacher             |%n");
        System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size();k++) {
            System.out.format(leftAlignFormat2, schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getLessonName(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getNumberOfUnits(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getDays(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getHours(), schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getTeacher().getName() + " " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getTeacher().getLastName());
            System.out.format("+---------------------------+---+-----------+-------+--------------------------------+%n");
        }
    }




    static void showStudentOfClass(int i){ // showing student of class
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(schools.get(thisSchool).studentsList.get(i).getDateOfArrivalAtSchool());
        String leftAlignFormat3 = "| %-35s | %-35s | %-11d | %-13s | %-10s | %-6s | %-9s |%n";
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        System.out.format("|                 Student             |              Parent name            |      ID     | P.Phone Number|  Birthday  | Gender |   Date of Arrival   |%n");
        System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();k++) {
            System.out.format(leftAlignFormat3, schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getName() + " " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getLastName(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getParentName(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getNationalCode(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getParentPhoneNumber(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getBirthday(), schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getGender(), strDate);
            System.out.format("+-------------------------------------+-------------------------------------+-------------+---------------+------------+--------+---------------------+%n");
        }
    }




    static void showGrade(int i , int j){ // show grades of students
        String leftAlignFormat = "| %-35s | %-11d | %-5.2f |%n";
        System.out.format("+-------------------------------------+-------------+-------+%n");
        System.out.format("|                 Student             |      ID     | Grade |%n");
        System.out.format("+-------------------------------------+-------------+-------+%n");
        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).nationalCodes.size();k++) {
            System.out.format(leftAlignFormat , schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).nationalCodes.get(k).getName() + " " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).nationalCodes.get(k).getLastName() , schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).nationalCodes.get(k).getNationalCode() , schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).scores.get(k));
            System.out.format("+-------------------------------------+-------------+-------+%n");
        }
    }




    static void mainMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Main Menu ~~~~~");
        System.out.println("1) Sign Up\n2) Log In\n3) Exit");
        System.out.print("Enter Number : ");
    }



    static void signUpManager(){
        Scanner scan = new Scanner(System.in);
        Teacher manager = new Teacher();
        School school = new School();
        Random rand = new Random();
        Date date = Calendar.getInstance().getTime();
        ArrayList<String> AvailableRanks = new ArrayList<>();
        ArrayList<String> AvailableSections = new ArrayList<>();
        AvailableRanks.add("Bachelor");
        AvailableRanks.add("MA");
        AvailableRanks.add("P.H.D");
        AvailableSections.add("Primary School");
        AvailableSections.add("Middle School");
        AvailableSections.add("High School");
        int personaCod  , lengthPersonalCod , personalCod1 = 0 , rank1 = 0 , schoolID , lengthSchoolID , schoolID1 = 0;
        String chooseNumber , education = "a" , section = "b" , name = "c" , lastName = "d" , username = "e" , phoneNumber1 = "f" , schoolName = "g" , schoolAddress = "h";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ School Sign Up ~~~~~");
        while (1 == 1) {                                                                                                // school name , loop repeated while the name wasn't exist
            System.out.println("Enter school name : ");
            school.setSchoolName(scan.nextLine());
            for (School value : schools) {
                if (value.getSchoolName().equals(school.getSchoolName())) {
                    schoolName = school.getSchoolName();
                    break;
                }
            }
            if(school.getSchoolName().equals(schoolName)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This school name already exist , Enter new school name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter school province name : ");
        school.setProvinceName(scan.nextLine());
        System.out.println("Enter school city name : ");
        school.setCityName(scan.nextLine());
        while (1 == 1) {                                                                                                // school Address , loop repeat while the Address wasn't exist
            System.out.println("Enter school address : ");
            school.setSchoolAddress(scan.nextLine());
            for (School value : schools) {
                if (value.getSchoolAddress().equals(school.getSchoolAddress())) {
                    schoolAddress = school.getSchoolAddress();
                    break;
                }
            }
            if(school.getSchoolAddress().equals(schoolAddress)){
                System.out.println("=========================================================================");
                System.out.println("-- Error ,This school address already exist , Enter new school address --");
                System.out.println("=========================================================================");
            }
            else
                break;
        }
        while (1 == 1) {
            System.out.println("Enter school section  (School section should be Primary School , Middle School or High School) : ");
            school.setSection(scan.nextLine());
            for (String availableSection : AvailableSections) {
                if (school.getSection().equals(availableSection)) {
                    section = school.getSection();
                    break;
                }
            }
            if(school.getSection().equals(section))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined section , Enter valid section --");
                System.out.println("=====================================================================");
            }
        }
        school.setManager(manager);
        while (1 == 1) {                                                                                                // generate 8 digits unique random number for school , Iran school ids are 8 digit
            schoolID = rand.nextInt(100000000);
            school.setSchoolId(schoolID);
            for (School value : schools) {
                if (value.getSchoolId() == school.getSchoolId()) {
                    schoolID1 = school.getSchoolId();
                    break;
                }
            }
            lengthSchoolID = String.valueOf(schoolID).length();
            if(lengthSchoolID == 8 && schoolID1 != school.getSchoolId())
                break;

        }
        schools.add(school);
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Manager Sign Up ~~~~~");
        while (1 == 1) {
            System.out.println("Enter your name : ");
            manager.setName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getName().equals(manager.getName())) {
                    name = manager.getName();
                    break;
                }
            }
            if(manager.getName().equals(name)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This name already exist , Enter new name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        while (1 == 1) {
            System.out.println("Enter your last name : ");
            manager.setLastName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getLastName().equals(manager.getLastName())) {
                    lastName = manager.getLastName();
                    break;
                }
            }
            if(manager.getLastName().equals(lastName)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This last name already exist , Enter new last name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter your address : ");
        manager.setPersonAddress(scan.nextLine());
        while (1 == 1) {
            System.out.println("Gender :\n1) Male                     2) Female");
            System.out.println("Choose your gender (Enter Number) : ");
            chooseNumber = scan.next();
            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1"))
                manager.setGender("Male");
            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2"))
                manager.setGender("Female");
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined number , Enter valid number --");
                System.out.println("=====================================================================");
            }
            if(( chooseNumber.length() == 1 && chooseNumber.startsWith("1") ) || (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) )
                break;
        }
        while (1 == 1) {
            System.out.println("Enter your username : ");
            manager.setUserName(scan.next());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getUserName().equals(manager.getUserName())) {
                    username = manager.getUserName();
                    break;
                }
            }
            if(manager.getUserName().equals(username)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This user name already exist , Enter new username name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter your password : ");
        manager.setPassword(scan.next());
        while (1 == 1) {                                                                                                // generate random number(8 digits) that each one is unique and Iran teachers personal code is 8 digits
            personaCod = rand.nextInt(100000000);
            manager.setPersonalCode(personaCod);
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == manager.getPersonalCode()) {
                    personalCod1 = manager.getPersonalCode();
                    break;
                }
            }
            lengthPersonalCod = String.valueOf(personaCod).length();
            if(lengthPersonalCod == 8 && personalCod1 != manager.getPersonalCode())
                break;

        }
        while (1 == 1){
            System.out.println("Enter your phone number (Should start with +98) : ");                                   // catch phone number from user , phone number should start with country code and only Iranian teachers can sign up to this program , Example : +981234567891
            manager.setPhoneNumber(scan.next());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getPhoneNumber().equals(manager.getPhoneNumber())) {
                    phoneNumber1 = manager.getPhoneNumber();
                    break;
                }
            }
            if(manager.getPhoneNumber().equals(phoneNumber1)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This phone number already exist , Enter new phone number --");
                System.out.println("=====================================================================");
            }
            else if(manager.getPhoneNumber().length() == 13 && manager.getPhoneNumber().startsWith("+98"))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined phone number format , Enter valid format --");
                System.out.println("=====================================================================");
            }
        }
        manager.setHiringDate(date);
        manager.setSalary(10_000_000);                                                                                  // I set manager salary default as 100 million Rial
        while (1 == 1){
            System.out.println("Enter your rank : ");
            manager.setRank(scan.nextInt());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getRank() == manager.getRank()) {
                    rank1 = manager.getRank();
                    break;
                }
            }
            if(rank1 == manager.getRank()){
                System.out.println("=====================================================================");
                System.out.println("-- Error , This Rank already exist , Enter new rank --");
                System.out.println("=====================================================================");
            }
            else if(manager.getRank() < 1){
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined number , Enter valid number --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        while (1 == 1) {
            System.out.println("Enter your education (Your education should be Bachelor , MA or P.H.D) : ");
            manager.setEducation(scan.next());
            for (String availableRank : AvailableRanks) {
                if (manager.getEducation().equals(availableRank)) {
                    education = manager.getEducation();
                    break;
                }
            }
            if(manager.getEducation().equals(education))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined education , Enter valid education --");
                System.out.println("=====================================================================");
            }
        }
        schools.get(thisSchool).setManager(manager);
        schools.get(thisSchool).teachersList.add(manager);
        schoolTeachers.add(manager);
        thisSchool++;
    }



    static void loginMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Log In Menu ~~~~~");
        System.out.println("1) Manager\n2) Teacher\n3) Student\n4) Back to main menu");
        System.out.print("Enter Number : ");
    }



    static void managerLogin() {
        Scanner scan = new Scanner(System.in);
        String username, checkUsername = "a", password , checkPassword = "b";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Manager log in ~~~~~");
        while (1 == 1) {
            System.out.println("Enter Username : ");
            username = scan.next();
            for (int i = 0;i < schools.size();i++) {
                if (schools.get(i).getManager().getUserName().equals(username)) {
                    checkUsername = username;
                    thisSchool = i;
                    break;
                }
            }
            if(username.equals(checkUsername))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined username , Enter existing username --");
                System.out.println("=====================================================================");
            }
        }
        while (1 == 1) {
            System.out.println("Enter password : ");
            password = scan.next();
            for (School school : schools) {
                if (school.getManager().getPassword().equals(password)) {
                    checkPassword = password;
                    break;
                }
            }
            if(password.equals(checkPassword))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined password , Enter existing password --");
                System.out.println("=====================================================================");
            }
        }
    }



    static void managerMenu(){
        System.out.println("=====================================================================");
        schoolInfo(thisSchool);
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Manager Menu ~~~~~");
        System.out.println("1) Create , Edit and Delete lesson\n2) Create , Edit and delete Class\n3) Create , Edit and delete student\n4) Create , Edit and delete teacher");
        System.out.println("5) Increase / Decrease teacher salary\n6) View all lessons from a specific teacher\n7) View students from a specific class\n8) View students from a specific lesson");
        System.out.println("9) View current student classes\n10) View current student lessons\n11) View the grades of a specific student");
        System.out.println("12) View average and standard deviation of students grades form a specific lesson");
        System.out.println("13) View average and standard deviation of specific lesson grades from a specific class");
        System.out.println("14) View the grades of a specific teacher from a specific lesson");
        System.out.println("15) Log out");
        System.out.println("Enter number : ");
    }



    static void lessonWorksMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Lesson Menu ~~~~~");
        System.out.println("1) Create lesson\n2) Edit lesson\n3) Delete lesson\n4) Back to manager menu");
        System.out.println("Enter number : ");
    }


    static void createLesson(){
        Scanner scan = new Scanner(System.in);
        Lesson lesson = new Lesson();
        Class classes = new Class();
        ArrayList<String> AvailableDays = new ArrayList<>();
        ArrayList<String> AvailableHours = new ArrayList<>();
        AvailableDays.add("Saturday");
        AvailableDays.add("Sunday");
        AvailableDays.add("Monday");
        AvailableDays.add("Tuesday");
        AvailableDays.add("Wednesday");
        AvailableHours.add("8-9");
        AvailableHours.add("9-10");
        AvailableHours.add("10-11");
        AvailableHours.add("11-12");
        AvailableHours.add("12-13");
        AvailableHours.add("13-14");
        int personalCod , choseNumber , z = 0 , j = 0;
        boolean a  , c  , d ;
        String chooseNumber ,  name = "c" , days = "a" , hours = "b" , className;
        System.out.println("=====================================================================");
        if(schools.get(thisSchool).teachersList.size() > 0  && schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0) { // for this program and with my algorithm , To create lesson you should have Teacher , class and student
            System.out.println("~~~~~ Create lesson ~~~~~");
            while (1 == 1) {
                System.out.println("Enter lesson name : ");
                lesson.setLessonName(scan.nextLine());
                for (int i = 0; i < schools.get(thisSchool).lessonsList.size(); i++) {
                    if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(lesson.getLessonName())) {
                        name = lesson.getLessonName();
                        break;
                    }
                }
                if (lesson.getLessonName().equals(name)) {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,This name already exist , Enter new name --");
                    System.out.println("=====================================================================");
                }
                else
                    break;
            }
            while (1 == 1) {
                System.out.println("Enter number of units (number of units should be 1 , 2 or 3) :");
                chooseNumber = scan.next();
                if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                    lesson.setNumberOfUnits(1);
                    break;
                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                    lesson.setNumberOfUnits(2);
                    break;
                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                    lesson.setNumberOfUnits(3);
                    break;
                } else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined number of units , Enter valid number --");
                    System.out.println("=====================================================================");
                }
            }
            while (1 == 1) {
                System.out.println("Enter lesson day (lesson day should be Saturday , Sunday , Monday , Tuesday , Wednesday) : ");
                lesson.setDays(scan.next());
                for (String availableDay : AvailableDays) {
                    if (lesson.getDays().equals(availableDay)) {
                        days = lesson.getDays();
                        break;
                    }
                }
                if (lesson.getDays().equals(days))
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined day , Enter valid day --");
                    System.out.println("=====================================================================");
                }
            }
            while (1 == 1){
                scan.nextLine();
                System.out.println("Enter lesson hours (lesson hours should be " + AvailableHours +" ) : ");
                lesson.setHours(scan.next());
                for (String availableHour : AvailableHours) {
                    if (lesson.getHours().equals(availableHour)){
                        hours = lesson.getHours();
                        break;
                    }
                }
                if (lesson.getHours().equals(hours))
                    break;
                else{
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined hours , Enter valid hours --");
                    System.out.println("=====================================================================");
                }
            }
            while (1 == 1){
                a = false;
                System.out.println("=======================================================================");
                teacherTable();                                                                                         // showing teachers to manager to select a teacher for lesson
                System.out.println("=======================================================================");
                System.out.println("Enter teacher personal cod that you want to set him/here for lesson : ");
                personalCod = scan.nextInt();
                for(int i = 0;i < schools.get(thisSchool).teachersList.size();i++){
                    if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == personalCod){
                        lesson.setTeacher(schools.get(thisSchool).teachersList.get(i));
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else {
                    System.out.println("========================================================================");
                    System.out.println("-- Error , Undefined teacher personal cod , Enter valid personal cod --");
                    System.out.println("========================================================================");
                }
            }
            schools.get(thisSchool).lessonsList.add(lesson);
            while (1 == 1){
                System.out.println("=======================================================================");
                classTable();                                                                                           // showing classes to manager to add this lesson to classes
                System.out.println("=======================================================================");
                System.out.println("Enter number of classes that you want to add lesson : ");
                choseNumber = scan.nextInt();
                if (choseNumber > schools.get(thisSchool).classesList.size()){
                    System.out.println("========================================================================");
                    System.out.println("-- Error , Out of range , Enter valid number --");
                    System.out.println("========================================================================");
                }
                else {
                    scan.nextLine();
                    thisLesson = schools.get(thisSchool).lessonsList.size() - 1;
                    while (z < choseNumber){
                        c = false;
                        d = false;
                        System.out.println("Enter class name number " + (z + 1) +" : ");
                        className = scan.nextLine();
                        for (int i = 0;i < schools.get(thisSchool).classesList.size();i++){
                            if (className.equals(schools.get(thisSchool).classesList.get(i).getClassName())){
                                j = i;
                                c = true;
                                break;
                            }
                        }
                        for (int k = 0; k < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size();k++) {
                            if (schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).getLessonName().equals(className)) {
                                d = true;
                                break;
                            }
                        }
                        if (c && schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size() == 0){
                            lesson.studentsOfLesson.addAll(schools.get(thisSchool).classesList.get(j).studentsListOfClass);
                            classes.lessonsListOfClass.add(schools.get(thisSchool).lessonsList.get(thisLesson));
                            thisLesson++;
                            z++;
                        }
                        else if ( c && !d ) {
                            lesson.studentsOfLesson.addAll(schools.get(thisSchool).classesList.get(j).studentsListOfClass);
                            classes.lessonsListOfClass.add(schools.get(thisSchool).lessonsList.get(thisLesson));
                            thisLesson++;
                            z++;
                        }
                        else{
                            System.out.println("=============================================================================");
                            System.out.println("-- Error , Undefined lesson or found in another class , Enter new lesson --");
                            System.out.println("=============================================================================");
                        }
                    }
                    break;
                }
            }
        }
        else
            System.out.println("Error , This school has no teacher and class and student, first add teacher and class and student");
    }



    static void editLesson() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> AvailableDays = new ArrayList<>();
        ArrayList<String> AvailableHours = new ArrayList<>();
        AvailableDays.add("Saturday");
        AvailableDays.add("Sunday");
        AvailableDays.add("Monday");
        AvailableDays.add("Tuesday");
        AvailableDays.add("Wednesday");
        AvailableHours.add("8-9");
        AvailableHours.add("9-10");
        AvailableHours.add("10-11");
        AvailableHours.add("11-12");
        AvailableHours.add("12-13");
        AvailableHours.add("13-14");
        int personalCod;
        boolean a ;
        String chooseNumber, name = "c", days = "a", hours = "b",lessonName ;
        if (schools.get(thisSchool).lessonsList.size() > 0) {
            while (1 == 1) {
                a = false;
                System.out.println("=======================================================================");
                lessonTable();
                System.out.println("=======================================================================");
                System.out.println("Enter name of lesson that you want to edit : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).lessonsList.size(); i++) {
                    if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(lessonName)) {
                        showLessonInfo(i);                                                                              // showing lesson information before editing
                        while (1 == 1) {
                            System.out.println("Enter lesson name : ");
                            schools.get(thisSchool).lessonsList.get(i).setLessonName(scan.nextLine());
                            for (int k = 0;k < schools.get(thisSchool).lessonsList.size();k++) {
                                if (schools.get(thisSchool).lessonsList.get(k).getLessonName().equals(schools.get(thisSchool).lessonsList.get(i).getLessonName()) && i != k) {
                                    name = schools.get(thisSchool).lessonsList.get(i).getLessonName();
                                    break;
                                }
                            }
                            if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(name)) {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            } else
                                break;
                        }
                        while (1 == 1) {
                            System.out.println("Enter number of units (number of units should be 1 , 2 or 3) :");
                            chooseNumber = scan.next();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                schools.get(thisSchool).lessonsList.get(i).setNumberOfUnits(1);
                                break;
                            } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                schools.get(thisSchool).lessonsList.get(i).setNumberOfUnits(2);
                                break;
                            } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                schools.get(thisSchool).lessonsList.get(i).setNumberOfUnits(3);
                                break;
                            } else {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined number of units , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                        }
                        while (1 == 1) {
                            System.out.println("Enter lesson day (lesson day should be Saturday , Sunday , Monday , Tuesday , Wednesday) : ");
                            schools.get(thisSchool).lessonsList.get(i).setDays(scan.next());
                            for (String availableDay : AvailableDays) {
                                if (schools.get(thisSchool).lessonsList.get(i).getDays().equals(availableDay)) {
                                    days = schools.get(thisSchool).lessonsList.get(i).getDays();
                                    break;
                                }
                            }
                            if (schools.get(thisSchool).lessonsList.get(i).getDays().equals(days))
                                break;
                            else {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined day , Enter valid day --");
                                System.out.println("=====================================================================");
                            }
                        }
                        while (1 == 1){
                            scan.nextLine();
                            System.out.println("Enter lesson hours (lesson hours should be " + AvailableHours +" ) : ");
                            schools.get(thisSchool).lessonsList.get(i).setHours(scan.next());
                            for (String availableHour : AvailableHours) {
                                if (schools.get(thisSchool).lessonsList.get(i).getHours().equals(availableHour)){
                                    hours = schools.get(thisSchool).lessonsList.get(i).getHours();
                                    break;
                                }
                            }
                            if (schools.get(thisSchool).lessonsList.get(i).getHours().equals(hours))
                                break;
                            else{
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined hours , Enter valid hours --");
                                System.out.println("=====================================================================");
                            }
                        }
                        scan.nextLine();
                        while (1 == 1) {
                            System.out.println("1) Edit Teacher (Add only)\n2) Edit Teacher (Delete only)\n3) Back to class menu");    // Extra menu , this menu design for adding or deleting teacher of this lesson , Attention !! ==> you can add teacher when you don' have any teacher for this lesson
                            System.out.println("Enter number : ");
                            chooseNumber = scan.next();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                if (schools.get(thisSchool).lessonsList.get(i).getTeacher() == null) {
                                    while (1 == 1) {
                                        a = false;
                                        System.out.println("=======================================================================");
                                        teacherTable();
                                        System.out.println("=======================================================================");
                                        System.out.println("Enter teacher personal cod that you want to set him/here for lesson : ");
                                        personalCod = scan.nextInt();
                                        for (int k = 0; k < schools.get(thisSchool).teachersList.size(); k++) {
                                            if (schools.get(thisSchool).teachersList.get(k).getPersonalCode() == personalCod) {
                                                schools.get(thisSchool).lessonsList.get(i).setTeacher(schools.get(thisSchool).teachersList.get(k));
                                                a = true;
                                                break;
                                            }
                                        }
                                        if (a)
                                            break;
                                        else {
                                            System.out.println("========================================================================");
                                            System.out.println("-- Error , Undefined teacher personal cod , Enter valid personal cod --");
                                            System.out.println("========================================================================");
                                        }
                                    }
                                }
                                else
                                    System.out.println("Error , This lesson has teacher");
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                schools.get(thisSchool).lessonsList.get(i).setTeacher(null);
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                break;
                            }
                            else {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,Undefined number , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                        }
                        showLessonInfo(i);                                                                              // showing lesson information after editing
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,Undefined class name , Enter valid lesson name --");
                    System.out.println("=====================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no lesson , add lessons");
    }



    static void deleteLesson(){
        Scanner scan = new Scanner(System.in);
        boolean a = false;
        String lessonName;
        if (schools.get(thisSchool).lessonsList.size()  > 0){
            while (1 == 1){
                System.out.println("=======================================================================");
                lessonTable();                                                                                          // showing all lessons of school before deleting a lesson
                System.out.println("=======================================================================");
                System.out.println("Enter lesson name that you want to delete : ");
                lessonName = scan.nextLine();
                for(int i = 0;i < schools.get(thisSchool).lessonsList.size();i++){
                    if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(lessonName)){
                        for (int j = 0;j < schools.get(thisSchool).classesList.size();j++){
                            for (int k = 0; k < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size();k++){
                                if (schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).getLessonName().equals(lessonName)){
                                    schools.get(thisSchool).classesList.get(j).lessonsListOfClass.remove(k);            // delete lesson fromm all classes before removing this object from school lesson list , that mean all information of this lesson in each class will delete
                                    break;
                                }
                            }
                        }
                        schools.get(thisSchool).lessonsList.remove(i);                                                  // delete lesson from school lesson list (this Array list is extra from pdf project)
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else {
                    System.out.println("========================================================================");
                    System.out.println("-- Error , Undefined lesson name , Enter valid lesson name --");
                    System.out.println("========================================================================");
                }
            }
            lessonTable();                                                                                              // showing school lessons after delete a lesson
        }
        else
            System.out.println("Error , This school has no lesson , add lessons");
    }



    static void classWorksMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Class Menu ~~~~~");
        System.out.println("1) Create class\n2) Edit class\n3) Delete class\n4) Back to manager menu");
        System.out.println("Enter number : ");
    }



    static void createClass() {
        Scanner scan = new Scanner(System.in);
        Class classes = new Class();
        String name = "a";
        System.out.println("=====================================================================");
        if (schools.get(thisSchool).studentsList.size() > 0 ) {
            System.out.println("~~~~~ Create Class ~~~~~");
            while (1 == 1) {
                System.out.println("Enter Class name : ");
                classes.setClassName(scan.nextLine());
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(i).getClassName().equals(name)) {
                        name = classes.getClassName();
                        break;
                    }
                }
                if (classes.getClassName().equals(name)) {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,This name already exist , Enter new name --");
                    System.out.println("=====================================================================");
                } else
                    break;
            }
            schools.get(thisSchool).classesList.add(classes);
            checkEachLessonAndStudent(classes);                                                                         // call this function to add students to a class , students can only join to 1 class
        }
        else
            System.out.println("Error , This school has no student, first add student");
    }




    static void checkEachLessonAndStudent(Class classes){
        Scanner scan = new Scanner(System.in);
        int  z = 0 , choseNumber , j = 0;
        long nationalCode;
        boolean a  , b ;
            while (1 == 1){
                System.out.println("=======================================================================");
                studentTable();
                System.out.println("=======================================================================");
                System.out.println("Enter number of student that you want to set for class : ");
                choseNumber = scan.nextInt();
                if (choseNumber > schools.get(thisSchool).studentsList.size()){
                    System.out.println("========================================================================");
                    System.out.println("-- Error , Out of range , Enter valid number --");
                    System.out.println("========================================================================");
                }
                else{
                    while (z < choseNumber){
                        a = false;
                        b = false;
                        System.out.println("Enter national code of person number " + (z + 1) +" : ");
                        nationalCode = scan.nextLong();
                        for (int i = 0;i < schools.get(thisSchool).studentsList.size();i++){
                            if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode){
                                j = i;
                                a = true;
                                break;
                            }
                        }
                        for (int i = 0;i < schools.get(thisSchool).classesList.size();i++){
                            thisClass = i;
                            for (int k = 0;k < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();k++)
                            if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(k).getNationalCode() == nationalCode){
                                b = true;
                                break;
                            }
                            if (b)
                                break;
                        }
                        if ((a && !b) || (a && schools.get(thisSchool).classesList.get(thisClass).studentsListOfClass.size() == 0)) {
                            classes.studentsListOfClass.add(schools.get(thisSchool).studentsList.get(j));
                            z++;
                        }
                        else{
                            System.out.println("=============================================================================");
                            System.out.println("-- Error , Undefined student or found in another class , Enter new student --");
                            System.out.println("=============================================================================");
                        }
                    }
                    break;
                }
            }
    }



    static void editClass(){
        Scanner scan = new Scanner(System.in);
        long nationalCode;
        boolean a = false;
        String name = "a" , className , chooseNumber , chooseWTD;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0) {
            while (1 == 1) {
                System.out.println("=======================================================================");
                classTable();
                System.out.println("=======================================================================");
                System.out.println("Enter name of class that you want to edit : ");
                className = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(i).getClassName().equals(className)) {
                        showClassInfo(i);
                        while (1 == 1) {
                            System.out.println("Enter Class name : ");
                            schools.get(thisSchool).classesList.get(i).setClassName(scan.nextLine());
                            for (int j = 0; j < schools.get(thisSchool).classesList.size(); j++) {
                                if (schools.get(thisSchool).classesList.get(j).getClassName().equals(schools.get(thisSchool).classesList.get(i).getClassName()) && i != j) {
                                    name = schools.get(thisSchool).classesList.get(i).getClassName();
                                    break;
                                }
                            }
                            if (schools.get(thisSchool).classesList.get(i).getClassName().equals(name)) {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            } else
                                break;
                        }
                        while (1 == 1) {
                            System.out.println("1) Edit Student (Only add)\n2) Edit Student (Delete only)\n3) Back to class menu");
                            System.out.println("Enter number : ");
                            chooseNumber = scan.nextLine();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                checkEachLessonAndStudent(schools.get(thisSchool).classesList.get(i));
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")){
                                while (1 == 1) {
                                    a = false;
                                    System.out.println("=====================================================================");
                                    showStudentOfClass(i);
                                    System.out.println("=====================================================================");
                                    System.out.println("Enter student national code that you want to delete : ");
                                    nationalCode = scan.nextLong();
                                    for (int j = 0; j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size(); j++) {
                                        if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getNationalCode() == nationalCode) {
                                            schools.get(thisSchool).classesList.get(i).studentsListOfClass.remove(j);
                                            a = true;
                                            break;
                                        }
                                    }
                                    if (a)
                                        break;
                                    else{
                                        System.out.println("================================================================================");
                                        System.out.println("-- Error ,Undefined student national code , Enter valid student national code --");
                                        System.out.println("================================================================================");
                                        while (1 == 1) {
                                            System.out.println("Do you want to continue ? (YES | NO)");
                                            chooseWTD = scan.next();
                                            if (chooseWTD.equals("YES")) {
                                                System.out.println("Start again");
                                            } else if (chooseWTD.equals("NO"))
                                                break;
                                            else
                                                System.out.println("TYPE YES OR NO");
                                        }
                                    }
                                }
                                break;
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                break;
                            }
                            else{
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,Undefined number , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                        }
                        showClassInfo(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,Undefined class name , Enter valid Class name --");
                    System.out.println("=====================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no class and student , first add school and class");
    }



    static void deleteClass(){
        Scanner scan = new Scanner(System.in);
        boolean a = false;
        String name ;
        if (schools.get(thisSchool).classesList.size() > 0 ) {
            while (1 == 1) {
                System.out.println("=====================================================================");
                classTable();
                System.out.println("=====================================================================");
                System.out.println("Enter Class name that you want to delete : ");
                name = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(i).getClassName().equals(name)) {
                        schools.get(thisSchool).classesList.remove(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,Undefined class name , Enter valid lesson name --");
                    System.out.println("=====================================================================");
                }
            }
            classTable();
        }
        else
            System.out.println("Error , This school has no class, first add classes");
    }




    static void studentWorkMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Student Menu ~~~~~");
        System.out.println("1) Create student\n2) Edit student\n3) Delete student\n4) Back to manager menu");
        System.out.println("Enter number : ");
    }


    static boolean checkAllNumbers(String[] number , int i){
        for(int j = 0;j < number.length;j++){
            if (number[i].charAt(j) >= '0' && number[i].charAt(j) <= '9'){
                return true;
            }
            else
                return false;
        }
        return true;
    }



    static void createStudent(){
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        Date date = Calendar.getInstance().getTime();
        int  lengthNationalCode , counter;
        long nationalCode = 0 ;
        String chooseNumber ,  name = "c" , username = "a" , phoneNumber1 = "h" , parentName = "b";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Create Student ~~~~~");
        while (1 == 1) {
            System.out.println("Enter student name : ");
            student.setName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).studentsList.size();i++) {
                if (schools.get(thisSchool).studentsList.get(i).getName().equals(student.getName())) {
                    name = student.getName();
                    break;
                }
            }
            if(student.getName().equals(name)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This name already exist , Enter new name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter student last name : ");
        student.setLastName(scan.nextLine());
        System.out.println("Enter student address : ");
        student.setPersonAddress(scan.nextLine());
        while (1 == 1) {
            System.out.println("Gender :\n1) Male                     2) Female");
            System.out.println("Choose student gender (Enter Number) : ");
            chooseNumber = scan.next();
            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1"))
                student.setGender("Male");
            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2"))
                student.setGender("Female");
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined number , Enter valid number --");
                System.out.println("=====================================================================");
            }
            if(( chooseNumber.length() == 1 && chooseNumber.startsWith("1") ) || (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) )
                break;
        }
        String[] numbers;
        String birthday;
        while (1 == 1) {
            counter = 0;
            System.out.println("Enter student birthday (format = yyyy/mm/dd) :");
            birthday = scan.next();
            numbers = birthday.split("/");
            if (numbers.length != 3) {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined format , Enter valid format --");
                System.out.println("=====================================================================");
            }
            else{
                for (int i = 0; i < numbers.length; i++) {
                    if (checkAllNumbers(numbers, i))
                        counter++;
                }
                if (counter == 3) {
                    int yy = Integer.parseInt(numbers[0]);
                    int mm = Integer.parseInt(numbers[1]);
                    int dd = Integer.parseInt(numbers[2]);
                    if (yy > 2002 && yy < 2015 && mm > 0 && mm < 13 && dd > 0 && dd < 31) {
                        StringBuilder mix = new StringBuilder();
                        for (int i = 0; i < 3; i++) {
                            mix.append(numbers[i]);
                            if (i < 2)
                                mix.append("/");
                        }
                        student.setBirthday(mix);
                        break;
                    }
                    else{
                        System.out.println("=====================================================================");
                        System.out.println("-- Error , Undefined Age , Enter valid Age --");
                        System.out.println("=====================================================================");
                    }
                }
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined format , Don't use letters --");
                    System.out.println("=====================================================================");
                }
            }
        }
        while (1 == 1) {
            System.out.println("Enter student username : ");
            student.setUserName(scan.next());
            for (int i = 0;i < schools.get(thisSchool).studentsList.size();i++) {
                if (schools.get(thisSchool).studentsList.get(i).getUserName().equals(student.getUserName())) {
                    username = student.getUserName();
                    break;
                }
            }
            if(student.getUserName().equals(username)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This user name already exist , Enter new username name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter student password : ");
        student.setPassword(scan.next());
        while (1 == 1) {
            System.out.println("Enter student national code : ");
            student.setNationalCode(scan.nextLong());
            lengthNationalCode = String.valueOf(student.getNationalCode()).length();
            if(lengthNationalCode == 10) {
                if (schools.get(thisSchool).studentsList.size() > 0) {
                    for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++) {
                        if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == student.getNationalCode()) {
                            nationalCode = student.getNationalCode();
                            break;
                        }
                    }
                }
                if (student.getNationalCode() == nationalCode) {
                    System.out.println("===================================================================================");
                    System.out.println("-- Error ,This national code already exist , Enter new national coed --");
                    System.out.println("====================================================================================");
                }
                else{
                    break;
                }
            }
            else{
                System.out.println("===================================================================================");
                System.out.println("-- Error ,Length of national code should be 10 , Enter valid national coed --");
                System.out.println("====================================================================================");
            }
        }
        scan.nextLine();
        while (1 == 1) {
            System.out.println("Enter student parent name : ");
            student.setParentName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).studentsList.size();i++) {
                if (schools.get(thisSchool).studentsList.get(i).getParentName().equals(student.getParentName())) {
                    parentName = student.getParentName();
                    break;
                }
            }
            if(student.getParentName().equals(parentName)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This name already exist , Enter new name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        while (1 == 1){
            System.out.println("Enter student parent phone number (Should start with +98) : ");
            student.setParentPhoneNumber(scan.next());
            for (int i = 0;i < schools.get(thisSchool).studentsList.size();i++) {
                if (schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber().equals(student.getParentPhoneNumber())) {
                    phoneNumber1 = student.getParentPhoneNumber();
                    break;
                }
            }
            if(student.getParentPhoneNumber().equals(phoneNumber1)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This phone number already exist , Enter new phone number --");
                System.out.println("=====================================================================");
            }
            else if(student.getParentPhoneNumber().length() == 13 && student.getParentPhoneNumber().startsWith("+98"))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined phone number format , Enter valid format --");
                System.out.println("=====================================================================");
            }
        }
        student.setDateOfArrivalAtSchool(date);
        schoolStudents.add(student);
        schools.get(thisSchool).studentsList.add(student);
    }



    static void editStudent(){
        Scanner scan = new Scanner(System.in);
        int  counter ;
        long nationalCode;
        boolean a ;
        String chooseNumber ,  name = "c" , phoneNumber1 = "h" , parentName = "b";
        if (schools.get(thisSchool).studentsList.size() > 0 ){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                studentTable();
                System.out.println("=====================================================================");
                System.out.println("Enter student national code that you want to edit : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++) {
                    if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode) {
                        showStudentInfo(i);
                        scan.nextLine();
                        while (1 == 1) {
                            System.out.println("Enter student name : ");
                            schools.get(thisSchool).studentsList.get(i).setName(scan.nextLine());
                            for (int j = 0;j < schools.get(thisSchool).studentsList.size();j++) {
                                if (schools.get(thisSchool).studentsList.get(j).getName().equals(schools.get(thisSchool).studentsList.get(i).getName()) && i != j ) {
                                    name = schools.get(thisSchool).studentsList.get(i).getName();
                                    break;
                                }
                            }
                            if(schools.get(thisSchool).studentsList.get(i).getName().equals(name)){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            }
                            else
                                break;
                        }
                        System.out.println("Enter student last name : ");
                        schools.get(thisSchool).studentsList.get(i).setLastName(scan.nextLine());
                        System.out.println("Enter student address : ");
                        schools.get(thisSchool).studentsList.get(i).setPersonAddress(scan.nextLine());
                        while (1 == 1) {
                            System.out.println("Gender :\n1) Male                     2) Female");
                            System.out.println("Choose student gender (Enter Number) : ");
                            chooseNumber = scan.next();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1"))
                                schools.get(thisSchool).studentsList.get(i).setGender("Male");
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2"))
                                schools.get(thisSchool).studentsList.get(i).setGender("Female");
                            else {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined number , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                            if(( chooseNumber.length() == 1 && chooseNumber.startsWith("1") ) || (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) )
                                break;
                        }
                        String[] numbers;
                        String birthday;
                        while (1 == 1) {
                            counter = 0;
                            System.out.println("Enter student birthday (format = yyyy/mm/dd) :");
                            birthday = scan.next();
                            numbers = birthday.split("/");
                            if (numbers.length != 3) {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined format , Enter valid format --");
                                System.out.println("=====================================================================");
                            }
                            else{
                                for (int j = 0; j < numbers.length; j++) {
                                    if (checkAllNumbers(numbers, j))
                                        counter++;
                                }
                                if (counter == 3) {
                                    int yy = Integer.parseInt(numbers[0]);
                                    int mm = Integer.parseInt(numbers[1]);
                                    int dd = Integer.parseInt(numbers[2]);
                                    if (yy > 2002 && yy < 2015 && mm > 0 && mm < 13 && dd > 0 && dd < 31) {
                                        StringBuilder mix = new StringBuilder();
                                        for (int j = 0; j < 3; j++) {
                                            mix.append(numbers[j]);
                                            if (j < 2)
                                                mix.append("/");
                                        }
                                        schools.get(thisSchool).studentsList.get(i).setBirthday(mix);
                                        break;
                                    }
                                    else{
                                        System.out.println("=====================================================================");
                                        System.out.println("-- Error , Undefined Age , Enter valid Age --");
                                        System.out.println("=====================================================================");
                                    }
                                }
                                else {
                                    System.out.println("=====================================================================");
                                    System.out.println("-- Error , Undefined format , Don't use letters --");
                                    System.out.println("=====================================================================");
                                }
                            }
                        }
                        scan.nextLine();
                        while (1 == 1) {
                            System.out.println("Enter student parent name : ");
                            schools.get(thisSchool).studentsList.get(i).setParentName(scan.nextLine());
                            for (int j = 0;j < schools.get(thisSchool).studentsList.size();j++) {
                                if (schools.get(thisSchool).studentsList.get(j).getParentName().equals(schools.get(thisSchool).studentsList.get(i).getParentName()) && i != j ) {
                                    parentName = schools.get(thisSchool).studentsList.get(i).getParentName();
                                    break;
                                }
                            }
                            if(schools.get(thisSchool).studentsList.get(i).getParentName().equals(parentName)){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            }
                            else
                                break;
                        }
                        while (1 == 1){
                            System.out.println("Enter student parent phone number (Should start with +98) : ");
                            schools.get(thisSchool).studentsList.get(i).setParentPhoneNumber(scan.next());
                            for (int j = 0;j < schools.get(thisSchool).studentsList.size();j++) {
                                if (schools.get(thisSchool).studentsList.get(j).getParentPhoneNumber().equals(schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber()) && i != j) {
                                    phoneNumber1 = schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber();
                                    break;
                                }
                            }
                            if(schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber().equals(phoneNumber1)){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This phone number already exist , Enter new phone number --");
                                System.out.println("=====================================================================");
                            }
                            else if(schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber().length() == 13 && schools.get(thisSchool).studentsList.get(i).getParentPhoneNumber().startsWith("+98"))
                                break;
                            else{
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined phone number format , Enter valid format --");
                                System.out.println("=====================================================================");
                            }
                        }
                        showStudentInfo(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined teacher personal code , Enter valid teacher personal code --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student, first add student");
    }



    static void deleteStudent(){
        Scanner scan = new Scanner(System.in);
        long nationalCode;
        boolean a = false;
        if (schools.get(thisSchool).studentsList.size() > 0 ) {
            while (1 == 1) {
                System.out.println("=====================================================================");
                studentTable();
                System.out.println("=====================================================================");
                System.out.println("Enter student national code that you want to delete : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++) {
                    if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode) {
                        for (int j = 0; j < schools.get(thisSchool).classesList.size();j++){
                            for (int k = 0; k < schools.get(thisSchool).classesList.get(j).studentsListOfClass.size();k++){
                                if (schools.get(thisSchool).classesList.get(j).studentsListOfClass.get(k).getNationalCode() == nationalCode){
                                    schools.get(thisSchool).classesList.get(j).studentsListOfClass.remove(k);
                                    break;
                                }
                            }
                        }
                        for (int j = 0; j < schools.get(thisSchool).classesList.size();j++){
                            for (int k = 0; k < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size();k++){
                                for (int z = 0; z < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).nationalCodes.size();z++) {
                                    if (schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).nationalCodes.get(z).getNationalCode() == nationalCode) {
                                        schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).nationalCodes.remove(z);
                                        schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).scores.remove(z);
                                        break;
                                    }
                                }
                            }
                        }
                        schools.get(thisSchool).studentsList.remove(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("================================================================================");
                    System.out.println("-- Error ,Undefined student national code , Enter valid student national code --");
                    System.out.println("================================================================================");
                }
            }
            studentTable();
        }
        else
            System.out.println("Error , This school has no student, first add student");
    }




    static void teacherWorksMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Teacher Menu ~~~~~");
        System.out.println("1) Create teacher\n2) Edit teacher\n3) Delete teacher\n4) Back to manager menu");
        System.out.println("Enter number : ");
    }



    static void createTeacher(){
        Scanner scan = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Random rand = new Random();
        Date date = Calendar.getInstance().getTime();
        ArrayList<String> AvailableRanks = new ArrayList<>();
        AvailableRanks.add("Bachelor");
        AvailableRanks.add("MA");
        AvailableRanks.add("P.H.D");
        int personaCod  , lengthPersonalCod , personalCod1 = 0 , rank1 = 0;
        String chooseNumber , education = "a" ,  name = "c" , lastName = "d" , username = "e" , phoneNumber1 = "f";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Create Teacher ~~~~~");
        while (1 == 1) {
            System.out.println("Enter teacher name : ");
            teacher.setName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getName().equals(teacher.getName())) {
                    name = teacher.getName();
                    break;
                }
            }
            if(teacher.getName().equals(name)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This name already exist , Enter new name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        while (1 == 1) {
            System.out.println("Enter teacher last name : ");
            teacher.setLastName(scan.nextLine());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getLastName().equals(teacher.getLastName())) {
                    lastName = teacher.getLastName();
                    break;
                }
            }
            if(teacher.getLastName().equals(lastName)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This last name already exist , Enter new last name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter teacher address : ");
        teacher.setPersonAddress(scan.nextLine());
        while (1 == 1) {
            System.out.println("Gender :\n1) Male                     2) Female");
            System.out.println("Choose teacher gender (Enter Number) : ");
            chooseNumber = scan.next();
            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1"))
                teacher.setGender("Male");
            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2"))
                teacher.setGender("Female");
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined number , Enter valid number --");
                System.out.println("=====================================================================");
            }
            if(( chooseNumber.length() == 1 && chooseNumber.startsWith("1") ) || (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) )
                break;
        }
        while (1 == 1) {
            System.out.println("Enter teacher username : ");
            teacher.setUserName(scan.next());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getUserName().equals(teacher.getUserName())) {
                    username = teacher.getUserName();
                    break;
                }
            }
            if(teacher.getUserName().equals(username)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This user name already exist , Enter new username name --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        System.out.println("Enter teacher password : ");
        teacher.setPassword(scan.next());
        while (1 == 1) {
            personaCod = rand.nextInt(100000000);
            teacher.setPersonalCode(personaCod);
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == teacher.getPersonalCode()) {
                    personalCod1 = teacher.getPersonalCode();
                    break;
                }
            }
            lengthPersonalCod = String.valueOf(personaCod).length();
            if(lengthPersonalCod == 8 && personalCod1 != teacher.getPersonalCode())
                break;
        }
        while (1 == 1){
            System.out.println("Enter teacher phone number (Should start with +98) : ");
            teacher.setPhoneNumber(scan.next());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getPhoneNumber().equals(teacher.getPhoneNumber())) {
                    phoneNumber1 = teacher.getPhoneNumber();
                    break;
                }
            }
            if(teacher.getPhoneNumber().equals(phoneNumber1)){
                System.out.println("=====================================================================");
                System.out.println("-- Error ,This phone number already exist , Enter new phone number --");
                System.out.println("=====================================================================");
            }
            else if(teacher.getPhoneNumber().length() == 13 && teacher.getPhoneNumber().startsWith("+98"))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined phone number format , Enter valid format --");
                System.out.println("=====================================================================");
            }
        }
        teacher.setHiringDate(date);
        System.out.println("Enter teacher salary : ");
        teacher.setSalary(scan.nextInt());
        while (1 == 1){
            System.out.println("Enter teacher rank : ");
            teacher.setRank(scan.nextInt());
            for (int i = 0;i < schools.get(thisSchool).teachersList.size();i++) {
                if (schools.get(thisSchool).teachersList.get(i).getRank() == teacher.getRank()) {
                    rank1 = teacher.getRank();
                    break;
                }
            }
            if(rank1 == teacher.getRank()){
                System.out.println("=====================================================================");
                System.out.println("-- Error , This Rank already exist , Enter new rank --");
                System.out.println("=====================================================================");
            }
            else if(teacher.getRank() < 1){
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined number , Enter valid number --");
                System.out.println("=====================================================================");
            }
            else
                break;
        }
        while (1 == 1) {
            System.out.println("Enter teacher education (teacher education should be Bachelor , MA or P.H.D) : ");
            teacher.setEducation(scan.next());
            for (String availableRank : AvailableRanks) {
                if (teacher.getEducation().equals(availableRank)) {
                    education = teacher.getEducation();
                    break;
                }
            }
            if(teacher.getEducation().equals(education))
                break;
            else{
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined education , Enter valid education --");
                System.out.println("=====================================================================");
            }
        }
        schoolTeachers.add(teacher);
        schools.get(thisSchool).teachersList.add(teacher);
    }



    static void editTeacher(){
        Scanner scan = new Scanner(System.in);
        int personalCode ;
        ArrayList<String> AvailableRanks = new ArrayList<>();
        AvailableRanks.add("Bachelor");
        AvailableRanks.add("MA");
        AvailableRanks.add("P.H.D");
        String chooseNumber , education = "a" ;
        boolean a = false , b = false , c = false , d = false;
        if (schools.get(thisSchool).teachersList.size() > 0 ) {
            while (1 == 1) {
                System.out.println("=====================================================================");
                teacherTable();
                System.out.println("=====================================================================");
                System.out.println("Enter teacher personal code that you want to edit : ");
                personalCode = scan.nextInt();
                for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
                    if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == personalCode) {
                        showTeacherInfo(i);
                        scan.nextLine();
                        while (1 == 1) {
                            a = false;
                            System.out.println("Enter Teacher name : ");
                            schools.get(thisSchool).teachersList.get(i).setName(scan.nextLine());
                            for (int j = 0; j < schools.get(thisSchool).teachersList.size(); j++) {
                                if (schools.get(thisSchool).teachersList.get(j).getName().equals(schools.get(thisSchool).teachersList.get(i).getName()) && i != j) {
                                    a= true;
                                    break;
                                }
                            }
                            if (a) {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            }
                            else
                                break;
                        }
                        while (1 == 1) {
                            b = false;
                            System.out.println("Enter Teacher Last name : ");
                            schools.get(thisSchool).teachersList.get(i).setLastName(scan.nextLine());
                            for (int j = 0; j < schools.get(thisSchool).teachersList.size(); j++) {
                                if (schools.get(thisSchool).teachersList.get(j).getLastName().equals(schools.get(thisSchool).teachersList.get(i).getLastName()) && i != j) {
                                    b= true;
                                    break;
                                }
                            }
                            if (b) {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This name already exist , Enter new name --");
                                System.out.println("=====================================================================");
                            }
                            else
                                break;
                        }
                        System.out.println("Enter teacher address : ");
                        schools.get(thisSchool).teachersList.get(i).setPersonAddress(scan.nextLine());
                        while (1 == 1) {
                            System.out.println("Gender :\n1) Male                     2) Female");
                            System.out.println("Choose teacher gender (Enter Number) : ");
                            chooseNumber = scan.next();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1"))
                                schools.get(thisSchool).teachersList.get(i).setGender("Male");
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2"))
                                schools.get(thisSchool).teachersList.get(i).setGender("Female");
                            else {
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined number , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                            if(( chooseNumber.length() == 1 && chooseNumber.startsWith("1") ) || (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) )
                                break;
                        }
                        while (1 == 1){
                            c = false;
                            System.out.println("Enter teacher phone number (Should start with +98) : ");
                            schools.get(thisSchool).teachersList.get(i).setPhoneNumber(scan.next());
                            for (int j = 0;j < schools.get(thisSchool).teachersList.size();j++) {
                                if (schools.get(thisSchool).teachersList.get(j).getPhoneNumber().equals(schools.get(thisSchool).teachersList.get(i).getPhoneNumber()) && i != j) {
                                    c = true;
                                    break;
                                }
                            }
                            if(c){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error ,This phone number already exist , Enter new phone number --");
                                System.out.println("=====================================================================");
                            }
                            else if(schools.get(thisSchool).teachersList.get(i).getPhoneNumber().length() == 13 && schools.get(thisSchool).teachersList.get(i).getPhoneNumber().startsWith("+98"))
                                break;
                            else{
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined phone number format , Enter valid format --");
                                System.out.println("=====================================================================");
                            }
                        }
                        System.out.println("Enter teacher salary : ");
                        schools.get(thisSchool).teachersList.get(i).setSalary(scan.nextInt());
                        while (1 == 1){
                            d = false;
                            System.out.println("Enter teacher rank : ");
                            schools.get(thisSchool).teachersList.get(i).setRank(scan.nextInt());
                            for (int j = 0;j < schools.get(thisSchool).teachersList.size();j++) {
                                if (schools.get(thisSchool).teachersList.get(i).getRank() == schools.get(thisSchool).teachersList.get(j).getRank()  &&  i != j ) {
                                    d = true;
                                    break;
                                }
                            }
                            if(d){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , This Rank already exist , Enter new rank --");
                                System.out.println("=====================================================================");
                            }
                            else if(schools.get(thisSchool).teachersList.get(i).getRank() < 1){
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined number , Enter valid number --");
                                System.out.println("=====================================================================");
                            }
                            else
                                break;
                        }
                        while (1 == 1) {
                            System.out.println("Enter teacher education (teacher education should be Bachelor , MA or P.H.D) : ");
                            schools.get(thisSchool).teachersList.get(i).setEducation(scan.next());
                            for (String availableRank : AvailableRanks) {
                                if (schools.get(thisSchool).teachersList.get(i).getEducation().equals(availableRank)) {
                                    education = schools.get(thisSchool).teachersList.get(i).getEducation();
                                    break;
                                }
                            }
                            if(schools.get(thisSchool).teachersList.get(i).getEducation().equals(education))
                                break;
                            else{
                                System.out.println("=====================================================================");
                                System.out.println("-- Error , Undefined education , Enter valid education --");
                                System.out.println("=====================================================================");
                            }
                        }
                        showTeacherInfo(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined teacher personal code , Enter valid teacher personal code --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no teacher, first add teacher");
    }



    static void deleteTeacher(){
        Scanner scan = new Scanner(System.in);
        int personalCode;
        boolean a = false;
        if (schools.get(thisSchool).teachersList.size() > 0 ) {
            while (1 == 1) {
                System.out.println("=====================================================================");
                teacherTable();
                System.out.println("=====================================================================");
                System.out.println("Enter teacher personal code that you want to delete : ");
                personalCode = scan.nextInt();
                for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
                    if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == personalCode) {
                        for (int j = 0; j < schools.get(thisSchool).classesList.size();j++){
                            for (int k = 0;k < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size();k++){
                                if (schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).getTeacher().getPersonalCode() == personalCode){
                                    schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).setTeacher(null);
                                    break;
                                }
                            }
                        }
                        schools.get(thisSchool).teachersList.remove(i);
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("=====================================================================");
                    System.out.println("-- Error ,Undefined teacher personal code , Enter valid teacher personal code --");
                    System.out.println("=====================================================================");
                }
            }
            teacherTable();
        }
        else
            System.out.println("Error , This school has no teacher, first add teacher");
    }



    static void selectTeacherToIncreaseDecreaseSalary(){
        Scanner scan = new Scanner(System.in);
        int personalCode;
        boolean a = false;
        String chooseNumber;
        if (schools.get(thisSchool).teachersList.size() > 0 ) {
            while (1 == 1) {
                System.out.println("=====================================================================");
                teacherTable();
                System.out.println("=====================================================================");
                System.out.println("Enter teacher personal code that you want to Increase/Decrease salary : ");
                personalCode = scan.nextInt();
                for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
                    if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == personalCode) {
                        while (1 == 1) {
                            showTeacherInfo(i);
                            scan.nextLine();
                            System.out.println("1) Increase Salary\n2) Decrease Salary\n3) Back to manager menu");
                            System.out.println("Enter number : ");
                            chooseNumber = scan.nextLine();
                            if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                schools.get(thisSchool).teachersList.get(i).setSalary(increaseSalary(schools.get(thisSchool).teachersList.get(i).getSalary()));
                                showTeacherInfo(i);
                                a = true;
                                break;
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                schools.get(thisSchool).teachersList.get(i).setSalary(decreaseSalary((schools.get(thisSchool).teachersList.get(i).getSalary())));
                                showTeacherInfo(i);
                                a = true;
                                break;
                            }
                            else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                break;
                            } else {
                                System.out.println("=================================================================================");
                                System.out.println("-- Error ,Undefined number , Enter valid number --");
                                System.out.println("=================================================================================");
                            }
                        }
                        if (a)
                            break;
                    }
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined teacher personal code , Enter valid teacher personal code --");
                    System.out.println("=================================================================================");
                    a = false;
                }
            }
        }
        else
            System.out.println("Error , This school has no teacher , first add teacher");
    }



    static int increaseSalary(int salary){
        Scanner scan = new Scanner(System.in);
        int percentage;
        System.out.println("=====================================================================");
        System.out.println("How much percentage do you want to increase salary (your answer should be a number between 0 - 100) ? ");
        System.out.print("percentage : ");
        percentage = scan.nextInt();
        if (percentage < 0 || percentage > 100){
            System.out.println("=====================================================================");
            System.out.println("-- Error ,  Percentage number should be 1 to 100 --");
            System.out.println("=====================================================================");
        }
        else{
            salary += (percentage * salary / 100);
        }
        return salary;
    }



    static int decreaseSalary(int salary){
        Scanner scan = new Scanner(System.in);
        int percentage;
        System.out.println("=====================================================================");
        System.out.println("How much percentage do you want to decrease salary (your answer should be a number between 0 - 100) ? ");
        System.out.print("percentage : ");
        percentage = scan.nextInt();
        if (percentage < 0 || percentage > 100){
            System.out.println("=====================================================================");
            System.out.println("-- Error ,  Percentage number should be 1 to 100 --");
            System.out.println("=====================================================================");
        }
        else{
            salary -= (percentage * salary / 100);
        }
        return salary;
    }



    static void allLessonsOfATeacher(){
        Scanner scan = new Scanner(System.in);
        int personalCode;
        boolean a ;
        if (schools.get(thisSchool).teachersList.size() > 0 && schools.get(thisSchool).lessonsList.size() > 0){
            while (1 == 1) {
                a = false;
                System.out.println("=====================================================================");
                teacherTable();
                System.out.println("=====================================================================");
                System.out.println("Enter teacher personal code that you want to see all of he's/she's lessons : ");
                personalCode = scan.nextInt();
                System.out.println("=====================================================================");
                for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
                    if (schools.get(thisSchool).teachersList.get(i).getPersonalCode() == personalCode) {
                        for (int j = 0;j < schools.get(thisSchool).classesList.size();j++){
                            for (int k = 0;k < schools.get(thisSchool).classesList.get(j).lessonsListOfClass.size();k++){
                                if (personalCode == schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).getTeacher().getPersonalCode()){
                                    System.out.println("class " + schools.get(thisSchool).classesList.get(j).getClassName() + " , Lesson " + schools.get(thisSchool).classesList.get(j).lessonsListOfClass.get(k).getLessonName());
                                    a = true;
                                }
                            }
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined teacher personal code , Enter valid teacher personal code --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error This school has no teacher and lesson , first add teacher and lesson");
    }



    static void allStudentOFAClass(){
        Scanner scan = new Scanner(System.in);
        boolean a ;
        String name;
        if (schools.get(thisSchool).studentsList.size() > 0 && schools.get(thisSchool).classesList.size() > 0){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                classTable();
                System.out.println("=====================================================================");
                System.out.println("Enter class name that you want to see all students : ");
                name = scan.nextLine();
                System.out.println("=====================================================================");
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++){
                    if (schools.get(thisSchool).classesList.get(i).getClassName().equals(name)){
                        for (int j = 0;j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();j++){
                            System.out.println("Class " + schools.get(thisSchool).classesList.get(i).getClassName() + " , Student : " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getName() + " " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getLastName());
                            a = true;
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined class name , Enter valid class name --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student and class , first add student and class");
    }



    static void allStudentOFALesson(){
        Scanner scan = new Scanner(System.in);
        boolean a ;
        String name;
        if (schools.get(thisSchool).studentsList.size() > 0 && schools.get(thisSchool).lessonsList.size() > 0){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                lessonTable();
                System.out.println("=====================================================================");
                System.out.println("Enter lesson name that you want to see all students : ");
                name = scan.nextLine();
                System.out.println("=====================================================================");
                for (int i = 0; i < schools.get(thisSchool).lessonsList.size(); i++){
                    if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(name)){
                        for (int j = 0;j < schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.size();j++){
                            System.out.println("Lesson " + schools.get(thisSchool).lessonsList.get(i).getLessonName() + " , Student : " + schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.get(j).getName() + " " + schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.get(j).getLastName());
                            a = true;
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined lesson name , Enter valid lesson name --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student and lesson , first add student and lesson");
    }



    static void allClassesOFAStudent(){
        Scanner scan = new Scanner(System.in);
        boolean a ;
        long nationalCode;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                studentTable();
                System.out.println("=====================================================================");
                System.out.println("Enter national code of student that you want to see all his/here classes : ");
                nationalCode = scan.nextLong();
                System.out.println("=====================================================================");
                for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++){
                    if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode){
                        for (int j = 0;j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();j++){
                            if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getNationalCode() == nationalCode) {
                                System.out.println("Class " + schools.get(thisSchool).classesList.get(i).getClassName() + " , Student : " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getName() + " " + schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getLastName());
                                a = true;
                                break;
                            }
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined lesson name , Enter valid lesson name --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student and class , first add student and class");
    }



    static void allLessonsOFAStudent(){
        Scanner scan = new Scanner(System.in);
        boolean a ;
        long nationalCode;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                studentTable();
                System.out.println("=====================================================================");
                System.out.println("Enter national code of student that you want to see all his/here lessons : ");
                nationalCode = scan.nextLong();
                System.out.println("=====================================================================");
                for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++){
                    if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode){
                        for (int j = 0;j < schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.size();j++){
                            if (schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.get(j).getNationalCode() == nationalCode) {
                                System.out.println("Student : " + schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.get(j).getName() + " " + schools.get(thisSchool).lessonsList.get(i).studentsOfLesson.get(j).getLastName() + " , lesson :  " + schools.get(thisSchool).lessonsList.get(i).getLessonName());
                                a = true;
                            }
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined lesson name , Enter valid lesson name --");
                    System.out.println("=================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student and class , first add student and class");
    }



    static void allGradeLessonOFAStudent(){
        Scanner scan = new Scanner(System.in);
        boolean a  , b  , c ;
        long nationalCode;
        String lessonName ;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0){
            while (1 == 1){
                a = false;
                System.out.println("=====================================================================");
                studentTable();
                System.out.println("=====================================================================");
                System.out.println("Enter national code of student that you want to see all his/here grade : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++){
                    if (schools.get(thisSchool).studentsList.get(i).getNationalCode() == nationalCode){
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
                else{
                    System.out.println("=================================================================================");
                    System.out.println("-- Error ,Undefined national code , Enter valid national code --");
                    System.out.println("=================================================================================");
                }
            }
            while (1 == 1){
                b = false;
                for (int i = 0; i < schools.get(thisSchool).lessonsList.size();i++){
                    for (int j = 0; j < schools.get(thisSchool).lessonsList.get(i).nationalCodes.size();j++){
                        if (schools.get(thisSchool).lessonsList.get(i).nationalCodes.get(j).getNationalCode() == nationalCode){
                            System.out.println("Lesson name : " + schools.get(thisSchool).lessonsList.get(i).getLessonName());
                            b = true;
                        }
                    }
                }
                if (b)
                    break;
                else{
                    System.out.println("=================================================================================");
                    System.out.println("-- Error , This student has no grade --");
                    System.out.println("=================================================================================");
                }
            }
            scan.nextLine();
            while (1 == 1){
                c = false;
                System.out.println("=====================================================================");
                System.out.println("Enter lesson name that you want to see grade of chosen student : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).lessonsList.size();i++){
                    for (int j = 0; j < schools.get(thisSchool).lessonsList.get(i).nationalCodes.size();j++){
                        if (schools.get(thisSchool).lessonsList.get(i).nationalCodes.get(j).getNationalCode() == nationalCode && schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(lessonName) && schools.get(thisSchool).lessonsList.get(i).scores.size() > 0){
                            thisLesson = i;
                            thisStudent = j;
                            System.out.println("Student : " + schools.get(thisSchool).lessonsList.get(thisLesson).nationalCodes.get(thisStudent).getName() + " " + schools.get(thisSchool).lessonsList.get(thisLesson).studentsOfLesson.get(thisStudent).getLastName());
                            System.out.println("Lesson : " + schools.get(thisSchool).lessonsList.get(thisLesson).getLessonName());
                            System.out.println("Grade : " + schools.get(thisSchool).lessonsList.get(thisLesson).scores.get(thisStudent));
                            c = true;
                            break;
                        }
                    }
                    if (c)
                        break;
                }
                if (c)
                    break;
                else{
                    System.out.println("==============================================================================================================================");
                    System.out.println("-- Error , Undefined lesson name OR no grade found , Enter valid lesson name OR call your teacher to set grade for students --");
                    System.out.println("==============================================================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no student and class , first add student and class");
    }



    static void aveAndSDOfGradesOfLesson(){
        Scanner scan = new Scanner(System.in);
        int size;
        double average , sd , sum = 0 , sumSD = 0;
        boolean a ;
        String lessonName , chooseWTD;
        while (1 == 1){
            a = false;
            System.out.println("=================================================================================");
            lessonTable();
            System.out.println("=================================================================================");
            System.out.println("Enter lesson name that you want to calculate average of student grades : ");
            lessonName = scan.nextLine();
            for (int i = 0;i < schools.get(thisSchool).lessonsList.size();i++){
                if (schools.get(thisSchool).lessonsList.get(i).getLessonName().equals(lessonName)) {
                    thisLesson = i;
                    a = true;
                    break;
                }
            }
            if (a)
                break;
            else{
                System.out.println("=================================================================================");
                System.out.println("-- Error , Undefined lesson name , Enter valid lesson name --");
                System.out.println("=================================================================================");
                while (1 == 1) {
                    System.out.println("Do you want to continue ? (YES | NO)");
                    chooseWTD = scan.next();
                    if (chooseWTD.equals("YES")) {
                        System.out.println("Start again");
                    } else if (chooseWTD.equals("NO"))
                        break;
                    else
                        System.out.println("TYPE YES OR NO");
                }
            }
        }
        if (schools.get(thisSchool).lessonsList.get(thisLesson).scores.size() > 0){
            size = schools.get(thisSchool).lessonsList.get(thisLesson).scores.size();
            for (int i = 0;i < schools.get(thisSchool).lessonsList.get(thisLesson).scores.size();i++){
                sum += schools.get(thisSchool).lessonsList.get(thisLesson).scores.get(i);
            }
            average = sum / size;
            System.out.println("=================================================================================");
            System.out.println("Lesson name : " + schools.get(thisSchool).lessonsList.get(thisLesson).getLessonName());
            System.out.format("Average is : %.2f" , average);
            System.out.println();
            for (int i = 0;i < schools.get(thisSchool).lessonsList.get(thisLesson).scores.size();i++){
                sumSD += Math.pow( ( schools.get(thisSchool).lessonsList.get(thisLesson).scores.get(i) - average ) , 2);
            }
            sd = Math.sqrt(sumSD / size);
            System.out.format("Standard deviation is : %.4f" , sd);
            System.out.println();
        }
        else
            System.out.println("Error , This lesson has no grades for students");
    }



    static void aveAndSDOfGradesOfClass(){
        Scanner scan = new Scanner(System.in);
        int size;
        double average , sd , sum = 0 , sumSD = 0;
        boolean a  , b ;
        String lessonName , className;
        while (1 == 1){
            a = false;
            System.out.println("=================================================================================");
            classTable();
            System.out.println("=================================================================================");
            System.out.println("Enter class name that you want to calculate average of student grades : ");
            className = scan.nextLine();
            for (int i = 0;i < schools.get(thisSchool).classesList.size();i++){
                if (schools.get(thisSchool).classesList.get(i).getClassName().equals(className)) {
                    thisClass1 = i;
                    a = true;
                    break;
                }
            }
            if (a)
                break;
            else{
                System.out.println("=================================================================================");
                System.out.println("-- Error , Undefined class name , Enter valid class name --");
                System.out.println("=================================================================================");
            }
        }
        while (1 == 1){
            b = false;
            System.out.println("=================================================================================");
            lessonTable();
            System.out.println("=================================================================================");
            System.out.println("Enter lesson name that you want to calculate average of student grades : ");
            lessonName = scan.nextLine();
            for (int i = 0;i < schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.size();i++){
                if (schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(i).getLessonName().equals(lessonName)) {
                    thisLesson = i;
                    b = true;
                    break;
                }
            }
            if (b)
                break;
            else{
                System.out.println("=================================================================================");
                System.out.println("-- Error , Undefined lesson name , Enter valid lesson name --");
                System.out.println("=================================================================================");
            }
        }
        if (schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.size() > 0){
            size = schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.size();
            for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.size();i++){
                sum += schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.get(i);
            }
            average = sum / size;
            System.out.println("=================================================================================");
            System.out.println("Class name : " + schools.get(thisSchool).classesList.get(thisClass1).getClassName());
            System.out.println("Lesson name : " + schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).getLessonName());
            System.out.format("Average is : %.2f" , average);
            System.out.println();
            for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.size();i++){
                sumSD += Math.pow( ( schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).scores.get(i) - average ) , 2);
            }
            sd = Math.sqrt(sumSD / size);
            System.out.format("Standard deviation is : %.4f" , sd);
            System.out.println();
        }
        else
            System.out.println("Error , This lesson has no grades for students");
    }




    static void viewAllGradesOfATeacherOfALesson(){
        Scanner scan = new Scanner(System.in);
        boolean a ;
        String lessonName ;
        while (1 == 1){
            a = false;
            System.out.println("=================================================================================");
            lessonTable();
            System.out.println("=================================================================================");
            System.out.println("Enter lesson name that you want to calculate average of student grades : ");
            lessonName = scan.nextLine();
            for (int i = 0;i < schools.get(thisSchool).classesList.size();i++) {
                for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size();j++) {
                    if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName().equals(lessonName) && schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).scores.size() > 0) {
                        thisClass1 = i;
                        thisLesson = j;
                        a = true;
                        break;
                    }
                }
                if (a)
                    break;
            }
            if (a)
                break;
            else{
                System.out.println("===================================================================================================================");
                System.out.println("-- Error , Undefined lesson name OR no grades found , Enter valid lesson name OR call your teacher to add grades --");
                System.out.println("===================================================================================================================");
            }
        }
        System.out.println("=================================================================================");
        System.out.println("Teacher name : " + schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).getTeacher().getName() + " " + schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(thisLesson).getTeacher().getLastName());
        showGrade(thisClass1 , thisLesson);
    }




    static void teacherLogin() {
        Scanner scan = new Scanner(System.in);
        String username, checkUsername = "a", password, checkPassword = "b";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Teacher log in ~~~~~");
        while (1 == 1) {
            System.out.println("Enter Username : ");
            username = scan.next();
            for (int i = 0; i < schools.size(); i++) {
                for (int j = 0; j < schools.get(i).teachersList.size(); j++) {
                    if (schools.get(i).teachersList.get(j).getUserName().equals(username)) {
                        checkUsername = username;
                        thisSchool = i;
                        thisTeacher = j;
                        break;
                    }
                }
            }
            if (username.equals(checkUsername))
                break;
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined username , Enter existing username --");
                System.out.println("=====================================================================");
            }
        }
        while (1 == 1) {
            System.out.println("Enter password : ");
            password = scan.next();
            for (int i = 0; i < schools.get(thisSchool).teachersList.size(); i++) {
                if (schools.get(thisSchool).teachersList.get(i).getPassword().equals(password)) {
                    checkPassword = password;
                    break;
                }
            }
            if (password.equals(checkPassword))
                break;
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined password , Enter existing password --");
                System.out.println("=====================================================================");
            }
        }
    }




    static void teacherMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Teacher Menu ~~~~~");
        System.out.println("1) View grades of student of your lesson\n2) Add grades of student of your lesson\n3) Edit grades of students of your lesson\n4) Delete grades of students of your lesson");
        System.out.println("5) View average and standard deviation of specific lesson\n6) Log Out");
        System.out.print("Enter Number : ");
    }




    static void showGrade(){   // view grades of student of his/here lessons
        Scanner scan = new Scanner(System.in);
        boolean a ;
        String lessonName;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).studentsList.size() > 0){
            for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                    if (j == 0)
                        System.out.println("=====================================================================");
                    if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode()) {
                        System.out.println("Lesson name " + j + 1 + " : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName());
                    }
                }
            }
            while (1 == 1) {
                a = false;
                System.out.println("=====================================================================");
                System.out.println("Enter your lesson name  : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                        if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode() && schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName().equals(lessonName)) {
                            thisLesson = j;
                            thisClassGrade = i;
                            a = true;
                            break;
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined lesson name , Enter valid name --");
                    System.out.println("=====================================================================");
                }
            }
            System.out.println("=====================================================================");
            showGrade(thisClassGrade , thisLesson);
            System.out.println("=====================================================================");
        }
        else
            System.out.println("Error , This school has no student and class , Call your manager to add student and class");
    }





    static void addGrade() {
        Scanner scan = new Scanner(System.in);
        double score;
        long nationalCode;
        boolean a , b ;
        String lessonName;
        if (schools.get(thisSchool).studentsList.size() > 0) {
            for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                    if (j == 0)
                        System.out.println("=====================================================================");
                    if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode()) {
                        System.out.println("Lesson name " + j + 1 + " : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName());
                    }
                }
            }
            while (1 == 1) {
                a = false;
                System.out.println("=====================================================================");
                System.out.println("Enter your lesson name that you want to set students grades : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                        if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode() && schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName().equals(lessonName)) {
                            thisLesson = j;
                            thisClassGrade = i;
                            a = true;
                            break;
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined lesson name , Enter valid name --");
                    System.out.println("=====================================================================");
                }
            }
            while (1 == 1) {
                b = false;
                System.out.println("=====================================================================");
                studentOfLessonOfClass(thisClassGrade, thisLesson);
                System.out.println("=====================================================================");
                System.out.println("Enter student national code that you want to set grade : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).studentsOfLesson.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).studentsOfLesson.get(i).getNationalCode() == nationalCode && schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.size() == 0) {
                        schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.add(schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).studentsOfLesson.get(i));
                        System.out.println("Enter grade : ");
                        score = scan.nextDouble();
                        if (score > 0 || score <= 20) {
                            schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.add(score);
                        } else {
                            System.out.println("===================================================");
                            System.out.println("-- Error , Undefined number , Enter Valid Number --");
                            System.out.println("===================================================");
                        }
                        b = true;
                    }
                    else{
                        for (int j = 0; j < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.size();j++) {
                            if (schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).studentsOfLesson.get(i).getNationalCode() == nationalCode && schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.get(j).getNationalCode() != nationalCode) {
                                schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.add(schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).studentsOfLesson.get(i));
                                System.out.println("Enter grade : ");
                                score = scan.nextDouble();
                                if (score > 0 || score <= 20) {
                                    schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.add(score);
                                } else {
                                    System.out.println("===================================================");
                                    System.out.println("-- Error , Undefined number , Enter Valid Number --");
                                    System.out.println("===================================================");
                                }
                                b = true;
                            }
                        }
                    }
                }
                if (b)
                    break;
                else {
                    System.out.println("=======================================================================================================================");
                    System.out.println("-- Error , Undefined number OR repeated student , Enter valid number and you can set grade only 1 time for a student --");
                    System.out.println("=======================================================================================================================");
                }
            }
        }
        else
            System.out.println("Error , This  school has no student , call your manager to add students");
    }





    static void editGrade(){
        Scanner scan = new Scanner(System.in);
        double score;
        long nationalCode;
        boolean b ;
        if (schools.get(thisSchool).studentsList.size() > 0) {
            showGrade();
            while (1 == 1) {
                b = false;
                System.out.println("=====================================================================");
                System.out.println("Enter student national code that you want to set grade : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.get(i).getNationalCode() == nationalCode) {
                        thisStudentGrade = i;
                        System.out.println("Enter grade : ");
                        score = scan.nextDouble();
                        if (score > 0 || score <= 20) {
                            schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.set(thisStudentGrade , score);
                        } else {
                            System.out.println("=====================================================================");
                            System.out.println("-- Error , Undefined number , Enter valid number --");
                            System.out.println("=====================================================================");
                        }
                        b = true;
                    }
                }
                if (b)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined national code , Enter valid national code --");
                    System.out.println("=====================================================================");
                }
            }
        }
        else
            System.out.println("Error , This  school has no student , call your manager to add students");
    }




    static void deleteGrade(){
        Scanner scan = new Scanner(System.in);
        long nationalCode;
        boolean b ;
        if (schools.get(thisSchool).studentsList.size() > 0) {
            showGrade();
            while (1 == 1) {
                b = false;
                System.out.println("=====================================================================");
                System.out.println("Enter student national code that you want to set grade : ");
                nationalCode = scan.nextLong();
                for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.size(); i++) {
                    if (schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.get(i).getNationalCode() == nationalCode) {
                        thisStudentGrade = i;
                        schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).nationalCodes.remove(thisStudentGrade);
                        schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.remove(thisStudentGrade);
                        b = true;
                    }
                }
                if (b)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined national code , Enter valid national code --");
                    System.out.println("=====================================================================");
                }
            }
        }
        else
            System.out.println("Error , This  school has no student , call your manager to add students");
    }




    static void showAveAndSD(){
        Scanner scan = new Scanner(System.in);
        int size;
        double average , sd , sum = 0 , sumSD = 0;
        boolean a ;
        String lessonName;
        if (schools.get(thisSchool).studentsList.size() > 0) {
            for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                    if (j == 0)
                        System.out.println("=====================================================================");
                    if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode()) {
                        System.out.println("Lesson name " + j + 1 + " : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName());
                    }
                }
            }
            while (1 == 1) {
                a = false;
                System.out.println("=====================================================================");
                System.out.println("Enter your lesson name that you want to see Grade point average and standard deviation : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                    for (int j = 0; j < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size(); j++) {
                        if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getTeacher().getPersonalCode() == schools.get(thisSchool).teachersList.get(thisTeacher).getPersonalCode() && schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(j).getLessonName().equals(lessonName)) {
                            thisLesson = j;
                            thisClassGrade = i;
                            a = true;
                            break;
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
                else {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined lesson name , Enter valid name --");
                    System.out.println("=====================================================================");
                }
            }
            if (schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.size() > 0){
                size = schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.size();
                for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.size();i++){
                    sum += schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.get(i);
                }
                average = sum / size;
                System.out.println("=====================================================================");
                System.out.format("Average is : %.2f" , average);
                System.out.println();
                for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.size();i++){
                    sumSD += Math.pow( ( schools.get(thisSchool).classesList.get(thisClassGrade).lessonsListOfClass.get(thisLesson).scores.get(i) - average ) , 2);
                }
                sd = Math.sqrt(sumSD / size);
                System.out.format("Standard deviation is : %.4f" , sd);
                System.out.println();
            }
            else
                System.out.println("Error , First add scores");
        }
        else
            System.out.println("Error , This  school has no student , call your manager to add students");
    }




    static void studentLogin(){
        Scanner scan = new Scanner(System.in);
        String username, checkUsername = "a", password, checkPassword = "b";
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Student log in ~~~~~");
        while (1 == 1){System.out.println("Enter Username : ");
            username = scan.next();
            for (int i = 0; i < schools.size(); i++) {
                for (int j = 0; j < schools.get(i).studentsList.size(); j++) {
                    if (schools.get(i).studentsList.get(j).getUserName().equals(username)) {
                        checkUsername = username;
                        thisSchool = i;
                        thisStudent = j;
                        break;
                    }
                }
            }
            if (username.equals(checkUsername))
                break;
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined username , Enter existing username --");
                System.out.println("=====================================================================");
            }
        }
        while (1 == 1) {
            System.out.println("Enter password : ");
            password = scan.next();
            for (int i = 0; i < schools.get(thisSchool).studentsList.size(); i++) {
                if (schools.get(thisSchool).studentsList.get(i).getPassword().equals(password)) {
                    checkPassword = password;
                    break;
                }
            }
            if (password.equals(checkPassword))
                break;
            else {
                System.out.println("=====================================================================");
                System.out.println("-- Error , Undefined password , Enter existing password --");
                System.out.println("=====================================================================");
            }
        }
    }




    static void studentMenu(){
        System.out.println("=====================================================================");
        System.out.println("~~~~~ Student Menu ~~~~~");
        System.out.println("1) view grades of specific lesson\n2) view average of specifics lesson\n3) Log out");
        System.out.println("Enter number : ");
    }



    static void gradesOfSLesson(){
        Scanner scan = new Scanner(System.in);
        boolean a = false , b ;
        String lessonName;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).lessonsList.size() > 0){
            for (int i = 0; i < schools.get(thisSchool).classesList.size();i++){
                for (int j = 0;j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();j++){
                    if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getNationalCode() == schools.get(thisSchool).studentsList.get(thisStudent).getNationalCode()){
                        a = true;
                        System.out.println("=====================================================================");
                        for (int k = 0;k < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size();k++){
                            System.out.println("Lesson name : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getLessonName());
                        }
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
            }
            while (1 == 1){
                b = false;
                System.out.println("=====================================================================");
                System.out.println("Enter your lesson name  : ");
                lessonName = scan.nextLine();
                for (int i = 0; i < schools.get(thisSchool).classesList.size();i++){
                    for (int j = 0;j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size();j++){
                        if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getNationalCode() == schools.get(thisSchool).studentsList.get(thisStudent).getNationalCode()){
                            for (int k = 0;k < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.size();k++){
                                if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getLessonName().equals(lessonName)){
                                    for (int z = 0; z < schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).nationalCodes.size();z++){
                                        if (schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).nationalCodes.get(z).getNationalCode() == schools.get(thisSchool).studentsList.get(thisStudent).getNationalCode()){
                                            System.out.println("=====================================================================");
                                            System.out.println("Student name : " + schools.get(thisSchool).studentsList.get(thisStudent).getName() + " " + schools.get(thisSchool).studentsList.get(thisStudent).getLastName());
                                            System.out.println("Class name : " + schools.get(thisSchool).classesList.get(i).getClassName());
                                            System.out.println("Lesson name : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).getLessonName());
                                            System.out.println("Grade : " + schools.get(thisSchool).classesList.get(i).lessonsListOfClass.get(k).scores.get(z));
                                            b = true;
                                            break;
                                        }
                                    }
                                }
                                if (b)
                                    break;
                            }
                        }
                        if (b)
                            break;
                    }
                    if (b)
                        break;
                }
                if (b)
                    break;
                else{
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Undefined lesson name or no grade --");
                    System.out.println("=====================================================================");
                }
            }
        }
        else
            System.out.println("Error , This school has no class and lesson");
    }




    static void averageOfStudent(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Lesson> lessonsForAverage = new ArrayList<>();
        int chooseNumber ,k = 0, z = 0;
        double sumAve = 0 , sumUnits = 0 , average;
        boolean a = false , b = false , c = false;
        String lessonName;
        if (schools.get(thisSchool).classesList.size() > 0 && schools.get(thisSchool).lessonsList.size() > 0) {
            for (int i = 0; i < schools.get(thisSchool).classesList.size(); i++) {
                for (int j = 0; j < schools.get(thisSchool).classesList.get(i).studentsListOfClass.size(); j++) {
                    if (schools.get(thisSchool).classesList.get(i).studentsListOfClass.get(j).getNationalCode() == schools.get(thisSchool).studentsList.get(thisStudent).getNationalCode()) {
                        thisClass1 = i;
                        showClassLessons(thisClass1);
                        a = true;
                    }
                    if (a)
                        break;
                }
                if (a)
                    break;
            }
            while (1 == 1) {
                System.out.println("=====================================================================");
                System.out.println("Enter number of lessons to calculate average : ");
                chooseNumber = scan.nextInt();
                scan.nextLine();
                if (chooseNumber > schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.size()) {
                    System.out.println("=====================================================================");
                    System.out.println("-- Error , Out of range , Enter valid number --");
                    System.out.println("=====================================================================");
                }
                else {
                    System.out.println("=====================================================================");
                    while (z < chooseNumber) {
                        System.out.println("Enter Lesson name number " + (z + 1) + " : ");
                        lessonName = scan.nextLine();
                        for (int i = 0; i < schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.size(); i++) {
                            if (schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(i).getLessonName().equals(lessonName)) {
                                k = i;
                                b = true;
                                break;
                            }
                        }
                        for (int i = 0; i < lessonsForAverage.size();i++) {
                            if (lessonsForAverage.get(i).getLessonName().equalsIgnoreCase(lessonName)) {
                                c = true;
                                break;
                            }
                        }
                        if ((b && c) || (b && lessonsForAverage.size() == 0)){
                            lessonsForAverage.add(schools.get(thisSchool).classesList.get(thisClass1).lessonsListOfClass.get(k));
                            z++;
                        }
                        else{
                            System.out.println("=====================================================================");
                            System.out.println("-- Error , Undefined lesson name Or repeated name , Enter valid name --");
                            System.out.println("=====================================================================");
                        }
                    }
                    break;
                }
            }
            for (int i = 0; i < lessonsForAverage.size();i++){
                for (int j = 0;j < lessonsForAverage.get(i).nationalCodes.size();j++){
                    if (schools.get(thisSchool).studentsList.get(thisStudent).getNationalCode() == lessonsForAverage.get(i).nationalCodes.get(j).getNationalCode()){
                        sumAve += ( lessonsForAverage.get(i).scores.get(j) * lessonsForAverage.get(i).getNumberOfUnits() );
                        sumUnits += lessonsForAverage.get(i).getNumberOfUnits();
                    }
                }
            }
            average = sumAve / sumUnits;
            System.out.println("=====================================================================");
            System.out.format("Average is : %.2f" , average);
            System.out.println();
        }
        else
            System.out.println("Error , This school has no class and lesson , call your manager to add");
    }




    static void goodByeMessage(){
        System.out.println("=====================================================================");
        System.out.println("***** Good bye have a nice day *****");
        System.out.println("=====================================================================");
        System.exit(0);
    }



    static void mainMenuErrorMessage(){
        System.out.println("=====================================================================");
        System.out.println("-- Error , Undefined number , Enter valid number --");
        System.out.println("=====================================================================");
    }



    static void hardcodedSet(){
        School school1 = new School();
        Teacher manager = new Teacher();
        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        Lesson lesson1 = new Lesson();
        Class class1 = new Class();
        Random rand = new Random();
        StringBuilder mix = new StringBuilder();
        Date date = Calendar.getInstance().getTime();
        int personaCod , lengthPersonalCod , schoolID , lengthSchoolID;
        while (1 == 1){
            schoolID = rand.nextInt(100000000);
            school1.setSchoolId(schoolID);
            lengthSchoolID = String.valueOf(schoolID).length();
            if(lengthSchoolID == 8 )
                break;
        }
        school1.setSchoolName("Shahid - Fahmideh");
        school1.setProvinceName("Khuzestan");
        school1.setCityName("Ahvaz");
        school1.setSchoolAddress("NO13 , Golestan street , Ahvaz , Khuzestan , Iran");
        school1.setSection("Primary School");
        manager.setName("Mohammad Hossein");
        manager.setLastName("Mazarei");
        manager.setPersonAddress("NO14 , Ahvaz , Khuzestan , Iran");
        manager.setUserName("mammadmzr");
        manager.setPassword("mazmaz");
        manager.setPhoneNumber("+981234567891");
        manager.setHiringDate(date);
        manager.setRank(1);
        manager.setEducation("MA");
        manager.setGender("Male");
        while (1 == 1) {
            personaCod = rand.nextInt(100000000);
            manager.setPersonalCode(personaCod);
            lengthPersonalCod = String.valueOf(personaCod).length();
            if(lengthPersonalCod == 8)
                break;
        }
        manager.setSalary(10000000);
        school1.setManager(manager);
        schools.add(school1);
        schools.get(thisSchool).teachersList.add(manager);
        schoolTeachers.add(manager);
        teacher1.setName("Mahdi");
        teacher1.setLastName("Tooyserkani");
        teacher1.setPersonAddress("NO13 , Ahvaz , Khuzestan , Iran");
        teacher1.setUserName("mahdiT");
        teacher1.setPassword("mahdiT");
        teacher1.setPhoneNumber("+981234567892");
        teacher1.setSalary(8000000);
        teacher1.setHiringDate(date);
        teacher1.setRank(2);
        teacher1.setEducation("Bachelor");
        teacher1.setGender("Male");
        while (1 == 1) {
            personaCod = rand.nextInt(100000000);
            teacher1.setPersonalCode(personaCod);
            lengthPersonalCod = String.valueOf(personaCod).length();
            if(lengthPersonalCod == 8)
                break;
        }
        schools.get(thisSchool).teachersList.add(teacher1);
        schoolTeachers.add(teacher1);
        student1.setName("Mohammad Reza");
        student1.setLastName("Etedal");
        student1.setPersonAddress("NO13 , Dezful , Khuzestan , Iran");
        student1.setUserName("mre");
        student1.setPassword("mre");
        student1.setNationalCode(1234567891);
        student1.setParentName("Abdollah");
        student1.setParentPhoneNumber("+981234567896");
        mix.append("2006/12/4");
        student1.setBirthday(mix);
        student1.setDateOfArrivalAtSchool(date);
        student1.setGender("Male");
        schoolStudents.add(student1);
        class1.setClassName("Hashtom");
        lesson1.setLessonName("Riazi1");
        lesson1.setNumberOfUnits(3);
        lesson1.setDays("Sunday");
        lesson1.setHours("11-12");
        lesson1.setTeacher(teacher1);
        lesson1.studentsOfLesson.add(student1);
        schools.get(thisSchool).studentsList.add(student1);
        class1.studentsListOfClass.add(student1);
        schools.get(thisSchool).classesList.add(class1);
        class1.lessonsListOfClass.add(lesson1);
        schools.get(thisSchool).lessonsList.add(lesson1);
    }



    public static void main(String[] args) {
        thisSchool = 0;
        thisClass = 0;
        thisTeacher = 0;
        thisClassGrade = 0;
        thisClass1 = 0;
        thisLesson = 0;
        thisStudentGrade = 0;
        thisStudent = 0;
        Scanner scan = new Scanner(System.in);
        String chooseNumber;
        hardcodedSet();
        while (1 == 1){
            mainMenu();
            chooseNumber = scan.next();
            if(chooseNumber.length() == 1 && chooseNumber.startsWith("1")){ // sign up manager
                signUpManager();
            }
            else if(chooseNumber.length() == 1 && chooseNumber.startsWith("2")){ // log in
                while (1 == 1) {
                    loginMenu();
                    chooseNumber = scan.next();
                    if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) { // manager log in
                        if (schools.size() > 0) {
                            managerLogin();
                            while (1 == 1) {
                                managerMenu();
                                chooseNumber = scan.next();
                                if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) { // lesson menu
                                    while (1 == 1) {
                                        lessonWorksMenu();
                                        chooseNumber = scan.next();
                                        if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                            createLesson(); // add lesson
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                            editLesson();
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                            deleteLesson(); // delete lesson
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                                            break;
                                        } else
                                            mainMenuErrorMessage();
                                    }
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) { // class menu
                                    while (1 == 1) {
                                        classWorksMenu();
                                        chooseNumber = scan.next();
                                        if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                            createClass(); // add class
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                            editClass();
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                            deleteClass(); // delete Class
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                                            break;
                                        } else
                                            mainMenuErrorMessage();
                                    }
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) { // student menu
                                    while (1 == 1) {
                                        studentWorkMenu();
                                        chooseNumber = scan.next();
                                        if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                            createStudent(); // add student
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                            editStudent(); // edit student
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                            deleteStudent(); // delete Student
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                                            break;
                                        } else
                                            mainMenuErrorMessage();
                                    }
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) { // teacher menu
                                    while (1 == 1) {
                                        teacherWorksMenu();
                                        chooseNumber = scan.next();
                                        if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                            createTeacher(); // add teacher
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                            editTeacher(); // edit Teacher
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                            deleteTeacher(); // delete Teacher
                                        } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                                            break;
                                        } else
                                            mainMenuErrorMessage();
                                    }
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("5")) {
                                    selectTeacherToIncreaseDecreaseSalary(); // Increase/Decrease teacher salary
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("6")) {
                                    allLessonsOfATeacher(); // all lessons of a specific teacher
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("7")) {
                                    allStudentOFAClass(); // all students of a specific class
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("8")) {
                                    allStudentOFALesson(); // all students of a specific lesson
                                } else if (chooseNumber.length() == 1 && chooseNumber.startsWith("9")) {
                                    allClassesOFAStudent(); // all classes of a specific student
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("10")) {
                                    allLessonsOFAStudent(); // all lessons of a specific student
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("11")) {
                                    allGradeLessonOFAStudent(); // view grade of specific lesson of specific student
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("12")) {
                                    aveAndSDOfGradesOfLesson(); // view Average and Standard deviation of students grades of a specific lesson
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("13")) {
                                    aveAndSDOfGradesOfClass(); // view Average and Standard deviation of students grades of specific lesson of specific class
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("14")) {
                                    viewAllGradesOfATeacherOfALesson(); // view all grades of teacher of specific lesson
                                } else if (chooseNumber.length() == 2 && chooseNumber.startsWith("15")) {
                                    break;
                                } else
                                    mainMenuErrorMessage();
                            }
                        }
                        else {
                            System.out.println("=============================================================================");
                            System.out.println("-- Error , No school found , first sign up school --");
                            System.out.println("=============================================================================");
                        }
                    }
                    else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                        if (schoolTeachers.size() > 0) {
                            teacherLogin(); // teacher log in
                            while (1 == 1) {
                                teacherMenu(); // teacher menu
                                chooseNumber = scan.next();
                                if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")) {
                                    showGrade(); // show grades of his/here lessons
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")) {
                                    addGrade(); // add grade for  students of his/here lessons
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                                    editGrade(); // edit grade of student that teacher choose
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                                    deleteGrade(); // delete grade of student that teacher choose
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("5")){
                                    showAveAndSD(); // show average and standard deviation of lesson that teacher pick
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("6")) {
                                    break;
                                } else
                                    mainMenuErrorMessage();
                            }
                        }
                        else{
                            System.out.println("=============================================================================");
                            System.out.println("-- Error , This school has no teacher , call your manager to add teachers --");
                            System.out.println("=============================================================================");
                        }
                    }
                    else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")) {
                        if (schoolStudents.size() > 0){
                            studentLogin();
                            while (1 == 1){
                                studentMenu();
                                chooseNumber = scan.next();
                                if (chooseNumber.length() == 1 && chooseNumber.startsWith("1")){
                                    gradesOfSLesson(); // view grade of specific lesson that student choose from his/here lesson
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("2")){
                                    averageOfStudent(); // view average of student
                                }
                                else if (chooseNumber.length() == 1 && chooseNumber.startsWith("3")){
                                    break;
                                }
                                else
                                    mainMenuErrorMessage();
                            }
                        }
                        else{
                            System.out.println("=============================================================================");
                            System.out.println("-- Error , This school has no student , call your manager to add student --");
                            System.out.println("=============================================================================");
                        }
                    }
                    else if (chooseNumber.length() == 1 && chooseNumber.startsWith("4")) {
                        break;
                    }
                    else
                        mainMenuErrorMessage();
                }
            }
            else if(chooseNumber.length() == 1 && chooseNumber.startsWith("3")){
                goodByeMessage();
            }
            else{
                mainMenuErrorMessage();
            }
        }
    }
}
