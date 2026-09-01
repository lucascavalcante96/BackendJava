package exerciciosPoo.ClassesAbstratas.Entities;

public class PessoaJuridica extends Pessoa {
    private int funcionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        if (funcionarios > 10) {
            return getRenda() * 0.14;
        } else {
            return getRenda() * 0.16;
        }
    }
}

