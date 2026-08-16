package aulas;

public class Boxing {
    static void main() {
        int x = 20;
        // fazendo boxing
        Object obj = x;
        System.out.println(obj);

        //fazendo umboxing

        int y = (int) obj; // por não ser tipo compativeis é necessario fazer o casting
        System.out.println(y);
    }
}
