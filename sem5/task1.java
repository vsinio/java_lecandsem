package sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> multValMap = new HashMap<String, ArrayList<String>>();

        multValMap.put("человек1", new ArrayList<String>());
        multValMap.get("человек1").add("1234567");
        multValMap.get("человек1").add("0231234");
        multValMap.get("человек1").add("8885757");

        multValMap.put("человек 2", new ArrayList<String>());
        multValMap.get("человек 2").add("7474747");
        multValMap.get("человек 2").add("85858858");

        System.out.println(multValMap);
    }
}