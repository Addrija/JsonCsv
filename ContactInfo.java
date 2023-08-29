import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ContactInfo {
    String email;
    String profileURL;
    String phoneNo;
    String address;
    LocalDate birthday;

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }
    public String getProfileURL() {
        return profileURL;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setBirthday(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        birthday = LocalDate.parse(dateStr, formatter);
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public ArrayList<String> obtainFeildNames(){
        ArrayList<String> feilds = new ArrayList<>();
        feilds.add("Email");
        feilds.add("Profile URL");
        feilds.add("Phone No.");
        feilds.add("Address");
        feilds.add("Birthday");
        return feilds;
    }
}
