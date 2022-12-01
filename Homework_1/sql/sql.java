package Homework_1.sql;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;





public class sql {
    public static void main(String[] args) throws IOException {
        String fileName = "Homework_1/sql/sql.txt";
        String text = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] parts = text.replace("\"", "")
                             .replace(":", ",")
                             .split(",");
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<String> value = new ArrayList<String>();
        for (int i = 0; i < parts.length; i++) {
            if (i % 2 == 0) {
                key.add(parts[i]);
            }
            else {
                value.add(parts[i]);
            }  
        }
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM students WHERE ");
        for (int i = 0; i < key.size(); i++) {
            if (!value.get(i).equals("null")) {
                if (i > 0) builder.append(" AND");
                builder.append(key.get(i) + " = " + "\"" + value.get(i) + "\"");   
            }
        }
        System.out.println(builder.toString());
    }
}
