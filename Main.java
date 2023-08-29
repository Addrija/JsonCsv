import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        ConsoleInput consoleInput = new ConsoleInput();
        try (Scanner sc = new Scanner(System.in)) {
            user = consoleInput.inputPersDetailsInUser(sc,user);
            user = consoleInput.inputContactInfoInUser(sc,user);
            user = consoleInput.inputExperiencesInUser(sc,user);
            user = consoleInput.inputEducationsInUser(sc,user);
            user = consoleInput.inputVerificationsInUser(sc,user);

//            String csvOutFilePath="/Users/cb-it-01-1959/Documents/Assigin-2/JsonCsv/outputFiles/CSV";
            System.out.println("\nEnter path of directory for storing CSV output files:");
            String csvOutFilePath=sc.nextLine();
            Outputs csvOutput = new CSVOutput();
            csvOutput.savePersDetails(csvOutFilePath +"/persDetails.csv", user.getPersDetails());
            csvOutput.saveContactInfo(csvOutFilePath +"/contactInfo.csv", user.getContactInfo());
            csvOutput.saveEducations(csvOutFilePath + "/educations.csv", user.getEducations());
            csvOutput.saveExperiences(csvOutFilePath + "/experiences.csv", user.getExperiences());
            csvOutput.saveVerification(csvOutFilePath + "/verifications.csv", user.getVerification());

            System.out.println("\nEnter path of directory for storing JSON output files:");
//            String jsonOutFilePath="/Users/cb-it-01-1959/Documents/Assigin-2/JsonCsv/outputFiles/JSON";
            String jsonOutFilePath=sc.nextLine();
            Outputs jsonOutput = new JSONOutput();
            jsonOutput.savePersDetails(jsonOutFilePath + "/persDetails.json", user.getPersDetails());
            jsonOutput.saveContactInfo(jsonOutFilePath + "/contactInfo.json", user.getContactInfo());
            jsonOutput.saveEducations(jsonOutFilePath + "/educations.json", user.getEducations());
            jsonOutput.saveExperiences(jsonOutFilePath + "/experiences.json", user.getExperiences());
            jsonOutput.saveVerification(jsonOutFilePath + "/verifications.json", user.getVerification());
        }
    }
}