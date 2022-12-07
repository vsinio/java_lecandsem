package Homework_1.students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class students {
    public static void main(String[] args) throws IOException {
        String fileName = "Homework_1/students/students.txt";
        String text = new String(Files.readAllBytes(Paths.get(fileName)));
        //System.out.println(text);
        String[] parts = text.replace("{", "")
                             .replace("}", "")
                             .replace("\"", "")
                             .split(",\n");
        ArrayList<String> value = new ArrayList<String>();
        for (String i : parts) {
            String[] parts2 = i.split(",");
            for (String k : parts2) {
                String[] parts3 = k.split(":");
                value.add(parts3[1]);
            }  
        //System.out.println(key.get(1));
        StringBuilder builder = new StringBuilder();
            for (int j = 0; j < value.size(); j += 3) {
                builder.append("Студент " + value.get(j) + " получил " + value.get(j + 1)
                    + " по предмету " + value.get(j + 2) + "\n");
            }
        System.out.println(builder.toString());           
        }
    }
}
