import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Experience {
    String title;
    EmploymentType employmentType;
    String companyName;
    String location;
    LocationType locationType;
    Boolean currentlyWorking;
    LocalDate startDate;
    LocalDate endDate;
    String industry;
    ArrayList<String> skills;

    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}

    public void setEmploymentType(EmploymentType empType) {this.employmentType=empType;}
    public EmploymentType getEmploymentType() {return employmentType;}

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setLocationType(LocationType locType) {
        this.locationType=locType;
        }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setCurrentlyWorking(Boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }
    public Boolean getCurrentlyWorking(){
        return currentlyWorking;
    }

    public void setStartDate(String dateStr) throws DateTimeException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        startDate = LocalDate.parse(dateStr, formatter);
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setEndDate(String dateStr) throws DateTimeException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        endDate = LocalDate.parse(dateStr, formatter);
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
    public String getIndustry() {
        return industry;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
    public ArrayList<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill){skills.add(skill);}

    public void setAllFields(String title, EmploymentType empType, String companyName, String location,LocationType locationType,
                             Boolean currentlyWorking,String startDate,String endDate, String industry, ArrayList<String> skills) throws DateTimeException{
        setTitle(title);
        setEmploymentType(empType);
        setCompanyName(companyName);
        setLocation(location);
        setLocationType(locationType);
        setCurrentlyWorking(currentlyWorking);
        setStartDate(startDate);
        setEndDate(endDate);
        setIndustry(industry);
        setSkills(skills);
    }

    public ArrayList<String> obtainFeildNames(){
        ArrayList<String> feilds = new ArrayList<>();
        feilds.add("Title");
        feilds.add("Employment Type");
        feilds.add("Company Name");
        feilds.add("Location");
        feilds.add("location Type");
        feilds.add("Currently working?");
        feilds.add("Start date");
        feilds.add("End Date");
        feilds.add("Industry");
        feilds.add("Skills");

        return feilds;
    }
}

