package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("-----------------------");
        list.remove("Flávio");
        list.removeIf(x -> x.charAt(0) == 'L');

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("-----------------------");

        System.out.println("Index of Maria " + list.indexOf("Marcia")); //como não existe irá retornar -1
        System.out.println("Index of Alex " + list.indexOf("Alex"));

        System.out.println("-----------------------");

        //filtrando uma lista para que me retorne uma nova lista com os itens que comecam com X parametro
        List<String> resultado =  list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        //primeiro converto a lista para stream, depois filtro fazendo uma funcao lambda e depois retorno para uma lista novamente
        //usando a funcao colect

        for (String str : resultado) {
            System.out.println(str);
        }

        //buscando o primeiro elemento que começa com G, caso contrario ele me retorna null
        String nome = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(nome);
    }

}
