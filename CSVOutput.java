import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVOutput implements Outputs{
    @Override
    public void savePersDetails(String filePath, PersDetails persDetails) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        ArrayList<String> fields = persDetails.obtainFeildNames();
        int numFields=fields.size();
        for(int i=0;i<numFields;i++){
            if(i<numFields-1)
                bw.write(fields.get(i) +",");
            else
                bw.write(fields.get(i));
        }
        bw.write("\n");
        bw.write(persDetails.getFirstName()+",");
        bw.write(persDetails.getLastName()+",");
        bw.write(persDetails.getHeadline()+",");
        bw.write(persDetails.getCurrentPosition()+",");
        bw.write(persDetails.getIndustry()+",");
        bw.write(persDetails.getLocation()+",");
        bw.write(persDetails.getAboutDescription());
        bw.close();
    }

    @Override
    public void saveContactInfo(String filePath,ContactInfo contactInfo) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        ArrayList<String> fields = contactInfo.obtainFeildNames();
        int numFields=fields.size();
        for(int i=0;i<numFields;i++){
            if(i<numFields-1)
                bw.write(fields.get(i) +",");
            else
                bw.write(fields.get(i));
        }
        bw.write("\n");
        bw.write(contactInfo.getEmail()+",");
        bw.write(contactInfo.getProfileURL()+",");
        bw.write(contactInfo.getPhoneNo()+",");
        bw.write(contactInfo.getAddress()+",");
        bw.write(String.valueOf(contactInfo.getBirthday()));
        bw.close();
    }

    @Override
    public void saveEducations(String filePath, ArrayList<Education> educations) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        ArrayList<String> fields = educations.get(0).obtainFeildNames();
        int numFields=fields.size();
        for(int i=0;i<numFields;i++){
            if(i<numFields-1)
                bw.write(fields.get(i) +",");
            else
                bw.write(fields.get(i));
        }
        for(Education ed:educations){
            bw.write("\n");
            bw.write(ed.getSchool()+",");
            bw.write(ed.getDegree());
        }
        bw.close();
    }

    @Override
    public void saveExperiences(String filePath, ArrayList<Experience> experiences) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        ArrayList<String> fields = experiences.get(0).obtainFeildNames();
        int numFields=fields.size();
        for(int i=0;i<numFields;i++){
            if(i<numFields-1)
                bw.write(fields.get(i) +",");
            else
                bw.write(fields.get(i));
        }
        for(Experience ex:experiences){
            bw.write("\n");
            bw.write(ex.getTitle()+",");
            bw.write(String.valueOf(ex.getEmploymentType())+",");
            bw.write(ex.getCompanyName()+",");
            bw.write(ex.getLocation()+",");
            bw.write(String.valueOf(ex.getLocationType())+",");
            bw.write(String.valueOf(ex.getCurrentlyWorking())+",");
            bw.write(String.valueOf(ex.getStartDate())+",");
            bw.write(String.valueOf(ex.getEndDate())+",");
            bw.write(ex.getIndustry()+",");
            bw.write(String.join("|",ex.getSkills()));
        }
        bw.close();
    }
    @Override
    public void saveVerification(String filePath, Verification verification) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(writer);
        ArrayList<String> fields = verification.obtainFeildNames();
        int numFields=fields.size();
        for(int i=0;i<numFields;i++){
            if(i<numFields-1)
                bw.write(fields.get(i) +",");
            else
                bw.write(fields.get(i));
        }
        bw.write("\n");
        bw.write(verification.getAadharNo()+",");
        bw.write(verification.getWorkEmail());
        bw.close();
    }

}
