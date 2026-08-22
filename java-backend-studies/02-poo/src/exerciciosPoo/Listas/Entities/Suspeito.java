package exerciciosPoo.Listas.Entities;

public class Suspeito {
    private String nome;
    private char telefonou;
    private char esteveNoLocal;
    private char moraPerto;
    private char devia;
    private char jaTrabalhou;
    private int participacao;
    private String culpado;


    public Suspeito(String nome, char telefonou, char esteveNoLocal, char moraPerto, char devia, char jaTrabalhou) {
        this.nome = nome;
        this.telefonou = telefonou;
        this.esteveNoLocal = esteveNoLocal;
        this.moraPerto = moraPerto;
        this.devia = devia;
        this.jaTrabalhou = jaTrabalhou;
        participacao = participouDoCrime(telefonou, esteveNoLocal,moraPerto, devia, jaTrabalhou);
        culpado = indiceDeParticipacao(participacao);
    }


    private int participouDoCrime(char telefonou, char esteveNoLocal, char moraPerto, char devia, char jaTrabalhou) {
        int indiceDeParticipacao = 0;
        if (Character.toLowerCase(telefonou) == 's'){
            indiceDeParticipacao++;
        }if (Character.toLowerCase(esteveNoLocal) == 's'){
            indiceDeParticipacao++;
        }if (Character.toLowerCase(moraPerto) == 's'){
            indiceDeParticipacao++;
        }if (Character.toLowerCase(devia) == 's'){
            indiceDeParticipacao++;
        }if (Character.toLowerCase(jaTrabalhou) == 's'){
            indiceDeParticipacao++;
        }
        return indiceDeParticipacao;
    }

    private String indiceDeParticipacao(int indiceDeParticipacao) {
        if (indiceDeParticipacao <= 1){
            return "Inocente";
        } else if (indiceDeParticipacao == 2){
            return "Suspeito";
        } else if (indiceDeParticipacao > 2 && indiceDeParticipacao <=4) {
            return "Cúmplice";
        }
        else {
            return "Assassino";
        }
    }

    @Override
    public String toString() {
        return "Suspeito{" + nome + " esta classificado como: " +  culpado + '}';
    }

}
