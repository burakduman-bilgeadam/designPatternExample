package abstractFactory.init;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.BankFactory;
import abstractFactory.factory.LoanFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}//End of the FactoryCreator.
