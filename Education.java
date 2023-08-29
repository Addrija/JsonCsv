import java.time.LocalDate;
import java.util.ArrayList;

public class Education {
    /*
    School
    Degree
    Field of study
    Start date
    End date
    Grade
    Activities and societies
    Description
    Skills
    */

    String school;
    String degree;
//    String fieldOfStudy;
//    LocalDate startDate;
//    LocalDate endDate;
//    Double grade;
//    ArrayList<String> activities;
//    String description;
//    ArrayList<String> skills;

    public void setSchool(String school) {
        this.school = school;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }
    public String getDegree(){
        return  degree;
    }

    public ArrayList<String> obtainFeildNames(){
        ArrayList<String> feilds = new ArrayList<>();
        feilds.add("School");
        feilds.add("Degree");
        return feilds;
    }
}
