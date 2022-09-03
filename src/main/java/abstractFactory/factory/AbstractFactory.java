package abstractFactory.factory;

import abstractFactory.bank.Bank;
import abstractFactory.loan.Loan;

public abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
