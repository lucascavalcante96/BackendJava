package exerciciosPoo.vetores;

import exerciciosPoo.vetores.entities.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine
quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
 */
public class ex010 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Aluno[] alunos = new Aluno[30];
        double mediaAltura = 0.0;
        for(int i = 0; i < alunos.length; i++){
            System.out.printf("Digite a idade do %d aluno: ", i + 1);
            int idade = input.nextInt();
            System.out.printf("Digite a altura do %d aluno: ", i + 1);
            double altura = input.nextDouble();
            alunos[i] = new Aluno(idade, altura);
            mediaAltura += altura;
        }
        mediaAltura /= alunos.length;

        List<Aluno> alunosMediaAlturaMenor = new ArrayList<>();


        for(Aluno aluno: alunos){
            if (aluno.getAltura() < mediaAltura && aluno.getIdade() > 13){
                alunosMediaAlturaMenor.add(aluno);
            }
        }

        System.out.printf("Temos %d alunos com idade maior que 13 anos e altura menor que a media %.2f", alunosMediaAlturaMenor.size(), mediaAltura);

    }
}
