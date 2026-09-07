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
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <=3; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePayment.interest(basicQuota, i);
            double fee = onlinePayment.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
