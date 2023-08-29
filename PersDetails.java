import java.util.ArrayList;

public class PersDetails {
    String firstName;
    String lastName;
    String headline;
    String currentPosition;
    String industry;
    String location;
    String aboutDescription;

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getFirstName() {return firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getLastName(){return lastName;}


    public void setHeadline(String headline) {this.headline = headline;}
    public String getHeadline() {return headline;}

    public void setCurrentPosition(String currentPosition) {this.currentPosition = currentPosition;}
    public String getCurrentPosition() {return currentPosition;}

    public void setIndustry(String industry) {this.industry = industry;}
    public String getIndustry() {return industry;}

    public void setLocation(String location) {this.location = location;}
    public String getLocation() {return location;}

    public void setAboutDescription(String aboutDescription) {this.aboutDescription = aboutDescription;}
    public String getAboutDescription() {return aboutDescription;}

    public ArrayList<String> obtainFeildNames(){
        ArrayList<String> feilds = new ArrayList<>();
        feilds.add("First Name");
        feilds.add("Last Name");
        feilds.add("Headline");
        feilds.add("Current position");
        feilds.add("Industry");
        feilds.add("Location");
        feilds.add("About Description");
        return feilds;
    }
}
