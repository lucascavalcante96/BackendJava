package ExercicioEstruturaRepetitiva;
// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
public class ex007 {
    static void main() {
        for (int i = 1; i <=50 ; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
