package exerciciosPoo.ExInterface.Services;

import exerciciosPoo.ExInterface.Entities.Contract;
import exerciciosPoo.ExInterface.Entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePayment onlinePayment;
    public ContractService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, int months) {
        contract.getInstallments().add(new Installment(LocalDate.of(2026,10,25),206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2026,11,25),206.04));
    }
}
