import java.util.ArrayList;

public class Verification {

    String aadharNo;
    String workEmail;


    public void setAadharNo(String aadharNo) {this.aadharNo = aadharNo;}
    public void setWorkEmail(String workEmail) {this.workEmail = workEmail;}

    public String getAadharNo(){
        return aadharNo;
    }
    public String getWorkEmail() {
        return workEmail;
    }

    public ArrayList<String> obtainFeildNames(){
        ArrayList<String> feilds = new ArrayList<>();
        feilds.add("Aadhar no.");
        feilds.add("Work email");
        return feilds;
    }
}
