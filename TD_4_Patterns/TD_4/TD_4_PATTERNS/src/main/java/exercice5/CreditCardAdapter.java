package exercice5;

import java.awt.*;

public class CreditCardAdapter implements ICreditCard{

    BankDetails b =new BankDetails();

    public CreditCardAdapter() {
        b.setBankName("ING Bank");
        b.setAccountHolderName("Mr. and Ms. John Doe");
        b.setAccountNumber(123321);
    }

    @Override
    public String getICreditCardDetails() {
       return (b.getBankName() + " - " + b.getAccountHolderName() + " - " + b.getAccountNumber());
    }
}
