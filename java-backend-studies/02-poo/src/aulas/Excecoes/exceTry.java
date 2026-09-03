package aulas.Excessoes;


import java.util.InputMismatchException;
import java.util.Scanner;

//Praticando excessões do tipo Try-Catch
public class exceTry {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace(); // imprime em pilha de chamada o erro e onde que ele foi chamado ou quais metodos foram chamados até chegar no erro
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("End of program");
        sc.close();
    }
}
