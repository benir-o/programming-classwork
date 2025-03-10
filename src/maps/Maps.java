package maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds= new HashMap<>();
//Use Java wrapper classes
        empIds.put("John",12345);
        empIds.put("Carl",54321);
        empIds.put("Kylian",13684);



        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("George"));

        empIds.put("Gladwell",23536);

        System.out.println(empIds);
    }
}
