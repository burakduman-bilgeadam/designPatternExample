package abstractFactory.factory;

import abstractFactory.bank.Bank;
import abstractFactory.bank.HDFC;
import abstractFactory.bank.ICICI;
import abstractFactory.bank.SBI;
import abstractFactory.loan.Loan;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class.
