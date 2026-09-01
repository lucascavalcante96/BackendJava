package exerciciosPoo.ClassesAbstratas.Entities;

public class PessoaFisica extends Pessoa {
    private double gastosSaude;

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    public PessoaFisica(String nome, double renda, double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if (getRenda() <= 20000.0) {
            return getRenda() * 1.25;
        }else{
            return (getRenda() * 0.25) - (getGastosSaude() * 0.5);
        }

    }
}
