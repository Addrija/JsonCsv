import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput {
    public User inputPersDetailsInUser(Scanner sc, User user1){
        System.out.println("Please enter PERSONAL DETAILS:");
        System.out.println("First name:");
        String fn = sc.nextLine();
        System.out.println("Last name:");
        String ln = sc.nextLine();
        System.out.println("Headline:");
        String headline = sc.nextLine();
        System.out.println("Current position:");
        String currPos = sc.nextLine();
        System.out.println("Industry:");
        String ind = sc.nextLine();
        System.out.println("Location:");
        String loc = sc.nextLine();
        System.out.println("About description:");
        String about = sc.nextLine();
        user1.setPersDetails(fn, ln, headline, currPos, ind, loc, about);
        return user1;
    }

    public User inputContactInfoInUser(Scanner sc,User user1){
        System.out.println("\nPlease enter CONTACT INFORMATION:");
        System.out.println("Email id:");
        String email = sc.nextLine();
        System.out.println("Profile URL:");
        String profileURL = sc.nextLine();
        System.out.println("Phone number:");
        String ph = sc.nextLine();
        System.out.println("Address:");
        String add = sc.nextLine();
        System.out.println("Birthday (dd/mm/yyyy):");
        String bday = sc.nextLine();
        user1.setContactInfo(email, profileURL, ph, add, bday);
        return user1;
    }

    public User inputExperiencesInUser(Scanner sc,User user1){
        System.out.println("\nEnter EXPERIENCES:");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            Experience exp1 = new Experience();
            System.out.println("Job title:");
            String title = sc.nextLine();
            System.out.println("Enter type of employment:");
            System.out.println("1.Full-time\t2.Internship");
            int empInt = sc.nextInt();
            EmploymentType employmentType = null;
            if (empInt == 1) {
                employmentType = EmploymentType.FULLTIME;
            } else if (empInt == 2) {
                employmentType = EmploymentType.INTERNSHIP;
            }
            sc.nextLine();
            System.out.println("Enter company name:");
            String companyName = sc.nextLine();
            System.out.println("Company location:");
            String location = sc.nextLine();
            System.out.println("Enter location type:");
            System.out.println("1.Remote\t2.On-site\t3.Hybrid");
            int locInt = sc.nextInt();
            LocationType locationType = null;
            if (locInt == 1) {
                locationType = LocationType.REMOTE;
            } else if (locInt == 2) {
                locationType = LocationType.ONSITE;
            } else if (locInt == 3) {
                locationType = LocationType.HYBRID;
            }

            System.out.println("Currently working here?:");
            System.out.println("1.Yes \t2.No");
            int cwInt = sc.nextInt();
            boolean currentlyWorking = false;
            if(cwInt==1) {
                currentlyWorking = true;
            } else if (cwInt==2) {
                currentlyWorking = false;
            }
            sc.nextLine();
            System.out.println("Start date (dd/mm/yyyy):");
            String startDate = sc.nextLine();
            System.out.println("End date (dd/mm/yyyy):");
            String endDate = sc.nextLine();
            System.out.println("Industry:");
            String industry = sc.nextLine();
            System.out.println("Enter skills associated with this experience:");
            String skillChoice = "y";
            ArrayList<String> skills = new ArrayList<>();
            while (skillChoice.equalsIgnoreCase("y")){
                System.out.println("name of skill:");
                String currSkill=sc.nextLine();
                skills.add(currSkill);
                System.out.println("Add more skills (y/n)?");
                skillChoice=sc.nextLine();
            }
            exp1.setAllFields(title, employmentType, companyName, location, locationType,
                    currentlyWorking, startDate, endDate, industry, skills);
            user1.addExperience(exp1);
            System.out.println("Experience added. \nAdd more experiences (y/n)?");
            choice = sc.nextLine();
        }
        return user1;
    }

    public User inputEducationsInUser(Scanner sc,User user1){
        System.out.println("\nEnter EDUCATIONS:");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            Education ed1 = new Education();
            System.out.println("School name:");
            String school = sc.nextLine();
            System.out.println("Degree:");
            String degree = sc.nextLine();
            ed1.setSchool(school);
            ed1.setDegree(degree);
            user1.addEducation(ed1);
            System.out.println("Education added. \nAdd more educations (y/n)?");
            choice = sc.nextLine();
        }
        return user1;
    }

    public User inputVerificationsInUser(Scanner sc,User user1){
        System.out.println("\nPlease enter VERIFICATIONS details:");
        System.out.println("12-digit Aadhar no.:");
        String aadharno = sc.nextLine();
        System.out.println("Work email id:");
        String workmail = sc.nextLine();
        user1.setVerification(aadharno, workmail);
        return user1;
    }
}
