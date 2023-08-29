import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class JSONOutput implements Outputs {
    @Override
    public void savePersDetails(String filePath, PersDetails persDetails) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), persDetails);
    }

    @Override
    public void saveContactInfo(String filePath, ContactInfo contactInfo) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> contactInfoMap = new LinkedHashMap<String,Object>();
        contactInfoMap.put("Email",contactInfo.getEmail());
        contactInfoMap.put("Profile URL",contactInfo.getProfileURL());
        contactInfoMap.put("Phone No",contactInfo.getPhoneNo());
        contactInfoMap.put("Address",contactInfo.getAddress());
        contactInfoMap.put("Birthday",String.valueOf(contactInfo.getBirthday()));
        objectMapper.writeValue(new File(filePath), contactInfoMap);
    }

    @Override
    public void saveEducations(String filePath, ArrayList<Education> educations) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.createObjectNode();
        JsonNode edsNode = objectMapper.createArrayNode();
        for(Education ed:educations){
            Map<String,Object> edsMap = new LinkedHashMap<String,Object>();
            edsMap.put("school",ed.getSchool());
            edsMap.put("degree",ed.getDegree());
            ((ArrayNode) edsNode).add(String.valueOf(edsMap));
        }
        ((ObjectNode) rootNode).put("Educations",edsNode);
        objectMapper.writeValue(new File(filePath), rootNode);
    }

    @Override
    public void saveExperiences(String filePath, ArrayList<Experience> experiences) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode rootNode = objectMapper.createObjectNode();
        ArrayNode exsNode = objectMapper.createArrayNode();
        for(Experience ex:experiences){
            Map<String,Object> experiencesMap = new LinkedHashMap<String,Object>();
            experiencesMap.put("Title",ex.getTitle());
            experiencesMap.put("Employment Type",String.valueOf(ex.getEmploymentType()));
            experiencesMap.put("Company name",ex.getCompanyName());
            experiencesMap.put("Location",ex.getLocation());
            experiencesMap.put("Location Type",String.valueOf(ex.getLocationType()));
            experiencesMap.put("Currently working?",String.valueOf(ex.getCurrentlyWorking()));
            experiencesMap.put("Start date",String.valueOf(ex.getStartDate()));
            experiencesMap.put("End date",String.valueOf(ex.getEndDate()));
            experiencesMap.put("Industry",ex.getIndustry());
            experiencesMap.put("Skills",String.join("|",ex.getSkills()));
            exsNode.add(String.valueOf(experiencesMap));
        }
        rootNode.put("Experiences",exsNode);

        objectMapper.writeValue(new File(filePath), rootNode);
    }

    @Override
    public void saveVerification(String filePath, Verification verification) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), verification);
    }
}
