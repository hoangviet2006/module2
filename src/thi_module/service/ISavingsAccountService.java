package thi_module.service;

import thi_module.model.SavingsAccount;

import java.util.List;

public interface ISavingsAccountService {
    void addSavings(SavingsAccount savingsAccount);

    boolean deleteSaving(String name);

    List<SavingsAccount> getSaving();

    List<SavingsAccount> searchSaving(String name);

}
