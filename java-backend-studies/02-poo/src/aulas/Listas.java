package aulas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    static void main() {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Gizele");
        list.add("Lucas");

        list.add(2, "Flávio");

        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
    }

}
