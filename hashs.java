import java.util.HashMap;
import java.util.Map;

public class hashs {
    public static void main(String[] args) {
       

    
        Map<String, Object> person = new HashMap<>();
        person.put("Name", "William");
        person.put("Age", 21);
        person.put("Sex", "M");

        int hashValue = h(person);
        System.out.println("Hash value: " + hashValue);
    }

    public static int h(Map<String, Object> person) {
        String name = (String) person.get("Name");
        int age = (int) person.get("Age");
        String sex = (String) person.get("Sex");

        int nameSum = 0;
        for (char c : name.toCharArray()) {
            nameSum += c;
        }

        int sexValue = (sex.equals("F")) ? 0 : 1;

        int hashValue = (nameSum + age + sexValue) % 6;
        return hashValue;
    }
};
   
    

