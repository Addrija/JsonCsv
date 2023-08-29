import java.util.ArrayList;

public class User {
    PersDetails persDetails;
    ContactInfo contactInfo;
    Verification verification;
    ArrayList<Experience> experiences = new ArrayList<>();
    ArrayList<Education> educations = new ArrayList<>();

    public void setPersDetails(String firstname, String lastname,String headline, String currentposition, String industry,String location, String about){
        this.persDetails = new PersDetails();
        this.persDetails.setFirstName(firstname);
        this.persDetails.setLastName(lastname);
        this.persDetails.setHeadline(headline);
        this.persDetails.setCurrentPosition(currentposition);
        this.persDetails.setIndustry(industry);
        this.persDetails.setLocation(location);
        this.persDetails.setAboutDescription(about);
    }

    public void setContactInfo(String email, String profileurl, String phoneno, String address, String bday){
        this.contactInfo = new ContactInfo();
        this.contactInfo.setEmail(email);
        this.contactInfo.setProfileURL(profileurl);
        this.contactInfo.setPhoneNo(phoneno);
        this.contactInfo.setAddress(address);
        this.contactInfo.setBirthday(bday);
    }

    public void setVerification(String aadharno, String workemail){
        this.verification = new Verification();
        this.verification.setAadharNo(aadharno);
        this.verification.setWorkEmail(workemail);
    }

    public void addExperience(Experience exp) {
        experiences.add(exp);
    }
    public void addEducation(Education ed){
        educations.add(ed);
    }

    public PersDetails getPersDetails() {
        return persDetails;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Verification getVerification() {
        return verification;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }
}
