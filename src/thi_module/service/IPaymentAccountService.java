package thi_module.service;

import thi_module.model.PaymentAccount;
import thi_module.model.SavingsAccount;

import java.util.List;

public interface IPaymentAccountService {
    void addPayment(PaymentAccount paymentAccount);

    boolean deletePayment(String code);

    List<PaymentAccount> getPayment();

    List<PaymentAccount> searchPayment(String name);
}
