import java.io.IOException;
import java.util.ArrayList;

public interface Outputs {
    void savePersDetails(String filePath, PersDetails persDetails) throws IOException;
    void saveContactInfo(String filePath, ContactInfo contactInfo) throws IOException;
    void saveEducations(String filePath, ArrayList<Education> educations) throws IOException;
    void saveExperiences(String filePath, ArrayList<Experience> experiences) throws IOException;
    void saveVerification(String filePath, Verification verification) throws IOException;
}
