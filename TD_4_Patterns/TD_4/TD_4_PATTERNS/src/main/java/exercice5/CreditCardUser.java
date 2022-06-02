package exercice5;

public class CreditCardUser {
    private ICreditCard creditCard;

    public void displayMyCreditCardDetails(){
        System.out.println(creditCard.getICreditCardDetails());
    }

    public CreditCardUser(ICreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
