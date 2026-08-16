package aulas;

public class ForEach {
    static void main() {
        String[] vect = new String[]{"Lucas", "Maria", "Lourdes"};

        //usando o for comum:
        for (int i = 0; i < vect.length ; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------------");

        //utilizando o for each

        for(String str : vect) {
            System.out.println(str);
        }


    }
}
