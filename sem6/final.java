package sem6;

import java.util.*;

public class final {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook();
        notebook1.color = "Space Grey";
        notebook1.OS = "MacOS";
        notebook1.model = "Apple";
        notebook1.RAM = 16;
        notebook1.SDD = 256;
        notebook1.price = 1500;

        Notebook notebook2 = new Notebook();
        notebook2.color = "Blue";
        notebook2.OS = "Windows";
        notebook2.model = "Lenovo";
        notebook2.RAM = 8;
        notebook2.SDD = 256;
        notebook2.price = 1100;

        Notebook notebook3 = new Notebook();
        notebook3.color = "white";
        notebook3.OS = "Linux";
        notebook3.model = "Acer";
        notebook3.RAM = 16;
        notebook3.SDD = 512;
        notebook3.price = 1300;

        Notebook notebook4 = new Notebook();
        notebook4.color = "black";
        notebook4.OS = "MacOS";
        notebook4.model = "Apple";
        notebook4.RAM = 16;
        notebook4.SDD = 512;
        notebook4.price = 1700;

        ArrayList<Notebook> newList = new ArrayList<>();
        newList.add(notebook1);
        newList.add(notebook2);
        newList.add(notebook3);
        newList.add(notebook4);

        searchVar(newList, userChoice());
    }

    public static void searchVar(ArrayList<Notebook> listObj, Map<String, String> userChoice) {
        ArrayList<Notebook> result = new ArrayList<>();
        if (userChoice.isEmpty()) {
            System.out.println("You have to insert at least 1 parameter!\n");
            searchVar(listObj, userChoice);
        } else {
            var fields = userChoice.keySet();
            for (Object field : fields) {
                for(Notebook obj: listObj) {
                    if (obj.parametrsMap().get(field.toString()).toString()
                            .equals(userChoice.get(field.toString()))) {
                        if(!result.contains(obj)) {
                            result.add(obj);
                        }
                    }
                }
            }
            for(Object field: fields) {
                ArrayList<Notebook> temp = new ArrayList<>(result);
                for (Notebook obj : temp) {
                    if (!obj.parametrsMap().get(field.toString()).toString()
                            .equals(userChoice.get(field.toString()))) {
                        result.remove(obj);
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println("Nothing was found, sorry");
            } else {
                for (Notebook obj : result) {
                    System.out.println("The result is : ");
                    System.out.println(obj);
                }
            }
        }
    }   

    private static Map<String, String> userChoice() {
        Scanner iSc = new Scanner(System.in);
        Map<String, String> dict = new HashMap<>();

        String temp;

        System.out.println("Введите цвет: color - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("color", temp);
        System.out.println("Введите ОС: OS - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("OS", temp);
        System.out.println("Введите модель: model - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("model", temp);
        System.out.println("Введите оперативку: RAM - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("RAM", temp);
        System.out.println("Введите память ссд: SDD - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("SDD", temp);
        System.out.println("Введите цену: price - ");
        temp = iSc.nextLine();
        if (temp != "")
            dict.put("price", temp);
        iSc.close();
        return dict;
    }
}