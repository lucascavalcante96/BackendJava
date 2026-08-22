package exerciciosPoo.Listas.Entities;

public class Suspeito {
    private String nome;
    private char telefonou;
    private char esteveNoLocal;
    private char moraPerto;
    private char devia;
    private char jaTrabalhou;

    public Suspeito(String nome, char telefonou, char esteveNoLocal, char moraPerto, char devia, char jaTrabalhou) {
        this.nome = nome;
        this.telefonou = telefonou;
        this.esteveNoLocal = esteveNoLocal;
        this.moraPerto = moraPerto;
        this.devia = devia;
        this.jaTrabalhou = jaTrabalhou;
    }

    int indiceDeParticipacao = 0;
    public void participouDoCrime(char telefonou, char esteveNoLocal, char moraPerto, char devia, char jaTrabalhou) {
        if (telefonou == 'S'){
            indiceDeParticipacao++;
        }if (esteveNoLocal == 'S'){
            indiceDeParticipacao++;
        }if (moraPerto == 'S'){
            indiceDeParticipacao++;
        }if (devia == 'S'){
            indiceDeParticipacao++;
        }if (jaTrabalhou == 'S'){
            indiceDeParticipacao++;
        }
    }

}
